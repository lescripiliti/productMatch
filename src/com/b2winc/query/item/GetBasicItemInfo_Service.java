package com.b2winc.query.item;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-04T19:06:01.662-03:00
 * Generated source version: 3.0.0
 * 
 */
@WebServiceClient(name = "getBasicItemInfo", 
                  //wsdlLocation = "http://10.13.225.18/soa-infra/services/item/getItemBob/getBasicItemInfo?WSDL",
					wsdlLocation = "/Users/leandroscripiliti/Documents/workspace/b2w-match/src/getBasicItemInfoMKT.wsdl",
                  targetNamespace = "http://br/com/b2winc/service") 
public class GetBasicItemInfo_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://br/com/b2winc/service", "getBasicItemInfo");
    public final static QName GetBasicItemInfoWSPt = new QName("http://br/com/b2winc/service", "GetBasicItemInfoWS_pt");
    static {
        URL url = null;
        try {
            //url = new URL("http://10.13.225.18/soa-infra/services/item/getItemBob/getBasicItemInfo?WSDL");
        	url = new URL("/Users/leandroscripiliti/Documents/workspace/b2w-match/src/getBasicItemInfoMKT.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetBasicItemInfo_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://10.13.225.18/soa-infra/services/item/getItemBob/getBasicItemInfo?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public GetBasicItemInfo_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetBasicItemInfo_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetBasicItemInfo_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
//    public GetBasicItemInfo_Service(WebServiceFeature ... features) {
//        super(WSDL_LOCATION, SERVICE, features);
//    }
//
//    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
//    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
//    //compliant code instead.
//    public GetBasicItemInfo_Service(URL wsdlLocation, WebServiceFeature ... features) {
//        super(wsdlLocation, SERVICE, features);
//    }
//
//    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
//    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
//    //compliant code instead.
//    public GetBasicItemInfo_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
//        super(wsdlLocation, serviceName, features);
//    }    

    /**
     *
     * @return
     *     returns GetBasicItemInfoWS
     */
    @WebEndpoint(name = "GetBasicItemInfoWS_pt")
    public GetBasicItemInfoWS getGetBasicItemInfoWSPt() {
        return super.getPort(GetBasicItemInfoWSPt, GetBasicItemInfoWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetBasicItemInfoWS
     */
    @WebEndpoint(name = "GetBasicItemInfoWS_pt")
    public GetBasicItemInfoWS getGetBasicItemInfoWSPt(WebServiceFeature... features) {
        return super.getPort(GetBasicItemInfoWSPt, GetBasicItemInfoWS.class, features);
    }

}
