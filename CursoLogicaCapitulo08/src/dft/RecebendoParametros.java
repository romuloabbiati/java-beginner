package dft;

import java.util.Scanner;

public class RecebendoParametros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avancado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		imprimirEContinuarMesmaLinha("O curso que voce deseja eh o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] { "Cartao", "Boleto" };
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);
		
		imprimirEContinuarMesmaLinha("Sua forma de pagamento escolhida eh: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		if (!posicaoValida) {
			encerrarProgramaPorCausaDePosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento eh " + formaPagamentoEscolhida + ".");
		
		scanner.close();
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
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