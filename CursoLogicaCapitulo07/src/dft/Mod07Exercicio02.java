package dft;

public class Mod07Exercicio02 {

	public static void main(String[] args) {
		Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		
		Integer indiceSemanaMaiorFaturamento = null;
		Double maiorFaturamento = 0.0;
		
		for (int i = 0; i < mes.length; i++) {
			Double[] semana = mes[i];
			
			Double totalSemana = 0.0;
			
			for (int j = 0; j < semana.length; j++) {
				totalSemana += semana[j];
			}
			
			Boolean esseFaturamentoEOMaior = totalSemana > maiorFaturamento;
			
			if (esseFaturamentoEOMaior) {
				indiceSemanaMaiorFaturamento = i + 1;
			}
		}
		
		System.out.println("A semana com maior faturamento foi a semana -> " + indiceSemanaMaiorFaturamento);

	}

}
