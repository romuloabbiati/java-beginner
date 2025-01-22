package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Mod10Exercicio01 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<>();
		
		System.out.println("Digite uma tarefa ou digite x para encerrar o programa: ");
		int i = 0;
		
		while (true) {
			System.out.print("Tarefa " + (i + 1) + ": ");
			String tarefa = scanner.nextLine();
			
			if ("x".equals(tarefa)) {
				break;
			}
			linhas.add(tarefa);
			i++;
		}
		
		
		Path arquivo = Paths.get("/Users/romuloabbiati/Documents/java-logicaProgramacao/arquivo.txt");
		Files.write(arquivo, linhas);
		
		System.out.println("FIM...");
		
		scanner.close();
	}

}
