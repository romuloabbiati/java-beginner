package leituraarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {

	public static void main(String[] args) throws IOException {
		
		Path doc = Paths.get("/Users/romuloabbiati/Documents/java-logicaProgramacao/arquivo.txt");
		List<String> tasks = Files.readAllLines(doc);
		
		for (int i = 0; i < tasks.size(); i++) {
			String task = tasks.get(i);
			
			System.out.println("Task " + (i + 1) + ": " + task);
		}

	}

}
