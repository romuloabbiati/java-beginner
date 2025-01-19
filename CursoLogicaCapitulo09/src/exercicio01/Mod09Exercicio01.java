package exercicio01;

public class Mod09Exercicio01 {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Smartphone";
		produto.quantidadeEstoque = 9;
		
		System.out.println("Necessario repor estoque do produto " + produto.nome + "? " + eNecessarioReporEstoque(produto));

	}
	
	static Boolean eNecessarioReporEstoque(Produto produto) {
		Boolean eMenorQueDez = produto.quantidadeEstoque < produto.QUANTIDADE_MINIMA_EM_ESTOQUE;
		
		if (eMenorQueDez) {
			return true;
		}
		
		return false;
	}

}
