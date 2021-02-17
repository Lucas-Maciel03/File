package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Samsung\\Documents\\in.txt");//criando um arquivo
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) { //enquanto tiver linha para exibir vai continuar o loop
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage()); //se der um erro na abertura do arquivo vai exibir msg
		} finally {
			if (sc != null) { //se o scanner for diferente de nulo vai fechar
				sc.close();
			}
		}
	}
}