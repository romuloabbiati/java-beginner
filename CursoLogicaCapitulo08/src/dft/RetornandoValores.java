package dft;

public class RetornandoValores {

	public static void main(String[] args) {

		// 50 --- 100%
		// x  --- 20%
		
		Double[] premissaInicial = new Double[] { 50.0, 100.0 };
		Double proporcao = 20.0;
		
		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
		
		System.out.println("Resultado: " + resultadoFinal);

	}
	
	static Double regraDeTres(Double[] premissa, Double proporcao) {
		Double resultado = premissa[0] * proporcao / premissa[1];
		return resultado;
	}

}
