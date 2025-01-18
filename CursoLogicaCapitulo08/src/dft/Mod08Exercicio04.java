package dft;

import java.util.Scanner;

public class Mod08Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer multiplicando = informeNumero(scanner);
		
		System.out.println("--------------------------------");
		
		imprimirTabuada(multiplicando, 0);
		
		scanner.close();
	}
	
	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		Integer resultado = multiplicando * multiplicador;
		System.out.println(multiplicando + " x " + multiplicador + " = " + resultado);
		
		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
	}
	
	static Integer informeNumero(Scanner scanner) {
		System.out.print("Informe o multiplicando: ");
		return scanner.nextInt();
	}

}
