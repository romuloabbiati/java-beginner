package dft;

public class EstruturaIf {

	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
//		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2.0) >= emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
//		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor 
//				&& aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
		
		if (((movimentacaoMedia * 2.0) >= emprestimo)
				&& aContaTemTempoSuficienteDeAbertura && temNomeLimpo) {
			System.out.println("Sim! Pode liberar emprestimo.");
		} else {
			System.out.println("Nao pode liberar o emprestimo.");
		}

	}

}
