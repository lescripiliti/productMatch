package com.b2winc.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TrataArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createCsvFile();
		readCsvFile();
	}

	public static void readCsvFile() {

		try {

			// Criação de um buffer para a ler de uma stream
			BufferedReader StrR = new BufferedReader(new FileReader("/Users/leandroscripiliti/Documents/workspace/b2w-match/src/product.csv"));

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
					System.out.print(cell + " ");
				}
				System.out.println("\n");
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

			// Criação de um buffer para a escrita em uma stream
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

}
