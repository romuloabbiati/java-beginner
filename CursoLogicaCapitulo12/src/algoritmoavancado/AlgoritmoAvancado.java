package algoritmoavancado;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		ListaAlunos listaAlunos = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Romulo";
		listaAlunos.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Isabela";
		listaAlunos.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Elena";
		listaAlunos.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Rosinella";
		listaAlunos.adicionar(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.nome = "Rafael";
		listaAlunos.adicionar(aluno5);
		
		iterar(listaAlunos);
		
		listaAlunos.remover(aluno1);
		
		iterar(listaAlunos);
		
		listaAlunos.ordenar();
		
		iterar(listaAlunos);
		
	}
	
	static void iterar(ListaAlunos listaAlunos) {
		for (int i = 0; i < listaAlunos.tamanhoLista; i++) {
			Aluno a = listaAlunos.obter(i);
			if (a != null) {
				System.out.println("Aluno: " + a.nome);				
			} else {
				System.out.println("Aluno sem nome");
			}
		}
		
		System.out.println("-------------------------------");
	}

}
