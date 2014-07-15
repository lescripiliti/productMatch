package com.b2wdigital.tools;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-07-10T11:27:36.388-03:00
 * Generated source version: 3.0.0
 * 
 */
@WebServiceClient(name = "ToolsWsServiceSoapBindingQSService", 
                  //wsdlLocation = "http://bus11g.b2w/ToolsServices/Proxy_Services/getProductionItemInfo?WSDL",
                    wsdlLocation = "C:\\Users\\leandro.felipe\\Documents\\GitHub\\productMatch\\src\\getProductionItemInfo.wsdl",
                  targetNamespace = "http://com/b2w/tools/ws") 
public class ToolsWsServiceSoapBindingQSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://com/b2w/tools/ws", "ToolsWsServiceSoapBindingQSService");
    public final static QName ToolsWsServiceSoapBindingQSPort = new QName("http://com/b2w/tools/ws", "ToolsWsServiceSoapBindingQSPort");
    static {
        URL url = null;
        try {
            //url = new URL("http://bus11g.b2w/ToolsServices/Proxy_Services/getProductionItemInfo?WSDL");
        	url = new URL("C:\\Users\\leandro.felipe\\Documents\\GitHub\\productMatch\\src\\getProductionItemInfo.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ToolsWsServiceSoapBindingQSService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://bus11g.b2w/ToolsServices/Proxy_Services/getProductionItemInfo?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public ToolsWsServiceSoapBindingQSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ToolsWsServiceSoapBindingQSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ToolsWsServiceSoapBindingQSService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
//    public ToolsWsServiceSoapBindingQSService(WebServiceFeature ... features) {
//        super(WSDL_LOCATION, SERVICE, features);
//    }
//
//    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
//    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
//    //compliant code instead.
//    public ToolsWsServiceSoapBindingQSService(URL wsdlLocation, WebServiceFeature ... features) {
//        super(wsdlLocation, SERVICE, features);
//    }
//
//    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
//    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
//    //compliant code instead.
//    public ToolsWsServiceSoapBindingQSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
//        super(wsdlLocation, serviceName, features);
//    }    

    /**
     *
     * @return
     *     returns ToolsWs
     */
    @WebEndpoint(name = "ToolsWsServiceSoapBindingQSPort")
    public ToolsWs getToolsWsServiceSoapBindingQSPort() {
        return super.getPort(ToolsWsServiceSoapBindingQSPort, ToolsWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ToolsWs
     */
    @WebEndpoint(name = "ToolsWsServiceSoapBindingQSPort")
    public ToolsWs getToolsWsServiceSoapBindingQSPort(WebServiceFeature... features) {
        return super.getPort(ToolsWsServiceSoapBindingQSPort, ToolsWs.class, features);
    }

}
