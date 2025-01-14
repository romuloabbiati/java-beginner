package dft;

import java.util.Scanner;

public class Mod07Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefasDoDia = new String[5];
		
		System.out.println("Digite as 5 tarefas mais importantes do seu dia: ");
		
		for (int i = 0; i < tarefasDoDia.length; i++) {
			System.out.print("[" + (i + 1) + "] ");
			tarefasDoDia[i] = scanner.nextLine();
		}
		
		System.out.println("-----------------------------------------------");
		
		
		System.out.println("As minhas tarefas sao: ");
		for (int i = 0; i < tarefasDoDia.length; i++) {
			System.out.println("[" + (i + 1) + "] " + tarefasDoDia[i]);
		}
		
		scanner.close();
	}

}
