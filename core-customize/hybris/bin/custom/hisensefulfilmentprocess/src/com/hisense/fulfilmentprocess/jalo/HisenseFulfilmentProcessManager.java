/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hisense.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hisense.fulfilmentprocess.constants.HisenseFulfilmentProcessConstants;

public class HisenseFulfilmentProcessManager extends GeneratedHisenseFulfilmentProcessManager
{
	public static final HisenseFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (HisenseFulfilmentProcessManager) em.getExtension(HisenseFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
