package com.b2winc.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.xml.namespace.QName;

import com.b2wdigital.tools.GetProductionItemInfo;
import com.b2wdigital.tools.ToolsWs;
import com.b2wdigital.tools.ToolsWsServiceSoapBindingQSService;

public class ConsultaItensTools {

	static URL wsdlURL = ToolsWsServiceSoapBindingQSService.WSDL_LOCATION;
    private static final QName SERVICE_NAME = new QName("http://com/b2w/tools/ws", "ToolsWsServiceSoapBindingQSService");
	static String filePath = "";
    
	public static void main(String[] args) {
		
		System.out.println("Informe o caminho completo e o nome do arquivo, (sem o formato .csv)");
		Scanner scanner = new Scanner(System.in);
		filePath = scanner.nextLine();
		if(filePath == null){
			System.exit(0);
		}
		
		//String fileName = "product-ciadosom"; //sem o .csv
		
		System.out.println("Informe o caminho do arquivo que contem os itens");
		
		
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
		
		//List<String> byCSVFile = getProductsByCSVFile("C:\\Users\\leandro.felipe\\Documents\\GitHub\\productMatch\\src\\"+fileName+".csv");
	    List<String> byCSVFile = getProductsByCSVFile(filePath+".csv");
		
	    Map<String, String> itensByMap = getItensByMap(byCSVFile);
	    createCsvFile(filePath+"-tools.csv",itensByMap, 9999);
		
	    //createCsvFile("C:\\Users\\leandro.felipe\\Documents\\GitHub\\productMatch\\src\\"+fileName+"-tools.csv",itensTools);
		System.out.println("[ Processo finalizado com sucesso ]");
	}

	private static Map<String, String> getItensByMap(List<String> byCSVFile) {
		Map<String, String> itensTollsMap = new HashMap<String, String>();
		
		ToolsWsServiceSoapBindingQSService ss = new ToolsWsServiceSoapBindingQSService(wsdlURL, SERVICE_NAME);
        ToolsWs port = ss.getToolsWsServiceSoapBindingQSPort();  
		int i = 0;
		com.b2wdigital.tools.GetProductionItemInfo _getProductionItemInfo_parameters = new GetProductionItemInfo();
		for(String item:byCSVFile){
			if(item == null || item.equals("")){
				continue;
			}
			System.out.println("[ Consulta no."+i+" item "+item+" ]");
			_getProductionItemInfo_parameters.setItemId(new Long(item));
			com.b2wdigital.tools.GetProductionItemInfoResponse _getProductionItemInfo__return = port.getProductionItemInfo(_getProductionItemInfo_parameters);
	        if(_getProductionItemInfo__return.getGetProductionItemInfoResponse().getItem() == null){
	        	itensTollsMap.put(item, "NAO EXISTE NA TOOLS");
	        }else{
	        	itensTollsMap.put(item, _getProductionItemInfo__return.getGetProductionItemInfoResponse().getItem().getSellingTitleList().getL10NSellingTitleInfo().get(0).getSellingTitle());
	        }
	        
	        if(i == 2000 || i == 4000 || i == 6000 || i == 8000 || i == 10000 || i == 12000 || i == 14000
	        		|| i == 16000 || i == 18000 || i == 20000 || i == 22000 || i == 24000 || i == 26000 || i == 28000 || i == 30000){
	        	System.out.println("[ Escrevendo conteudo no arquivo ]");
	        	createCsvFile(filePath+"-tools.csv",itensTollsMap, i);
	        		itensTollsMap.clear();
	        }
	        
	        i++;
		}
		return itensTollsMap;
	}

	public static List<String> getProductsByCSVFile(String file) {
		
		List<String> produtos = new ArrayList();
		
		try {

			// Crum buffer para a ler de uma stream
			BufferedReader StrR = new BufferedReader(new FileReader(file));

			String Str;
			String[] TableLine;

			// Essa estrutura do looping while é clássica para ler cada linha
			// do arquivo
			while ((Str = StrR.readLine()) != null) {
				// Aqui usamos o método split que divide a linha lida em um
				// array de String
				// passando como parametro o divisor ";".
				TableLine = Str.split(";");

				// O foreach é usadao para imprimir cada célula do array de
				// String.
				
				for (String cell : TableLine) {
					//System.out.println(cell + " ");
					produtos.add(cell);
				}
				//System.out.println("\n");
			}
			StrR.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return produtos;

	}
	
	public static void createCsvFile(String fileName, Map<String, String> itensTools, int contador) {
		
		try {
			System.out.println("[ Numero de registros maximo encontrado "+contador+" ]");
			// Crio de um buffer para a escrita em uma stream
			BufferedWriter StrW = new BufferedWriter(new FileWriter(fileName, true));

			Set<String> keySet = itensTools.keySet();
			for(String s:keySet){
				System.out.println("Item "+s+" "+itensTools.get(s));
				StrW.write(s+";"+itensTools.get(s)+"\n");
			}
			// Fechamos o buffer
			StrW.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
