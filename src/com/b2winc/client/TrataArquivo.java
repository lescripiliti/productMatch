package com.b2winc.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.b2winc.pojo.ItemPojo;
import com.b2winc.query.item.GetBasicItemInfoWS_GetBasicItemInfoWSSoapPort_Client;

public class TrataArquivo {

	private static List<ItemPojo> listItems = new ArrayList<ItemPojo>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createCsvFile();
		//readCsvFile();
		//System.out.println(isNumeric("1"));
		boolean itemMisto = GetBasicItemInfoWS_GetBasicItemInfoWSSoapPort_Client.getItemMisto(113280336);
		System.out.println(itemMisto);
	}
	
	

	public static void readCsvFile() {

		try {

			// Crum buffer para a ler de uma stream
			BufferedReader StrR = new BufferedReader(new FileReader("C:\\Users\\leandro.felipe\\Documents\\GitHub\\productMatch\\src\\product.csv"));

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
				ItemPojo item = new ItemPojo();
				for (String cell : TableLine) {
					if(isNumeric(cell))
						item.setId(new Long(cell));
					else
						item.setParceiro(cell);
					System.out.print(cell + " ");
					listItems.add(item);
				}
				System.out.println("\n");
//
//				for(ItemPojo item1 : listItems){
//					System.out.println(item1.getParceiro());
//				}
			}
			StrR.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	public static void createCsvFile() {
		
		try {

			// Crio de um buffer para a escrita em uma stream
			BufferedWriter StrW = new BufferedWriter(new FileWriter("/Users/leandroscripiliti/Documents/workspace/b2w-match/src/tabela.csv"));

			// Escrita dos dados da tabela
			StrW.write("Nome;Telefone;Idade\n");
			StrW.write("Juliana;6783-8490;23\n");
			StrW.write("Tatiana;6743-7480;45\n");
			StrW.write("Janice;6909-9380;21");

			// Fechamos o buffer
			StrW.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void createNewCsvFile() {
		
		try {

			// Crio de um buffer para a escrita em uma stream
			BufferedWriter StrW = new BufferedWriter(new FileWriter("/Users/leandroscripiliti/Documents/workspace/b2w-match/src/tabela.csv"));

			// Escrita dos dados da tabela
			StrW.write("Nome;Telefone;Idade\n");
			StrW.write("Juliana;6783-8490;23\n");
			StrW.write("Tatiana;6743-7480;45\n");
			StrW.write("Janice;6909-9380;21");

			// Fechamos o buffer
			StrW.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isNumeric(String s){
		Pattern p = Pattern.compile("\\d+"); 
		Matcher m1 = p.matcher(s);
		return m1.find();
	}

}
