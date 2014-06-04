
package com.b2winc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.b2winc package. 
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

    private final static QName _GetItemPriceListResponse_QNAME = new QName("http://www.b2winc.com/getItemPriceList", "getItemPriceListResponse");
    private final static QName _GetItemPriceListRequest_QNAME = new QName("http://www.b2winc.com/getItemPriceList", "getItemPriceListRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.b2winc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PriceInfo }
     * 
     */
    public PriceInfo createPriceInfo() {
        return new PriceInfo();
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
     * Create an instance of {@link GetItemPriceList_Type }
     * 
     */
    public GetItemPriceList_Type createGetItemPriceList_Type() {
        return new GetItemPriceList_Type();
    }

    /**
     * Create an instance of {@link GetItemPriceListRequest }
     * 
     */
    public GetItemPriceListRequest createGetItemPriceListRequest() {
        return new GetItemPriceListRequest();
    }

    /**
     * Create an instance of {@link GetItemPriceListResponse }
     * 
     */
    public GetItemPriceListResponse createGetItemPriceListResponse() {
        return new GetItemPriceListResponse();
    }

    /**
     * Create an instance of {@link GetItemPriceListResponse2 }
     * 
     */
    public GetItemPriceListResponse2 createGetItemPriceListResponse2() {
        return new GetItemPriceListResponse2();
    }

    /**
     * Create an instance of {@link PriceInfo.Price }
     * 
     */
    public PriceInfo.Price createPriceInfoPrice() {
        return new PriceInfo.Price();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemPriceListResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/getItemPriceList", name = "getItemPriceListResponse")
    public JAXBElement<GetItemPriceListResponse2> createGetItemPriceListResponse(GetItemPriceListResponse2 value) {
        return new JAXBElement<GetItemPriceListResponse2>(_GetItemPriceListResponse_QNAME, GetItemPriceListResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemPriceListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.b2winc.com/getItemPriceList", name = "getItemPriceListRequest")
    public JAXBElement<GetItemPriceListRequest> createGetItemPriceListRequest(GetItemPriceListRequest value) {
        return new JAXBElement<GetItemPriceListRequest>(_GetItemPriceListRequest_QNAME, GetItemPriceListRequest.class, null, value);
    }

}
