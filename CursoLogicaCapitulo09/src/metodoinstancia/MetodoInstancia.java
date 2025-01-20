package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Romulo";
		cliente.ultimoNome = "Hipolito Abbiati";
		cliente.telefone = "44 07378373223";
		cliente.email = "rhabbiati@hotmail.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Isabela";
		cliente2.ultimoNome = "Goto Abbiati";
		cliente2.telefone = "44 07778222333";
		cliente2.email = "isabela_goto@hotmail.com";
		
		System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
		System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
		
	}
	
//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//		return nomeCompleto;
//	}

}
