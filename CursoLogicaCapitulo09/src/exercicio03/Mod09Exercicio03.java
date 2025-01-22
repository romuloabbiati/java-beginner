package exercicio03;

public class Mod09Exercicio03 {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		pedido.setCodigo("xyz-001");
		pedido.setDesconto(10.0);
		pedido.setSubtotal(100.0);
		pedido.setTotal(pedido.getSubtotal() - pedido.getDesconto());
		
		System.out.println("Código: " + pedido.getCodigo() + ", Subtotal: " + pedido.getSubtotal() + 
				", Desconto: " + pedido.getDesconto() + ", Total: " + pedido.getTotal());
		
		

	}

}
