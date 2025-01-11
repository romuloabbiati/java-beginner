package dft;

public class LogicalOperators {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromocao = false;
		Boolean jaFezCompraNaLoja = true;
		Boolean pagamentoAVista = true;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
		
//		Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;
		
		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("Nao aplique o desconto.");
		}

	}

}
