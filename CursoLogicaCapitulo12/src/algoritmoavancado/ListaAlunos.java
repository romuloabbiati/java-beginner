package algoritmoavancado;

public class ListaAlunos {
	
	public static final int QUANTIDADE_LISTA = 2;
	
	public Aluno[] lista = new Aluno[QUANTIDADE_LISTA];
	
	public int tamanhoLista = 0;
	
	public Aluno obter(int indice) {
		return lista[indice];
	}
	
	public int tamanho() {
		return tamanhoLista;
	}
	
	public void adicionar(Aluno aluno) {
		if (tamanhoLista == lista.length) {
			Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];
			
			for (int i = 0; i < lista.length; i++) {
				novaLista[i] = lista[i];
			}
			
			lista = novaLista;
		}
		
		lista[tamanhoLista] = aluno;
		tamanhoLista++;
	}
	
	public void remover(Aluno aluno) {
		for (int i = 0; i < tamanhoLista; i++) {
			Aluno a = lista[i];
			
			if (a != null && a.equals(aluno)) {
				remover(i);
				break;
			} else if (a == null && aluno == null) {
				remover(i);
				break;
			}
		}
	}
	
	public void remover(int indice) {
		int indiceInicial = indice + 1;
		
		for (int i = indiceInicial; i < tamanhoLista; i++) {
			lista[i - 1] = lista[i];
		}
		tamanhoLista--;
		lista[tamanhoLista] = null;
	}
	
	public void ordenar() {
		for (int i = 1; i < tamanhoLista; i++) {
			Aluno alunoPosicaoBase = lista[i];
			int indicePosicaoBase = i;
			
			while (indicePosicaoBase > 0) {
				int indicePosicaoAnterior = indicePosicaoBase - 1;
				Aluno alunoPosicaoAnterior = lista[indicePosicaoAnterior];
				
				Boolean alunoPosicaoAnteriorVemDepoisDe = alunoPosicaoAnterior == null 
						|| alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase);
				
				if (alunoPosicaoAnteriorVemDepoisDe) {
					lista[indicePosicaoBase] = lista[indicePosicaoAnterior];
					
					indicePosicaoBase--;
				} else {
					break;
				}
			}
			
			lista[indicePosicaoBase] = alunoPosicaoBase;
		}
	}

}
