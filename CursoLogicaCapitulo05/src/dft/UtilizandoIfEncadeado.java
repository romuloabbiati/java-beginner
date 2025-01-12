package dft;

import java.util.Scanner;

public class UtilizandoIfEncadeado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
//		Boolean pesoLeve = peso <= 60;
//		Boolean pesoMedio = peso > 60 && peso <= 90;
//		Boolean pesoPesado = peso > 90;
//		
//		if (pesoLeve) {
//			System.out.println("O lutador eh peso leve.");
//		} else {
//			if (pesoMedio) {
//				System.out.println("O lutador eh peso medio.");
//			} else {
//				if (pesoPesado) {
//					System.out.println("O lutador eh peso pesado.");
//				}
//			}
//		}
		
		Boolean pesoLeve = (peso <= 60) && (peso > 0);
		Boolean pesoMedio = peso > 60 && peso <= 90;
		Boolean pesoPesado = peso > 90;
		
		if (pesoLeve) {
			System.out.println("O lutador eh peso leve.");
		} else if (pesoMedio) {
			System.out.println("O lutador eh peso medio.");
		} else if (pesoPesado) {
			System.out.println("O lutador eh peso pesado.");
		} else {
			System.out.println("O lutador nao se enquadra em nenhuma categoria.");
		}
		
		scanner.close();
	}

}
