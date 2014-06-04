
package com.b2winc.query.item;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.b2winc.query.item package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UDAId_QNAME = new QName("http://www.b2winc.com/item", "id");
    private final static QName _UDAValue_QNAME = new QName("http://www.b2winc.com/item", "value");
    private final static QName _UDAType_QNAME = new QName("http://www.b2winc.com/item", "type");
    private final static QName _GetBasicItemInfoRequest_QNAME = new QName("http://www.b2winc.com/getBasicItemInfo", "getBasicItemInfoRequest");
    private final static QName _Item_QNAME = new QName("http://www.b2winc.com/item", "item");
    private final static QName _GetBasicItemInfoResponse_QNAME = new QName("http://www.b2winc.com/getBasicItemInfo", "getBasicItemInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.b2winc.query.item
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MediaInfo }
     * 
     */
    public MediaInfo createMediaInfo() {
        return new MediaInfo();
    }

    /**
     * Create an instance of {@link MediaInfo.TrackList }
     * 
     */
    public MediaInfo.TrackList createMediaInfoTrackList() {
        return new MediaInfo.TrackList();
    }

    /**
     * Create an instance of {@link MediaInfo.TrackList.TrackInfo }
     * 
     */
    public MediaInfo.TrackList.TrackInfo createMediaInfoTrackListTrackInfo() {
        return new MediaInfo.TrackList.TrackInfo();
    }

    /**
     * Create an instance of {@link MediaInfo.TrackList.TrackInfo.PropertyList }
     * 
     */
    public MediaInfo.TrackList.TrackInfo.PropertyList createMediaInfoTrackListTrackInfoPropertyList() {
        return new MediaInfo.TrackList.TrackInfo.PropertyList();
    }

    /**
     * Create an instance of {@link MediaInfo.PropertyList }
     * 
     */
    public MediaInfo.PropertyList createMediaInfoPropertyList() {
        return new MediaInfo.PropertyList();
    }

    /**
     * Create an instance of {@link PriceInfo }
     * 
     */
    public PriceInfo createPriceInfo() {
        return new PriceInfo();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link SiteInfo }
     * 
     */
    public SiteInfo createSiteInfo() {
        return new SiteInfo();
    }

    /**
     * Create an instance of {@link Sku }
     * 
     */
    public Sku createSku() {
        return new Sku();
    }

    /**
     * Create an instance of {@link Sku.SkuPropertyList }
     * 
     */
    public Sku.SkuPropertyList createSkuSkuPropertyList() {
        return new Sku.SkuPropertyList();
    }

    /**
     * Create an instance of {@link Sku.LegacySkuIdList }
     * 
     */
    public Sku.LegacySkuIdList createSkuLegacySkuIdList() {
        return new Sku.LegacySkuIdList();
    }

    /**
     * Create an instance of {@link MerchandiseHierarchy }
     * 
     */
    public MerchandiseHierarchy createMerchandiseHierarchy() {
        return new MerchandiseHierarchy();
    }

    /**
     * Create an instance of {@link L10NItemProductionInfo }
     * 
     */
    public L10NItemProductionInfo createL10NItemProductionInfo() {
        return new L10NItemProductionInfo();
    }

    /**
     * Create an instance of {@link L10NItemProductionInfo.GroupList }
     * 
     */
    public L10NItemProductionInfo.GroupList createL10NItemProductionInfoGroupList() {
        return new L10NItemProductionInfo.GroupList();
    }

    /**
     * Create an instance of {@link L10NItemProductionInfo.GroupList.GroupInfo }
     * 
     */
    public L10NItemProductionInfo.GroupList.GroupInfo createL10NItemProductionInfoGroupListGroupInfo() {
        return new L10NItemProductionInfo.GroupList.GroupInfo();
    }

    /**
     * Create an instance of {@link ItemProductionInfo }
     * 
     */
    public ItemProductionInfo createItemProductionInfo() {
        return new ItemProductionInfo();
    }

    /**
     * Create an instance of {@link L10NItemBrandProductionInfo }
     * 
     */
    public L10NItemBrandProductionInfo createL10NItemBrandProductionInfo() {
        return new L10NItemBrandProductionInfo();
    }

    /**
     * Create an instance of {@link KitInfo }
     * 
     */
    public KitInfo createKitInfo() {
        return new KitInfo();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Item.ItemPropertyList }
     * 
     */
    public Item.ItemPropertyList createItemItemPropertyList() {
        return new Item.ItemPropertyList();
    }

    /**
     * Create an instance of {@link Item.LegacyItemIdList }
     * 
     */
    public Item.LegacyItemIdList createItemLegacyItemIdList() {
        return new Item.LegacyItemIdList();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link RatingInfo }
     * 
     */
    public RatingInfo createRatingInfo() {
        return new RatingInfo();
    }

    /**
     * Create an instance of {@link ArtistInfo }
     * 
     */
    public ArtistInfo createArtistInfo() {
        return new ArtistInfo();
    }

    /**
     * Create an instance of {@link ReleaseInfo }
     * 
     */
    public ReleaseInfo createReleaseInfo() {
        return new ReleaseInfo();
    }

    /**
     * Create an instance of {@link Diff }
     * 
     */
    public Diff createDiff() {
        return new Diff();
    }

    /**
     * Create an instance of {@link ExclusivityConstraint }
     * 
     */
    public ExclusivityConstraint createExclusivityConstraint() {
        return new ExclusivityConstraint();
    }

    /**
     * Create an instance of {@link EmbeddedSku }
     * 
     */
    public EmbeddedSku createEmbeddedSku() {
        return new EmbeddedSku();
    }

    /**
     * Create an instance of {@link LevelsSite }
     * 
     */
    public LevelsSite createLevelsSite() {
        return new LevelsSite();
    }

    /**
     * Create an instance of {@link PointPriceInfo }
     * 
     */
    public PointPriceInfo createPointPriceInfo() {
        return new PointPriceInfo();
    }

    /**
     * Create an instance of {@link SellableFlag }
     * 
     */
    public SellableFlag createSellableFlag() {
        return new SellableFlag();
    }

    /**
     * Create an instance of {@link ImageInfo }
     * 
     */
    public ImageInfo createImageInfo() {
        return new ImageInfo();
    }

    /**
     * Create an instance of {@link Replanishment }
     * 
     */
    public Replanishment createReplanishment() {
        return new Replanishment();
    }

    /**
     * Create an instance of {@link TaxInfo }
     * 
     */
    public TaxInfo createTaxInfo() {
        return new TaxInfo();
    }

    /**
     * Create an instance of {@link Levels }
     * 
     */
    public Levels createLevels() {
        return new Levels();
    }

    /**
     * Create an instance of {@link ExpirationInfo }
     * 
     */
    public ExpirationInfo createExpirationInfo() {
        return new ExpirationInfo();
    }

    /**
     * Create an instance of {@link SeeMoreInfo }
     * 
     */
    public SeeMoreInfo createSeeMoreInfo() {
        return new SeeMoreInfo();
    }

    /**
     * Create an instance of {@link SellingRankList }
     * 
     */
    public SellingRankList createSellingRankList() {
        return new SellingRankList();
    }

    /**
     * Create an instance of {@link SiteMerchandiseHierarchy }
     * 
     */
    public SiteMerchandiseHierarchy createSiteMerchandiseHierarchy() {
        return new SiteMerchandiseHierarchy();
    }

    /**
     * Create an instance of {@link TAG }
     * 
     */
    public TAG createTAG() {
        return new TAG();
    }

    /**
     * Create an instance of {@link SellingRank }
     * 
     */
    public SellingRank createSellingRank() {
        return new SellingRank();
    }

    /**
     * Create an instance of {@link DimensionInfo }
     * 
     */
    public DimensionInfo createDimensionInfo() {
        return new DimensionInfo();
    }

    /**
     * Create an instance of {@link LevelSite }
     * 
     */
    public LevelSite createLevelSite() {
        return new LevelSite();
    }

    /**
     * Create an instance of {@link UDA }
     * 
     */
    public UDA createUDA() {
        return new UDA();
    }

    /**
     * Create an instance of {@link SellingTitleInfo }
     * 
     */
    public SellingTitleInfo createSellingTitleInfo() {
        return new SellingTitleInfo();
    }

    /**
     * Create an instance of {@link DescriptionInfo }
     * 
     */
    public DescriptionInfo createDescriptionInfo() {
        return new DescriptionInfo();
    }

    /**
     * Create an instance of {@link NBMInfo }
     * 
     */
    public NBMInfo createNBMInfo() {
        return new NBMInfo();
    }

    /**
     * Create an instance of {@link SupplierInfo }
     * 
     */
    public SupplierInfo createSupplierInfo() {
        return new SupplierInfo();
    }

    /**
     * Create an instance of {@link GetBasicItemInfo }
     * 
     */
    public GetBasicItemInfo createGetBasicItemInfo() {
        return new GetBasicItemInfo();
    }

    /**
     * Create an instance of {@link GetBasicItemInfoRequest }
     * 
     */
    public GetBasicItemInfoRequest createGetBasicItemInfoRequest() {
        return new GetBasicItemInfoRequest();
    }

    /**
     * Create an instance of {@link GetBasicItemInfoResponse }
     * 
     */
    public GetBasicItemInfoResponse createGetBasicItemInfoResponse() {
        return new GetBasicItemInfoResponse();
    }

    /**
     * Create an instance of {@link GetBasicItemInfoResponse2 }
     * 
     */
    public GetBasicItemInfoResponse2 createGetBasicItemInfoResponse2() {
        return new GetBasicItemInfoResponse2();
    }

    /**
     * Create an instance of {@link MediaInfo.ArtistList }
     * 
     */
    public MediaInfo.ArtistList createMediaInfoArtistList() {
        return new MediaInfo.ArtistList();
    }

    /**
     * Create an instance of {@link MediaInfo.TrackList.TrackInfo.ArtistList }
     * 
     */
    public MediaInfo.TrackList.TrackInfo.ArtistList createMediaInfoTrackListTrackInfoArtistList() {
        return new MediaInfo.TrackList.TrackInfo.ArtistList();
    }

    /**
     * Create an instance of {@link MediaInfo.TrackList.TrackInfo.PropertyList.L10NPropertyInfo }
     * 
     */
    public MediaInfo.TrackList.TrackInfo.PropertyList.L10NPropertyInfo createMediaInfoTrackListTrackInfoPropertyListL10NPropertyInfo() {
        return new MediaInfo.TrackList.TrackInfo.PropertyList.L10NPropertyInfo();
    }

    /**
     * Create an instance of {@link MediaInfo.PropertyList.L10NPropertyInfo }
     * 
     */
    public MediaInfo.PropertyList.L10NPropertyInfo createMediaInfoPropertyListL10NPropertyInfo() {
        return new MediaInfo.PropertyList.L10NPropertyInfo();
    }

    /**
     * Create an instance of {@link PriceInfo.Price }
     * 
     */
    public PriceInfo.Price createPriceInfoPrice() {
        return new PriceInfo.Price();
    }

    /**
     * Create an instance of {@link PropertyType.ValueList }
     * 
     */
    public PropertyType.ValueList createPropertyTypeValueList() {
        return new PropertyType.ValueList();
    }

    /**
     * Create an instance of {@link SiteInfo.TAGList }
     * 
     */
    public SiteInfo.TAGList createSiteInfoTAGList() {
        return new SiteInfo.TAGList();
    }

    /**
     * Create an instance of {@link SiteInfo.RatingInfoList }
     * 
     */
    public SiteInfo.RatingInfoList createSiteInfoRatingInfoList() {
        return new SiteInfo.RatingInfoList();
    }

    /**
     * Create an instance of {@link SiteInfo.AcessoryList }
     * 
     */
    public SiteInfo.AcessoryList createSiteInfoAcessoryList() {
        return new SiteInfo.AcessoryList();
    }

    /**
     * Create an instance of {@link SiteInfo.CrossSellingList }
     * 
     */
    public SiteInfo.CrossSellingList createSiteInfoCrossSellingList() {
        return new SiteInfo.CrossSellingList();
    }

    /**
     * Create an instance of {@link Sku.ReplanishmentList }
     * 
     */
    public Sku.ReplanishmentList createSkuReplanishmentList() {
        return new Sku.ReplanishmentList();
    }

    /**
     * Create an instance of {@link Sku.EANList }
     * 
     */
    public Sku.EANList createSkuEANList() {
        return new Sku.EANList();
    }

    /**
     * Create an instance of {@link Sku.ManufacturerInfo }
     * 
     */
    public Sku.ManufacturerInfo createSkuManufacturerInfo() {
        return new Sku.ManufacturerInfo();
    }

    /**
     * Create an instance of {@link Sku.DiffList }
     * 
     */
    public Sku.DiffList createSkuDiffList() {
        return new Sku.DiffList();
    }

    /**
     * Create an instance of {@link Sku.SellableFlagList }
     * 
     */
    public Sku.SellableFlagList createSkuSellableFlagList() {
        return new Sku.SellableFlagList();
    }

    /**
     * Create an instance of {@link Sku.EmbeddedList }
     * 
     */
    public Sku.EmbeddedList createSkuEmbeddedList() {
        return new Sku.EmbeddedList();
    }

    /**
     * Create an instance of {@link Sku.SkuPropertyList.SkuProperty }
     * 
     */
    public Sku.SkuPropertyList.SkuProperty createSkuSkuPropertyListSkuProperty() {
        return new Sku.SkuPropertyList.SkuProperty();
    }

    /**
     * Create an instance of {@link Sku.LegacySkuIdList.LegacySkuIdData }
     * 
     */
    public Sku.LegacySkuIdList.LegacySkuIdData createSkuLegacySkuIdListLegacySkuIdData() {
        return new Sku.LegacySkuIdList.LegacySkuIdData();
    }

    /**
     * Create an instance of {@link MerchandiseHierarchy.SecondaryList }
     * 
     */
    public MerchandiseHierarchy.SecondaryList createMerchandiseHierarchySecondaryList() {
        return new MerchandiseHierarchy.SecondaryList();
    }

    /**
     * Create an instance of {@link L10NItemProductionInfo.GroupList.GroupInfo.PropertyList }
     * 
     */
    public L10NItemProductionInfo.GroupList.GroupInfo.PropertyList createL10NItemProductionInfoGroupListGroupInfoPropertyList() {
        return new L10NItemProductionInfo.GroupList.GroupInfo.PropertyList();
    }

    /**
     * Create an instance of {@link ItemProductionInfo.L10NItemBrandProductionList }
     * 
     */
    public ItemProductionInfo.L10NItemBrandProductionList createItemProductionInfoL10NItemBrandProductionList() {
        return new ItemProductionInfo.L10NItemBrandProductionList();
    }

    /**
     * Create an instance of {@link ItemProductionInfo.L10NItemProductionList }
     * 
     */
    public ItemProductionInfo.L10NItemProductionList createItemProductionInfoL10NItemProductionList() {
        return new ItemProductionInfo.L10NItemProductionList();
    }

    /**
     * Create an instance of {@link ItemProductionInfo.MediaList }
     * 
     */
    public ItemProductionInfo.MediaList createItemProductionInfoMediaList() {
        return new ItemProductionInfo.MediaList();
    }

    /**
     * Create an instance of {@link ItemProductionInfo.ImageList }
     * 
     */
    public ItemProductionInfo.ImageList createItemProductionInfoImageList() {
        return new ItemProductionInfo.ImageList();
    }

    /**
     * Create an instance of {@link L10NItemBrandProductionInfo.PropertyList }
     * 
     */
    public L10NItemBrandProductionInfo.PropertyList createL10NItemBrandProductionInfoPropertyList() {
        return new L10NItemBrandProductionInfo.PropertyList();
    }

    /**
     * Create an instance of {@link KitInfo.SkuKit }
     * 
     */
    public KitInfo.SkuKit createKitInfoSkuKit() {
        return new KitInfo.SkuKit();
    }

    /**
     * Create an instance of {@link Item.ExclusivityConstraintList }
     * 
     */
    public Item.ExclusivityConstraintList createItemExclusivityConstraintList() {
        return new Item.ExclusivityConstraintList();
    }

    /**
     * Create an instance of {@link Item.SellingTitleList }
     * 
     */
    public Item.SellingTitleList createItemSellingTitleList() {
        return new Item.SellingTitleList();
    }

    /**
     * Create an instance of {@link Item.DescriptionList }
     * 
     */
    public Item.DescriptionList createItemDescriptionList() {
        return new Item.DescriptionList();
    }

    /**
     * Create an instance of {@link Item.SiteDataInfo }
     * 
     */
    public Item.SiteDataInfo createItemSiteDataInfo() {
        return new Item.SiteDataInfo();
    }

    /**
     * Create an instance of {@link Item.PriceList }
     * 
     */
    public Item.PriceList createItemPriceList() {
        return new Item.PriceList();
    }

    /**
     * Create an instance of {@link Item.SkuList }
     * 
     */
    public Item.SkuList createItemSkuList() {
        return new Item.SkuList();
    }

    /**
     * Create an instance of {@link Item.ItemPropertyList.ItemProperty }
     * 
     */
    public Item.ItemPropertyList.ItemProperty createItemItemPropertyListItemProperty() {
        return new Item.ItemPropertyList.ItemProperty();
    }

    /**
     * Create an instance of {@link Item.LegacyItemIdList.LegacyItemIdData }
     * 
     */
    public Item.LegacyItemIdList.LegacyItemIdData createItemLegacyItemIdListLegacyItemIdData() {
        return new Item.LegacyItemIdList.LegacyItemIdData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/item", name = "id", scope = UDA.class)
    public JAXBElement<Long> createUDAId(Long value) {
        return new JAXBElement<Long>(_UDAId_QNAME, Long.class, UDA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/item", name = "value", scope = UDA.class)
    public JAXBElement<String> createUDAValue(String value) {
        return new JAXBElement<String>(_UDAValue_QNAME, String.class, UDA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/item", name = "type", scope = UDA.class)
    public JAXBElement<String> createUDAType(String value) {
        return new JAXBElement<String>(_UDAType_QNAME, String.class, UDA.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBasicItemInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/getBasicItemInfo", name = "getBasicItemInfoRequest")
    public JAXBElement<GetBasicItemInfoRequest> createGetBasicItemInfoRequest(GetBasicItemInfoRequest value) {
        return new JAXBElement<GetBasicItemInfoRequest>(_GetBasicItemInfoRequest_QNAME, GetBasicItemInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/item", name = "item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBasicItemInfoResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/getBasicItemInfo", name = "getBasicItemInfoResponse")
    public JAXBElement<GetBasicItemInfoResponse2> createGetBasicItemInfoResponse(GetBasicItemInfoResponse2 value) {
        return new JAXBElement<GetBasicItemInfoResponse2>(_GetBasicItemInfoResponse_QNAME, GetBasicItemInfoResponse2 .class, null, value);
    }

}
