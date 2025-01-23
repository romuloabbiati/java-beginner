package exercicio02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Mod10Exercicio02 {

public static void main(String[] args) throws IOException {
		
		List<String> tasks = lerDoArquivo("/Users/romuloabbiati/Documents/java-logicaProgramacao/arquivo.txt");

		System.out.println("This is your list of chores for the day: ");
		
		for (int i = 0; i < tasks.size(); i++) {
			String task = tasks.get(i);
			
			System.out.println("Task " + (i + 1) + ": " + task);
		}
		
		System.out.println("-----------------");

	}

	static List<String> lerDoArquivo(String arquivo) throws IOException {
		Path doc = Paths.get(arquivo);
		return  Files.readAllLines(doc);
	}

}
