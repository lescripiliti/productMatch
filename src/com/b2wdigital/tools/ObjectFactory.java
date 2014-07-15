
package com.b2wdigital.tools;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.b2wdigital.tools package. 
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

    private final static QName _Item_QNAME = new QName("http://www.b2winc.com/item", "item");
    private final static QName _GetArtistInfoResponse_QNAME = new QName("http://www.b2winc.com/tools/getartistinfo", "getArtistInfoResponse");
    private final static QName _GetProductionItemInfoRequest_QNAME = new QName("http://www.b2winc.com/tools/getproductionitemInfo", "getProductionItemInfoRequest");
    private final static QName _GetProductIdsRequest_QNAME = new QName("http://www.b2winc.com/tools/getProductIds", "getProductIdsRequest");
    private final static QName _ItemPerson_QNAME = new QName("http://www.b2winc.com/ItemPerson", "ItemPerson");
    private final static QName _GetProductIdsResponse_QNAME = new QName("http://www.b2winc.com/tools/getProductIds", "getProductIdsResponse");
    private final static QName _GetProductionItemInfoResponse_QNAME = new QName("http://www.b2winc.com/tools/getproductionitemInfo", "getProductionItemInfoResponse");
    private final static QName _GetArtistInfoRequest_QNAME = new QName("http://www.b2winc.com/tools/getartistinfo", "getArtistInfoRequest");
    private final static QName _UDAId_QNAME = new QName("http://www.b2winc.com/item", "id");
    private final static QName _UDAValue_QNAME = new QName("http://www.b2winc.com/item", "value");
    private final static QName _UDAType_QNAME = new QName("http://www.b2winc.com/item", "type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.b2wdigital.tools
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MediaParticipationType }
     * 
     */
    public MediaParticipationType createMediaParticipationType() {
        return new MediaParticipationType();
    }

    /**
     * Create an instance of {@link RoleType }
     * 
     */
    public RoleType createRoleType() {
        return new RoleType();
    }

    /**
     * Create an instance of {@link ItemList }
     * 
     */
    public ItemList createItemList() {
        return new ItemList();
    }

    /**
     * Create an instance of {@link ItemPerson }
     * 
     */
    public ItemPerson createItemPerson() {
        return new ItemPerson();
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
     * Create an instance of {@link com.b2wdigital.tools.Item }
     * 
     */
    public com.b2wdigital.tools.Item createItem() {
        return new com.b2wdigital.tools.Item();
    }

    /**
     * Create an instance of {@link com.b2wdigital.tools.Item.ItemPropertyList }
     * 
     */
    public com.b2wdigital.tools.Item.ItemPropertyList createItemItemPropertyList() {
        return new com.b2wdigital.tools.Item.ItemPropertyList();
    }

    /**
     * Create an instance of {@link com.b2wdigital.tools.Item.LegacyItemIdList }
     * 
     */
    public com.b2wdigital.tools.Item.LegacyItemIdList createItemLegacyItemIdList() {
        return new com.b2wdigital.tools.Item.LegacyItemIdList();
    }

    /**
     * Create an instance of {@link GetProductionItemInfoResponse }
     * 
     */
    public GetProductionItemInfoResponse createGetProductionItemInfoResponse() {
        return new GetProductionItemInfoResponse();
    }

    /**
     * Create an instance of {@link GetProductionItemInfoResponse2 }
     * 
     */
    public GetProductionItemInfoResponse2 createGetProductionItemInfoResponse2() {
        return new GetProductionItemInfoResponse2();
    }

    /**
     * Create an instance of {@link GetProductIdsResponse }
     * 
     */
    public GetProductIdsResponse createGetProductIdsResponse() {
        return new GetProductIdsResponse();
    }

    /**
     * Create an instance of {@link GetProductIdsResponse2 }
     * 
     */
    public GetProductIdsResponse2 createGetProductIdsResponse2() {
        return new GetProductIdsResponse2();
    }

    /**
     * Create an instance of {@link GetArtistInfoResponse }
     * 
     */
    public GetArtistInfoResponse createGetArtistInfoResponse() {
        return new GetArtistInfoResponse();
    }

    /**
     * Create an instance of {@link GetArtistInfoResponse2 }
     * 
     */
    public GetArtistInfoResponse2 createGetArtistInfoResponse2() {
        return new GetArtistInfoResponse2();
    }

    /**
     * Create an instance of {@link GetProductIds }
     * 
     */
    public GetProductIds createGetProductIds() {
        return new GetProductIds();
    }

    /**
     * Create an instance of {@link GetProductIdsRequest }
     * 
     */
    public GetProductIdsRequest createGetProductIdsRequest() {
        return new GetProductIdsRequest();
    }

    /**
     * Create an instance of {@link GetProductionItemInfo }
     * 
     */
    public GetProductionItemInfo createGetProductionItemInfo() {
        return new GetProductionItemInfo();
    }

    /**
     * Create an instance of {@link GetArtistInfo }
     * 
     */
    public GetArtistInfo createGetArtistInfo() {
        return new GetArtistInfo();
    }

    /**
     * Create an instance of {@link GetArtistInfoRequest }
     * 
     */
    public GetArtistInfoRequest createGetArtistInfoRequest() {
        return new GetArtistInfoRequest();
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
     * Create an instance of {@link GetProductionItemInfoRequest }
     * 
     */
    public GetProductionItemInfoRequest createGetProductionItemInfoRequest() {
        return new GetProductionItemInfoRequest();
    }

    /**
     * Create an instance of {@link L10NBiography }
     * 
     */
    public L10NBiography createL10NBiography() {
        return new L10NBiography();
    }

    /**
     * Create an instance of {@link ParticipationType }
     * 
     */
    public ParticipationType createParticipationType() {
        return new ParticipationType();
    }

    /**
     * Create an instance of {@link Genre }
     * 
     */
    public Genre createGenre() {
        return new Genre();
    }

    /**
     * Create an instance of {@link GenreList }
     * 
     */
    public GenreList createGenreList() {
        return new GenreList();
    }

    /**
     * Create an instance of {@link MediaParticipationType.Roles }
     * 
     */
    public MediaParticipationType.Roles createMediaParticipationTypeRoles() {
        return new MediaParticipationType.Roles();
    }

    /**
     * Create an instance of {@link RoleType.Participations }
     * 
     */
    public RoleType.Participations createRoleTypeParticipations() {
        return new RoleType.Participations();
    }

    /**
     * Create an instance of {@link ItemList.Item }
     * 
     */
    public ItemList.Item createItemListItem() {
        return new ItemList.Item();
    }

    /**
     * Create an instance of {@link ItemPerson.ParticipationList }
     * 
     */
    public ItemPerson.ParticipationList createItemPersonParticipationList() {
        return new ItemPerson.ParticipationList();
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
     * Create an instance of {@link com.b2wdigital.tools.Item.ExclusivityConstraintList }
     * 
     */
    public com.b2wdigital.tools.Item.ExclusivityConstraintList createItemExclusivityConstraintList() {
        return new com.b2wdigital.tools.Item.ExclusivityConstraintList();
    }

    /**
     * Create an instance of {@link com.b2wdigital.tools.Item.SellingTitleList }
     * 
     */
    public com.b2wdigital.tools.Item.SellingTitleList createItemSellingTitleList() {
        return new com.b2wdigital.tools.Item.SellingTitleList();
    }

    /**
     * Create an instance of {@link com.b2wdigital.tools.Item.DescriptionList }
     * 
     */
    public com.b2wdigital.tools.Item.DescriptionList createItemDescriptionList() {
        return new com.b2wdigital.tools.Item.DescriptionList();
    }

    /**
     * Create an instance of {@link com.b2wdigital.tools.Item.SiteDataInfo }
     * 
     */
    public com.b2wdigital.tools.Item.SiteDataInfo createItemSiteDataInfo() {
        return new com.b2wdigital.tools.Item.SiteDataInfo();
    }

    /**
     * Create an instance of {@link com.b2wdigital.tools.Item.PriceList }
     * 
     */
    public com.b2wdigital.tools.Item.PriceList createItemPriceList() {
        return new com.b2wdigital.tools.Item.PriceList();
    }

    /**
     * Create an instance of {@link com.b2wdigital.tools.Item.SkuList }
     * 
     */
    public com.b2wdigital.tools.Item.SkuList createItemSkuList() {
        return new com.b2wdigital.tools.Item.SkuList();
    }

    /**
     * Create an instance of {@link com.b2wdigital.tools.Item.ItemPropertyList.ItemProperty }
     * 
     */
    public com.b2wdigital.tools.Item.ItemPropertyList.ItemProperty createItemItemPropertyListItemProperty() {
        return new com.b2wdigital.tools.Item.ItemPropertyList.ItemProperty();
    }

    /**
     * Create an instance of {@link com.b2wdigital.tools.Item.LegacyItemIdList.LegacyItemIdData }
     * 
     */
    public com.b2wdigital.tools.Item.LegacyItemIdList.LegacyItemIdData createItemLegacyItemIdListLegacyItemIdData() {
        return new com.b2wdigital.tools.Item.LegacyItemIdList.LegacyItemIdData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.b2wdigital.tools.Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/item", name = "item")
    public JAXBElement<com.b2wdigital.tools.Item> createItem(com.b2wdigital.tools.Item value) {
        return new JAXBElement<com.b2wdigital.tools.Item>(_Item_QNAME, com.b2wdigital.tools.Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArtistInfoResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/tools/getartistinfo", name = "getArtistInfoResponse")
    public JAXBElement<GetArtistInfoResponse2> createGetArtistInfoResponse(GetArtistInfoResponse2 value) {
        return new JAXBElement<GetArtistInfoResponse2>(_GetArtistInfoResponse_QNAME, GetArtistInfoResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductionItemInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/tools/getproductionitemInfo", name = "getProductionItemInfoRequest")
    public JAXBElement<GetProductionItemInfoRequest> createGetProductionItemInfoRequest(GetProductionItemInfoRequest value) {
        return new JAXBElement<GetProductionItemInfoRequest>(_GetProductionItemInfoRequest_QNAME, GetProductionItemInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductIdsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/tools/getProductIds", name = "getProductIdsRequest")
    public JAXBElement<GetProductIdsRequest> createGetProductIdsRequest(GetProductIdsRequest value) {
        return new JAXBElement<GetProductIdsRequest>(_GetProductIdsRequest_QNAME, GetProductIdsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/ItemPerson", name = "ItemPerson")
    public JAXBElement<ItemPerson> createItemPerson(ItemPerson value) {
        return new JAXBElement<ItemPerson>(_ItemPerson_QNAME, ItemPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductIdsResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/tools/getProductIds", name = "getProductIdsResponse")
    public JAXBElement<GetProductIdsResponse2> createGetProductIdsResponse(GetProductIdsResponse2 value) {
        return new JAXBElement<GetProductIdsResponse2>(_GetProductIdsResponse_QNAME, GetProductIdsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductionItemInfoResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/tools/getproductionitemInfo", name = "getProductionItemInfoResponse")
    public JAXBElement<GetProductionItemInfoResponse2> createGetProductionItemInfoResponse(GetProductionItemInfoResponse2 value) {
        return new JAXBElement<GetProductionItemInfoResponse2>(_GetProductionItemInfoResponse_QNAME, GetProductionItemInfoResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArtistInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/tools/getartistinfo", name = "getArtistInfoRequest")
    public JAXBElement<GetArtistInfoRequest> createGetArtistInfoRequest(GetArtistInfoRequest value) {
        return new JAXBElement<GetArtistInfoRequest>(_GetArtistInfoRequest_QNAME, GetArtistInfoRequest.class, null, value);
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

}
