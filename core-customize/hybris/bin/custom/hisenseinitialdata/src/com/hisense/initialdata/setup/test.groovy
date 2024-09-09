package com.hisense.core

import de.hybris.platform.servicelayer.model.ModelService
import de.hybris.platform.commerceservices.setup.SetupSyncJobService
import de.hybris.platform.catalog.model.CatalogVersionModel
import de.hybris.platform.servicelayer.cronjob.PerformResult
import de.hybris.platform.servicelayer.cronjob.CronJobService


// 获取 Spring Bean
def modelService = spring.getBean("modelService")
def syncJobService = spring.getBean("setupSyncJobService")
def cronJobService = spring.getBean("cronJobService")
def catalogVersionService = spring.getBean("catalogVersionService");

// 定义 CatalogVersion
def catalogVersion = catalogVersionService.getCatalogVersion("hisense-spaContentCatalog", "Staged")

// 创建并执行同步任务
def syncJob = syncJobService.createContentCatalogSyncJob("hisense-spaContentCatalog")
//def cronJob = modelService.create(syncJob.job.getCronJobModelType())
//cronJob.job = syncJob
//modelService.save(cronJob)
//
//// 执行同步任务
//PerformResult result = cronJobService.performCronJob(cronJob, true)
//println result.getStatus().getCode()

