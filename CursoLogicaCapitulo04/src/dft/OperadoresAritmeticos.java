package dft;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		Integer adicao = 1 + 1;
		System.out.println("Adicao: " + adicao);
		
		Integer subtracao = 1 - 1;
		System.out.println("Subtracao: " + subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplicacao: " + multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divisao: " + divisao);
		
		Integer modulo = 7 % 4;
		System.out.println("Modulo: " + modulo);
		
		Integer precedencia01 = 1 + 1 * 5;
		System.out.println("Precedencia 01: " + precedencia01);
		
		Integer precedencia02 = (1 + 1) * 5;
		System.out.println("Precedencia 02: " + precedencia02);
		
		Integer precedencia03 = 5 * (1 + 1);
		System.out.println("Precedencia 03: " + precedencia03);
		
		Integer precedencia04 = 5 * (1 + 1) + 2;
		System.out.println("Precedencia 04: " + precedencia04);
		
		Integer precedencia05 = 5 * ((1 + 1) + 2);
		System.out.println("Precedencia 05: " + precedencia05);
		
		Integer cinco = 5;
		Integer um = 1;
		Integer precedenciaComVariaveis = cinco * (um + um);
		System.out.println("Precedencia com variaveis: " + precedenciaComVariaveis);
		

	}

}
