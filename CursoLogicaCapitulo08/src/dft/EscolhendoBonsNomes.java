package dft;

import java.util.Scanner;

public class EscolhendoBonsNomes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String cursoEscolhido = receberCursoDoUsuario(scanner);
		
		imprimirTraco();
		
		String formaPagamentoEscolhida = receberFormaDePagamentoDoUsuario(scanner);
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento eh " + formaPagamentoEscolhida + ".");
		
		scanner.close();
	}
	
	static String receberFormaDePagamentoDoUsuario(Scanner scanner) {
		String[] formasPagamento = new String[] { "Cartao", "Boleto" };
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);
		
		Integer posicaoFormaPagamentoEscolhida = receberIndiceValidoDoUsuario(formasPagamento, "Sua forma de pagamento escolhida eh: ", scanner);
		
		return formasPagamento[posicaoFormaPagamentoEscolhida];
	}
	
	static String receberCursoDoUsuario(Scanner scanner) {
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avancado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		Integer posicaoCursoEscolhido = receberIndiceValidoDoUsuario(cursos, "O curso que voce deseja eh o: ", scanner);
		
		return cursos[posicaoCursoEscolhido];
	}
	
	// receberCursoDoUsuario
	
	static Integer receberIndiceValidoDoUsuario(String[] vetor, String texto, Scanner scanner) {
		Integer posicaoEscolhida = receberNumeroInteiroDoUsuario(texto, scanner);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoEscolhida, vetor); 
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		return posicaoEscolhida;
	}
	
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimirEContinuarMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		return posicao >= 0 && posicao < vetor.length;
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		iterarEExibirPosicoesDoVetorString(vetor, 0);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor, Integer i) {
		System.out.println("[" + i + "] " + vetor[i]);
		
		if (++i < vetor.length) {
			iterarEExibirPosicoesDoVetorString(vetor, i);
		}
	}
	
	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}
	
	static void encerrarProgramaPorCausaDePosicaoInvalida() {
		System.err.println("Posicao invalida!");
		System.exit(1);
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirEContinuarMesmaLinha(String texto) {
		System.out.print(texto);
	}

}