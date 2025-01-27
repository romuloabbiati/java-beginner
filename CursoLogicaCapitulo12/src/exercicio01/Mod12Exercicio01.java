package exercicio01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import algoritmoavancado.Aluno;
import algoritmoavancado.ListaAlunos;

public class Mod12Exercicio01 {

	public static void main(String[] args) throws IOException {
		Path doc = Paths.get("/Users/romuloabbiati/Documents/java-logicaProgramacao/arquivo.txt");
		List<String> names = Files.readAllLines(doc);
		ListaAlunos listaNomes = new ListaAlunos();
		
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			
			System.out.println("Name " + (i + 1) + ": " + name);
			
			Aluno aluno = new Aluno();
			aluno.nome = name;
			
			listaNomes.adicionar(aluno);
		}
		
		System.out.println("----------------------------------");
		
		listaNomes.ordenar();
		
		List<String> orderedNames = new ArrayList<>();
		
		for (int i = 0; i < listaNomes.tamanhoLista; i++) {
			Aluno aluno = listaNomes.obter(i);
			
			
			System.out.println("Name " + (i + 1) + ": " + aluno.nome);
			orderedNames.add(aluno.nome);
		}
		
		Path newDoc = Paths.get("/Users/romuloabbiati/Documents/java-logicaProgramacao/arquivo.txt");
		Files.write(newDoc, orderedNames);
		
	}

}
