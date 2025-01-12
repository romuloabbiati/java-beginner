package dft;

import java.util.Scanner;

public class Mod05Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana [1 = Domingo, 2 = Segunda, ..., 6 = Sabado]: ");
		Integer numeroDiaSemana = scanner.nextInt();
		
		String dia = "";
		
		switch (numeroDiaSemana) {
			case 1: {
				dia = "domingo";
				break;
			}
			case 2: {
				dia = "segunda-feira";
				break;
			}
			case 3: {
				dia = "terca-feira";
				break;
			}
			case 4: {
				dia = "quarta-feira";
				break;
			}
			case 5: {
				dia = "quinta-feira";
				break;
			}
			case 6: {
				dia = "sexta-feira";
				break;
			}
			case 7: {
				dia = "sabado";
				break;
			}
			default:
//				throw new IllegalArgumentException("Unexpected value: " + numeroDiaSemana);
				dia = "INVALIDO";
			}
		
		System.out.println("O dia escolhido foi: " + dia + ".");
		
		scanner.close();
	}

}
