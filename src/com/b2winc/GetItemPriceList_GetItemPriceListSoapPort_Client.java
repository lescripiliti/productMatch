package com.b2winc;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.0.0 2014-06-04T18:24:06.828-03:00
 * Generated source version: 3.0.0
 * 
 */
public final class GetItemPriceList_GetItemPriceListSoapPort_Client {

	private static final QName SERVICE_NAME = new QName(
			"http://com/b2winc/product/pricing/webservice",
			"GetItemPriceListService");

	private static URL wsdlURL = GetItemPriceListService.WSDL_LOCATION;

	public GetItemPriceList_GetItemPriceListSoapPort_Client() {
	}

	public static void main(String args[]) throws java.lang.Exception {

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

		GetItemPriceListService ss = new GetItemPriceListService(wsdlURL,SERVICE_NAME);
		GetItemPriceList port = ss.getGetItemPriceListSoapPort();

		{
			System.out.println("Invoking getItemPriceList...");

			GetItemPriceListRequest request = new GetItemPriceListRequest();
			request.getItemId().add((long) 113280310);

			com.b2winc.GetItemPriceList_Type _getItemPriceList_parameters = new GetItemPriceList_Type();
			_getItemPriceList_parameters.setGetItemPriceListRequest(request);
			com.b2winc.GetItemPriceListResponse _getItemPriceList__return = port
					.getItemPriceList(_getItemPriceList_parameters);
			System.out.println("getItemPriceList.result="
					+ _getItemPriceList__return);
			List<PriceInfo> priceInfo = _getItemPriceList__return.getItemPriceListResponse.getPriceInfo();

			for (PriceInfo listPrice : priceInfo) {
				System.out.println("O pre�o �: "
						+ listPrice.getPrice().getSale().doubleValue());
			}

		}

		System.exit(0);
	}

	public double getAveragePrice(int productId) {
		GetItemPriceListService ss = new GetItemPriceListService(wsdlURL,SERVICE_NAME);
		GetItemPriceList port = ss.getGetItemPriceListSoapPort();

		{
			System.out.println("Invoking getItemPriceList...");

			GetItemPriceListRequest request = new GetItemPriceListRequest();
			request.getItemId().add((long) 113280310);

			com.b2winc.GetItemPriceList_Type _getItemPriceList_parameters = new GetItemPriceList_Type();
			_getItemPriceList_parameters.setGetItemPriceListRequest(request);
			com.b2winc.GetItemPriceListResponse _getItemPriceList__return = port
					.getItemPriceList(_getItemPriceList_parameters);
			System.out.println("getItemPriceList.result="
					+ _getItemPriceList__return);
			List<PriceInfo> priceInfo = _getItemPriceList__return.getItemPriceListResponse.getPriceInfo();

			int i = 0;
			double priceInfoTotal = 0;
			for (PriceInfo listPrice : priceInfo) {
				i++;
				priceInfoTotal += listPrice.getPrice().getSale().doubleValue();
			}
			return priceInfoTotal / i;
		}
	}

}