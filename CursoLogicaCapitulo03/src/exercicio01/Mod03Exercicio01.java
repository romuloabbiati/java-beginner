package exercicio01;

import java.util.Scanner;

public class Mod03Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero que deseja calcular o quadrado do mesmo: ");
		Integer numero = scanner.nextInt();
		
		Integer quadradoDoNumero = numero * numero;
		
		System.out.println("Quadrado de " + numero + " eh: " + quadradoDoNumero);
		
		scanner.close();
	}

}
