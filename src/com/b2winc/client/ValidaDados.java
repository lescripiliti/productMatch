package com.b2winc.client;

import com.b2winc.GetItemPriceList_GetItemPriceListSoapPort_Client;
import com.b2winc.query.item.GetBasicItemInfoWS_GetBasicItemInfoWSSoapPort_Client;

public class ValidaDados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int productId = 7929890;
		
		GetBasicItemInfoWS_GetBasicItemInfoWSSoapPort_Client client = new GetBasicItemInfoWS_GetBasicItemInfoWSSoapPort_Client();
		System.out.println(client.getNBM(productId));
		
		GetItemPriceList_GetItemPriceListSoapPort_Client client2 = new GetItemPriceList_GetItemPriceListSoapPort_Client();
		//List<PriceInfo> listPrice = client2.getListPrice(productId);
		
		double averagePrice = client2.getAveragePrice(productId);
		System.out.println("Preço médio: "+averagePrice);
		
		
		
	}
}
