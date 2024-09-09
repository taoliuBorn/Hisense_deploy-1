/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2024年8月13日 下午10:55:11                       ---
 * ----------------------------------------------------------------
 */
package com.hisense.core.jalo;

import com.hisense.core.constants.HisenseCoreConstants;
import com.hisense.core.jalo.HisenseColorVariantProduct;
import com.hisense.core.jalo.HisenseSizeVariantProduct;
import de.hybris.platform.cms2lib.components.AbstractBannerComponent;
import de.hybris.platform.cms2lib.components.AdImagesComponent;
import de.hybris.platform.cms2lib.components.BannerComponent;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>HisenseCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedHisenseCoreManager extends Extension
{
	/** Relation ordering override parameter constants for BannersForAdImgComponent from ((hisensecore))*/
	protected static String BANNERSFORADIMGCOMPONENT_SRC_ORDERED = "relation.BannersForAdImgComponent.source.ordered";
	protected static String BANNERSFORADIMGCOMPONENT_TGT_ORDERED = "relation.BannersForAdImgComponent.target.ordered";
	/** Relation disable markmodifed parameter constants for BannersForAdImgComponent from ((hisensecore))*/
	protected static String BANNERSFORADIMGCOMPONENT_MARKMODIFIED = "relation.BannersForAdImgComponent.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("productType", AttributeMode.INITIAL);
		tmp.put("screenSet", AttributeMode.INITIAL);
		tmp.put("year", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BannerComponent.adImgComponent</code> attribute.
	 * @return the adImgComponent
	 */
	public Collection<AdImagesComponent> getAdImgComponent(final SessionContext ctx, final BannerComponent item)
	{
		final List<AdImagesComponent> items = item.getLinkedItems( 
			ctx,
			false,
			HisenseCoreConstants.Relations.BANNERSFORADIMGCOMPONENT,
			"AdImagesComponent",
			null,
			Utilities.getRelationOrderingOverride(BANNERSFORADIMGCOMPONENT_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BannerComponent.adImgComponent</code> attribute.
	 * @return the adImgComponent
	 */
	public Collection<AdImagesComponent> getAdImgComponent(final BannerComponent item)
	{
		return getAdImgComponent( getSession().getSessionContext(), item );
	}
	
	public long getAdImgComponentCount(final SessionContext ctx, final BannerComponent item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			HisenseCoreConstants.Relations.BANNERSFORADIMGCOMPONENT,
			"AdImagesComponent",
			null
		);
	}
	
	public long getAdImgComponentCount(final BannerComponent item)
	{
		return getAdImgComponentCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BannerComponent.adImgComponent</code> attribute. 
	 * @param value the adImgComponent
	 */
	public void setAdImgComponent(final SessionContext ctx, final BannerComponent item, final Collection<AdImagesComponent> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			HisenseCoreConstants.Relations.BANNERSFORADIMGCOMPONENT,
			null,
			value,
			Utilities.getRelationOrderingOverride(BANNERSFORADIMGCOMPONENT_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(BANNERSFORADIMGCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BannerComponent.adImgComponent</code> attribute. 
	 * @param value the adImgComponent
	 */
	public void setAdImgComponent(final BannerComponent item, final Collection<AdImagesComponent> value)
	{
		setAdImgComponent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to adImgComponent. 
	 * @param value the item to add to adImgComponent
	 */
	public void addToAdImgComponent(final SessionContext ctx, final BannerComponent item, final AdImagesComponent value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			HisenseCoreConstants.Relations.BANNERSFORADIMGCOMPONENT,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(BANNERSFORADIMGCOMPONENT_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(BANNERSFORADIMGCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to adImgComponent. 
	 * @param value the item to add to adImgComponent
	 */
	public void addToAdImgComponent(final BannerComponent item, final AdImagesComponent value)
	{
		addToAdImgComponent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from adImgComponent. 
	 * @param value the item to remove from adImgComponent
	 */
	public void removeFromAdImgComponent(final SessionContext ctx, final BannerComponent item, final AdImagesComponent value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			HisenseCoreConstants.Relations.BANNERSFORADIMGCOMPONENT,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(BANNERSFORADIMGCOMPONENT_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(BANNERSFORADIMGCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from adImgComponent. 
	 * @param value the item to remove from adImgComponent
	 */
	public void removeFromAdImgComponent(final BannerComponent item, final AdImagesComponent value)
	{
		removeFromAdImgComponent( getSession().getSessionContext(), item, value );
	}
	
	public AdImagesComponent createAdImagesComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HisenseCoreConstants.TC.ADIMAGESCOMPONENT );
			return (AdImagesComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AdImagesComponent : "+e.getMessage(), 0 );
		}
	}
	
	public AdImagesComponent createAdImagesComponent(final Map attributeValues)
	{
		return createAdImagesComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public HisenseColorVariantProduct createHisenseColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HisenseCoreConstants.TC.HISENSECOLORVARIANTPRODUCT );
			return (HisenseColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating HisenseColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public HisenseColorVariantProduct createHisenseColorVariantProduct(final Map attributeValues)
	{
		return createHisenseColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public HisenseSizeVariantProduct createHisenseSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HisenseCoreConstants.TC.HISENSESIZEVARIANTPRODUCT );
			return (HisenseSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating HisenseSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public HisenseSizeVariantProduct createHisenseSizeVariantProduct(final Map attributeValues)
	{
		return createHisenseSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return HisenseCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productType</code> attribute.
	 * @return the productType
	 */
	public String getProductType(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, HisenseCoreConstants.Attributes.Product.PRODUCTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productType</code> attribute.
	 * @return the productType
	 */
	public String getProductType(final Product item)
	{
		return getProductType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productType</code> attribute. 
	 * @param value the productType
	 */
	public void setProductType(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, HisenseCoreConstants.Attributes.Product.PRODUCTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productType</code> attribute. 
	 * @param value the productType
	 */
	public void setProductType(final Product item, final String value)
	{
		setProductType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.screenSet</code> attribute.
	 * @return the screenSet
	 */
	public Set<String> getScreenSet(final SessionContext ctx, final Product item)
	{
		Set<String> coll = (Set<String>)item.getProperty( ctx, HisenseCoreConstants.Attributes.Product.SCREENSET);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.screenSet</code> attribute.
	 * @return the screenSet
	 */
	public Set<String> getScreenSet(final Product item)
	{
		return getScreenSet( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.screenSet</code> attribute. 
	 * @param value the screenSet
	 */
	public void setScreenSet(final SessionContext ctx, final Product item, final Set<String> value)
	{
		item.setProperty(ctx, HisenseCoreConstants.Attributes.Product.SCREENSET,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.screenSet</code> attribute. 
	 * @param value the screenSet
	 */
	public void setScreenSet(final Product item, final Set<String> value)
	{
		setScreenSet( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.year</code> attribute.
	 * @return the year
	 */
	public String getYear(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, HisenseCoreConstants.Attributes.Product.YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.year</code> attribute.
	 * @return the year
	 */
	public String getYear(final Product item)
	{
		return getYear( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, HisenseCoreConstants.Attributes.Product.YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final Product item, final String value)
	{
		setYear( getSession().getSessionContext(), item, value );
	}
	
}
