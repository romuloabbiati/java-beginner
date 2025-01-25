package algoritmoavancado;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno = new Aluno();
		aluno.nome = "Romulo";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Isabela";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Elena";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Rosinella";
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Rafael";
		lista.adicionar(aluno);
		
		for (int i = 0; i < lista.tamanhoLista; i++) {
			Aluno a = lista.obter(i);
			System.out.println("Aluno: " + a.nome);
		}
		
	}

}
