/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2024年8月13日 下午10:55:11                       ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2024 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cms2lib.components;

import com.hisense.core.constants.HisenseCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.cms2lib.components.BannerComponent;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cms2lib.components.AdImagesComponent AdImagesComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAdImagesComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>AdImagesComponent.banners</code> attribute **/
	public static final String BANNERS = "banners";
	/** Relation ordering override parameter constants for BannersForAdImgComponent from ((hisensecore))*/
	protected static String BANNERSFORADIMGCOMPONENT_SRC_ORDERED = "relation.BannersForAdImgComponent.source.ordered";
	protected static String BANNERSFORADIMGCOMPONENT_TGT_ORDERED = "relation.BannersForAdImgComponent.target.ordered";
	/** Relation disable markmodifed parameter constants for BannersForAdImgComponent from ((hisensecore))*/
	protected static String BANNERSFORADIMGCOMPONENT_MARKMODIFIED = "relation.BannersForAdImgComponent.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdImagesComponent.banners</code> attribute.
	 * @return the banners
	 */
	public List<BannerComponent> getBanners(final SessionContext ctx)
	{
		final List<BannerComponent> items = getLinkedItems( 
			ctx,
			true,
			HisenseCoreConstants.Relations.BANNERSFORADIMGCOMPONENT,
			"BannerComponent",
			null,
			Utilities.getRelationOrderingOverride(BANNERSFORADIMGCOMPONENT_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdImagesComponent.banners</code> attribute.
	 * @return the banners
	 */
	public List<BannerComponent> getBanners()
	{
		return getBanners( getSession().getSessionContext() );
	}
	
	public long getBannersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			HisenseCoreConstants.Relations.BANNERSFORADIMGCOMPONENT,
			"BannerComponent",
			null
		);
	}
	
	public long getBannersCount()
	{
		return getBannersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdImagesComponent.banners</code> attribute. 
	 * @param value the banners
	 */
	public void setBanners(final SessionContext ctx, final List<BannerComponent> value)
	{
		setLinkedItems( 
			ctx,
			true,
			HisenseCoreConstants.Relations.BANNERSFORADIMGCOMPONENT,
			null,
			value,
			Utilities.getRelationOrderingOverride(BANNERSFORADIMGCOMPONENT_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(BANNERSFORADIMGCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdImagesComponent.banners</code> attribute. 
	 * @param value the banners
	 */
	public void setBanners(final List<BannerComponent> value)
	{
		setBanners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to banners. 
	 * @param value the item to add to banners
	 */
	public void addToBanners(final SessionContext ctx, final BannerComponent value)
	{
		addLinkedItems( 
			ctx,
			true,
			HisenseCoreConstants.Relations.BANNERSFORADIMGCOMPONENT,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(BANNERSFORADIMGCOMPONENT_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(BANNERSFORADIMGCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to banners. 
	 * @param value the item to add to banners
	 */
	public void addToBanners(final BannerComponent value)
	{
		addToBanners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from banners. 
	 * @param value the item to remove from banners
	 */
	public void removeFromBanners(final SessionContext ctx, final BannerComponent value)
	{
		removeLinkedItems( 
			ctx,
			true,
			HisenseCoreConstants.Relations.BANNERSFORADIMGCOMPONENT,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(BANNERSFORADIMGCOMPONENT_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(BANNERSFORADIMGCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from banners. 
	 * @param value the item to remove from banners
	 */
	public void removeFromBanners(final BannerComponent value)
	{
		removeFromBanners( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("BannerComponent");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(BANNERSFORADIMGCOMPONENT_MARKMODIFIED);
		}
		return true;
	}
	
}
