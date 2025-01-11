package dft;

import java.util.Scanner;

public class Mod05Exercicio01 {
	
	static final Double NOTA_MINIMA_EM_UMA_PROVA = 60.0;
	
	static final Double NOTA_MINIMA_TOTAL = 150.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota da prova de Portugues: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Digite a nota da prova de matematica: ");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean ehMaiorQueNotaMinima = (notaPortugues + notaMatematica) >= NOTA_MINIMA_TOTAL;
		Boolean estaAcimaDoMinimoEmPortugues = notaPortugues >= NOTA_MINIMA_EM_UMA_PROVA;
		Boolean estaAcimaDoMinimoEmMatematica = notaMatematica >= NOTA_MINIMA_EM_UMA_PROVA;
		
		Boolean passou = ehMaiorQueNotaMinima && estaAcimaDoMinimoEmMatematica && estaAcimaDoMinimoEmPortugues;
		
		if (passou) {
			System.out.println("Parabens! Voce passou.");
		} else {
			System.out.println("Infelizmente, nao foi dessa vez.");
		}
		
		scanner.close();
	}

}
