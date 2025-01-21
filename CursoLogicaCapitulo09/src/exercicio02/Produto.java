package exercicio02;

public class Produto {
	
	static final Integer QUANTIDADE_MINIMA_EM_ESTOQUE = 10;
	
	String nome;
	
	Integer quantidadeEstoque;
	
	Boolean eNecessarioReporEstoque() {
		Boolean eMenorQueDez = quantidadeEstoque < QUANTIDADE_MINIMA_EM_ESTOQUE;
		
		if (eMenorQueDez) {
			return true;
		}
		
		return false;
	}

}
