package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		cliente.nome = "Romulo Hipolito Abbiati";
//		cliente.telefone = "44 07378 373223";
//		
//		System.out.println("Nome cliente: " + cliente.nome);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Romulo Hipolito Abbiati");
		cliente.setTelefone("44 07378 373223");
		
		System.out.println("Nome cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Ultimo nome: " + cliente.getUltimoNome());

	}

}
