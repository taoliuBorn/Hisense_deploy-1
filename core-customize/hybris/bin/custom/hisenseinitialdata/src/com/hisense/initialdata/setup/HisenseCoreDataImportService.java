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

import de.hybris.platform.commerceservices.dataimport.impl.CoreDataImportService;
import org.apache.log4j.Logger;


/**
 * Implementation to handle specific Core Data Import services to hisense.
 */
public class HisenseCoreDataImportService extends CoreDataImportService
{

	public static final String HISENSE = "hisense";

	private static final Logger LOG = Logger.getLogger(HisenseCoreDataImportService.class);

	/**
	 * Imports store data related to hisense. Imports a site-override impex if available.
	 *
	 * @param extensionName
	 *           the extension name used.
	 * @param storeName
	 *           the store to import for.
	 * @pavvram productCatalogName
	 *           the product catalog used.
	 */
	@Override
	protected void importStore(final String extensionName, final String storeName, final String productCatalogName)
	{
		super.importStore(extensionName,storeName,productCatalogName);



	}


}
