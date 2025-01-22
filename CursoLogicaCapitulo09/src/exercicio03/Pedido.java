package exercicio03;

public class Pedido {
	
	String codigo;
	
	Double subtotal;
	
	Double desconto;
	
//	Double total;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTotal() {
		return getSubtotal() - getDesconto();
	}

	public void setTotal(Double total) { }

}
