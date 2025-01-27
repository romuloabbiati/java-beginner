package algoritmoavancado;

public class Aluno {
	
	public String nome;
	
	public boolean vemDepoisDe(Aluno aluno) {
		if (aluno == null) {
			return false;
		}
		
		return nome.compareTo(aluno.nome) > 0;
	}

}
