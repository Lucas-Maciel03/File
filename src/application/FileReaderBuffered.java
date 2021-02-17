package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBuffered {

	public static void main(String[] args) {
		String path = "C:\\Users\\Samsung\\Documents\\in.txt";
		/*antes:
	 	BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			depois: */
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			//botou o buff reader no construtor e instanciou o file reader como argumento
			
			String a = br.readLine();

			while (a != null) {
				System.out.println(a);
				a = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		} 

	}

}
