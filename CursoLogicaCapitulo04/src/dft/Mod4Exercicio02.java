package dft;

import java.util.Scanner;

public class Mod4Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Boolean valorProdutoMaiorQueCem = valorProduto >= 100;
		
		Double frete = 15.0;;
		
		if (valorProdutoMaiorQueCem) {
			frete = 0.0;
		}
		
		Double valorProdutoComFrete = valorProduto + frete;
		
		System.out.println("O valor do frete eh de " + frete + " e o valor final com frete eh " + valorProdutoComFrete);
		
		scanner.close();
	}

}
