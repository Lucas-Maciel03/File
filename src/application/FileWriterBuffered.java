package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBuffered {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"lucas", "lorena", "Maria", "Ronaldo"};
		String path = "C:\\Users\\Samsung\\Documents\\in.txt";
		
		try(BufferedWriter bw =  new BufferedWriter(new FileWriter(path, true/*para adicionar no fim do arquivo*/))) {
			for(String line : lines) {
				bw.write(line); //lines copia pro line que escreve no arquivo
				bw.newLine();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
