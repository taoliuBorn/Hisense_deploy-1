/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hisense.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.hisense.core.constants.HisenseCoreConstants;
import com.hisense.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class HisenseCoreManager extends GeneratedHisenseCoreManager
{
	public static final HisenseCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (HisenseCoreManager) em.getExtension(HisenseCoreConstants.EXTENSIONNAME);
	}
}
