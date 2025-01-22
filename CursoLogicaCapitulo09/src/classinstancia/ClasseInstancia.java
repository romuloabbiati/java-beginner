package classinstancia;

public class ClasseInstancia {

	public static void main(String[] args) {
		System.out.println("Quantidade minima estoque: " + Produto.quantidadeMinimaEstoque);
		
		Produto produto = new Produto();
		produto.nome = "Caneca";
		
//		System.out.println("Quantidade minima estoque: " + produto.quantidadeMinimaEstoque);
		
		Produto produto2 = new Produto();
		produto2.nome = "Carteira";
		
		System.out.println("Quantidade minima estoque: " + produto2.quantidadeMinimaEstoque);
		
//		System.out.println("Produto 1: " + produto.nome);
//		System.out.println("Produto 2: " + produto2.nome);
		
		Impressao.informacao("Produto 1: " + produto.nome);
		Impressao.informacao("Produto 2: " + produto2.nome);
		
		Impressao.erro("Deu um erro aqui!");

	}

}
