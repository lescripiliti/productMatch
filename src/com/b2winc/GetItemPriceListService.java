package com.b2winc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-04T18:24:06.889-03:00
 * Generated source version: 3.0.0
 * 
 */
@WebServiceClient(name = "GetItemPriceListService", 
                  //wsdlLocation = "http://bus11g.b2w/PricingServices/Proxy_Services/getItemPriceList?WSDL",
					wsdlLocation ="/Users/leandroscripiliti/Documents/workspace/b2w-match/src/getItemPriceList.wsdl",
                  targetNamespace = "http://com/b2winc/product/pricing/webservice") 
public class GetItemPriceListService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://com/b2winc/product/pricing/webservice", "GetItemPriceListService");
    public final static QName GetItemPriceListSoapPort = new QName("http://com/b2winc/product/pricing/webservice", "GetItemPriceListSoapPort");
    static {
        URL url = null;
        try {
            //url = new URL("http://bus11g.b2w/PricingServices/Proxy_Services/getItemPriceList?WSDL");
        	url = new URL("/Users/leandroscripiliti/Documents/workspace/b2w-match/src/getItemPriceList.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetItemPriceListService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://bus11g.b2w/PricingServices/Proxy_Services/getItemPriceList?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public GetItemPriceListService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetItemPriceListService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetItemPriceListService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
//    public GetItemPriceListService(WebServiceFeature ... features) {
//        super(WSDL_LOCATION, SERVICE, features);
//    }
//
//    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
//    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
//    //compliant code instead.
//    public GetItemPriceListService(URL wsdlLocation, WebServiceFeature ... features) {
//        super(wsdlLocation, SERVICE, features);
//    }
//
//    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
//    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
//    //compliant code instead.
//    public GetItemPriceListService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
//        super(wsdlLocation, serviceName, features);
//    }    

    /**
     *
     * @return
     *     returns GetItemPriceList
     */
    @WebEndpoint(name = "GetItemPriceListSoapPort")
    public GetItemPriceList getGetItemPriceListSoapPort() {
        return super.getPort(GetItemPriceListSoapPort, GetItemPriceList.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetItemPriceList
     */
    @WebEndpoint(name = "GetItemPriceListSoapPort")
    public GetItemPriceList getGetItemPriceListSoapPort(WebServiceFeature... features) {
        return super.getPort(GetItemPriceListSoapPort, GetItemPriceList.class, features);
    }

}
