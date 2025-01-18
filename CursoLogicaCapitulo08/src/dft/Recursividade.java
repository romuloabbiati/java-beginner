package dft;

import java.util.Scanner;

public class Recursividade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avancado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que voce deseja eh o: ", scanner);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos); 
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] { "Cartao", "Boleto" };
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);
		
		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida eh: ", scanner);
		
		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento); 
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento eh " + formaPagamentoEscolhida + ".");
		
		scanner.close();
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