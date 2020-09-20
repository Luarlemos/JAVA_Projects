package loja;

public class Produto_pedido {
	private int quantidade_produto;
	//private Pedido pedido;
	//private Produto produto;
	//final private int fk_produto = produto.getId_produto();
	//final private int fk_pedido = pedido.getId_pedido();
	private int fk_produto;
	private int fk_pedido;
	
	public int getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(int quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}

	public int getFk_produto() {
		return fk_produto;
	}

	public int getFk_pedido() {
		return fk_pedido;
	}
	
	
}
