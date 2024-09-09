/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.hisense.initialdata.setup;

import com.hisense.initialdata.constants.HisenseInitialDataConstants;
import de.hybris.platform.catalog.jalo.SyncItemCronJob;
import de.hybris.platform.catalog.jalo.SyncItemJob;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.catalog.model.SyncItemJobModel;
import de.hybris.platform.commerceservices.dataimport.impl.SampleDataImportService;
import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.commerceservices.setup.data.ImportData;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;
import java.util.Map;


/**
 * Implementation to handle specific Sample Data Import services to hisense.
 */
public class HisenseSampleDataImportService extends SampleDataImportService
{

	private static final Logger LOG = Logger.getLogger(HisenseSampleDataImportService.class);

	private static final String CONTENT_CATALOG = "hisense-spa";

	private ModelService modelService;


	@Override
	public void execute(AbstractSystemSetup systemSetup, SystemSetupContext context, List<ImportData> importData) {
		super.execute(systemSetup, context, importData);
		if(context.getExtensionName().equalsIgnoreCase(HisenseInitialDataConstants.EXTENSIONNAME)){
			this.importExtraData(context,systemSetup);
		}
	}





	/**
	 * Imports the data related to ExtraData.
	 *
	 * @param context
	 *           the context used.
	 */
	private void importExtraData(SystemSetupContext context,AbstractSystemSetup systemSetup) {
		final String extensionName = context.getExtensionName();


		getSetupImpexService().importImpexFile(String.format("/%s/import/spa/contentCatalogs/hisenseContentCatalog/catalog.impex", extensionName),false);

		getSetupImpexService().importImpexFile(String.format("/%s/import/spa/stores/hisense/site.impex", extensionName), false);

		final CatalogVersionModel catalog = getCatalogVersionService().getCatalogVersion( "hisense-spaContentCatalog", "Staged");
		List<SyncItemJobModel> synItemsJobs = catalog.getIncomingSynchronizations();
		if (synItemsJobs.size() > 0)
		{
			SyncItemJobModel job = synItemsJobs.get(0);
			final SyncItemJob jobItem = getModelService().getSource(job);
			synchronizeSpaContentCatalog(context, jobItem,systemSetup);
		}

		getSetupImpexService().importImpexFile(String.format("/%s/import/spa/contentCatalogs/hisenseContentCatalog/cleaning.impex", extensionName),false);

		getSetupImpexService().importImpexFile(String.format("/%s/import/spa/contentCatalogs/hisenseContentCatalog/solr.impex", extensionName),false);

		getSetupImpexService().importImpexFile(String.format("/%s/import/spa/contentCatalogs/hisenseContentCatalog/cms-responsive-content.impex", extensionName),false);

		synchronizeContentCatalog(systemSetup,context, CONTENT_CATALOG, true);

		getSetupImpexService().importImpexFile(String.format("/%s/import/spa/contentCatalogs/hisenseContentCatalog/sync.impex", extensionName),false);

		getSetupImpexService().importImpexFile(String.format("/%s/import/spa/contentCatalogs/hisenseContentCatalog/email-content.impex", extensionName),false);



	}


	private void synchronizeSpaContentCatalog(final SystemSetupContext context, final SyncItemJob syncJobItem,AbstractSystemSetup systemSetup)
	{
		systemSetup.logInfo(context, " Begin synchronizing Content Catalog [" + CONTENT_CATALOG + "] - synchronizing");

		final SyncItemCronJob syncCronJob = syncJobItem.newExecution();
		syncCronJob.setLogToDatabase(false);
		syncCronJob.setLogToFile(true);
		syncCronJob.setForceUpdate(false);
		syncJobItem.configureFullVersionSync(syncCronJob);

		systemSetup.logInfo(context, " Starting synchronization, this may take a while ...");
		syncJobItem.perform(syncCronJob, true);

		systemSetup.logInfo(context, " Synchronization complete for catalog [" + CONTENT_CATALOG + "]");
		final CronJobResult result = modelService.get(syncCronJob.getResult());
		final CronJobStatus status = modelService.get(syncCronJob.getStatus());

		final PerformResult syncCronJobResult = new PerformResult(result, status);
		if (isSyncRerunNeeded(syncCronJobResult))
		{
			systemSetup.logInfo(context, " Catalog catalog [" + CONTENT_CATALOG + "] sync has issues.");
		}

		systemSetup.logInfo(context, " Done synchronizing  Content Catalog [" + CONTENT_CATALOG + "]");
	}



	@Override
	public boolean synchronizeProductCatalog(AbstractSystemSetup systemSetup, SystemSetupContext context, String catalogName, boolean syncCatalogs) {
		systemSetup.logInfo(context, String.format("Skip synchronizing Product Catalog [%s]", catalogName));
		return true;
	}

	@Override
	public boolean synchronizeContentCatalog(AbstractSystemSetup systemSetup, SystemSetupContext context, String catalogName, boolean syncCatalogs) {

		systemSetup.logInfo(context, " Begin synchronizing Content Catalog [" + catalogName + "] - ");

		systemSetup.createContentCatalogSyncJob(context, catalogName + "ContentCatalog");

		boolean result = true;
		final PerformResult syncCronJobResult = systemSetup.executeCatalogSyncJob(context, catalogName + "ContentCatalog");
		if (isSyncRerunNeeded(syncCronJobResult))
		{
			systemSetup.logInfo(context, " Catalog catalog [" + catalogName + "] sync has issues.");
			result = false;
		}

		systemSetup.logInfo(context, " Done ,"  + " Content Catalog [" + catalogName + "]");
		return result;

	}

	public ModelService getModelService() {
		return modelService;
	}

	@Required
	public void setModelService(ModelService modelService) {
		this.modelService = modelService;
	}

}
