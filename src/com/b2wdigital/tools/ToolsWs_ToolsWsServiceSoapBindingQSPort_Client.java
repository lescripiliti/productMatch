
package com.b2wdigital.tools;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-07-10T11:27:36.342-03:00
 * Generated source version: 3.0.0
 * 
 */
public final class ToolsWs_ToolsWsServiceSoapBindingQSPort_Client {

    private static final QName SERVICE_NAME = new QName("http://com/b2w/tools/ws", "ToolsWsServiceSoapBindingQSService");

    private ToolsWs_ToolsWsServiceSoapBindingQSPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ToolsWsServiceSoapBindingQSService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ToolsWsServiceSoapBindingQSService ss = new ToolsWsServiceSoapBindingQSService(wsdlURL, SERVICE_NAME);
        ToolsWs port = ss.getToolsWsServiceSoapBindingQSPort();  
        
        {
//        System.out.println("Invoking getProductIds...");
//        com.b2wdigital.tools.GetProductIds _getProductIds_parameters = null;
//        com.b2wdigital.tools.GetProductIdsResponse _getProductIds__return = port.getProductIds(_getProductIds_parameters);
//        System.out.println("getProductIds.result=" + _getProductIds__return);


        }
        {
//        System.out.println("Invoking getArtistInfo...");
//        com.b2wdigital.tools.GetArtistInfo _getArtistInfo_parameters = null;
//        com.b2wdigital.tools.GetArtistInfoResponse _getArtistInfo__return = port.getArtistInfo(_getArtistInfo_parameters);
//        System.out.println("getArtistInfo.result=" + _getArtistInfo__return);


        }
        {
        System.out.println("Invoking getProductionItemInfo...");
        com.b2wdigital.tools.GetProductionItemInfo _getProductionItemInfo_parameters = new GetProductionItemInfo();
        //_getProductionItemInfo_parameters.setItemId(new Long(7990263));
        _getProductionItemInfo_parameters.setItemId(new Long(7989680));
        com.b2wdigital.tools.GetProductionItemInfoResponse _getProductionItemInfo__return = port.getProductionItemInfo(_getProductionItemInfo_parameters);
        System.out.println(_getProductionItemInfo__return.getGetProductionItemInfoResponse().getItem());
        System.out.println("getProductionItemInfo.result=" + _getProductionItemInfo__return.getGetProductionItemInfoResponse().getItem().getSellingTitleList().getL10NSellingTitleInfo().get(0).getSellingTitle());

        }

        System.exit(0);
    }

}