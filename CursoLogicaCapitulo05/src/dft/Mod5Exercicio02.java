package dft;

import java.util.Scanner;

public class Mod5Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a meta de faturamento anual: ");
		Double metaFaturamentoAnual = scanner.nextDouble();
		
		System.out.println("Digite o faturamento real do ano: ");
		Double faturamentoReal = scanner.nextDouble();
		
		System.out.println("Informe a media salarial do funcionario: ");
		Double mediaSalarialDoFuncionario = scanner.nextDouble();
		
		Boolean faturamentoEhMaiorQueAMeta = faturamentoReal >= metaFaturamentoAnual;
		
		Boolean faturamentoEhMaiorOuIgualA80Porcento = faturamentoReal >= (metaFaturamentoAnual * 80.0 / 100.0);
		
		Double bonus = 0.0;
		
		if (faturamentoEhMaiorQueAMeta ) {
			bonus = mediaSalarialDoFuncionario;
			System.out.println("Voce vai ganhar um bonus de 100%! Ele sera de " + bonus + ".");
			
		} else if (faturamentoEhMaiorOuIgualA80Porcento) {
			bonus = (mediaSalarialDoFuncionario * 80.0 / 100.0);
			System.out.println("Voce vai ganhar um bonus de 80%! Ele serah de: " + bonus + ".");
			
		} else {
			bonus = 0.0;
			System.out.println("Infelizmente, esse ano nao tem bonus!.");
		}
		
		scanner.close();
	}

}
