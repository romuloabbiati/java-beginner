package dft;

import java.util.Scanner;

public class Mod08Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double primeiroNumero = informeNumero(scanner);
		
		imprimirTraco();
		
		
		Integer operacaoAritmetica = escolhaAOperacao(scanner);
		
		imprimirTraco();
		
		Double segundoNumero = informeNumero(scanner);
		
		imprimirTraco();
		
		Double resultado = realizarCalculo(operacaoAritmetica, primeiroNumero, segundoNumero);
		
		System.out.println("O resultado eh: " + resultado);

		scanner.close();
	}
	
	static Integer escolhaAOperacao(Scanner scanner) {
		System.out.println("Digite a operacao desejada [1 -> + / 2 -> - / 3 -> * / 4 -> /]: ");
		return scanner.nextInt();
	}
	
	static Double informeNumero(Scanner scanner) {
		System.out.println("Informe o numero: ");
		return scanner.nextDouble();
	}
	
	static void imprimirTraco() {
		System.out.println("---------------------------------------");
	}
	
	static Double realizarCalculo(Integer operacao, Double primeiroNumero, Double segundoNumero) {
		Double resultado = null;
		
		switch (operacao) {
			case 1:
				resultado = primeiroNumero + segundoNumero;
				break;
			case 2:
				resultado = primeiroNumero - segundoNumero;
				break;
			case 3:
				resultado = primeiroNumero * segundoNumero;
				break;
			case 4:
				resultado = primeiroNumero / segundoNumero;
				break;
			default:
				System.err.println("Escolha uma operacao valida!");
				System.exit(0);
		}
		return resultado;
	}

}
