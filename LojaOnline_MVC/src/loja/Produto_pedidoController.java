package loja;

public class Produto_pedidoController {
	private Produto_pedido model;
	private Produto_pedidoView view;
	
	public Produto_pedidoController(Produto_pedido model, Produto_pedidoView view) {
		this.model = model;
		this.view = view;
	}
	public int getProduto_pedidoQuantidade_produto() {
		return model.getQuantidade_produto();
	}

	public void setProduto_pedidoQuantidade_produto(int quantidade_produto) {
		model.setQuantidade_produto(quantidade_produto);
	}

	public int getProduto_pedidoFk_produto() {
		return model.getFk_produto();
	}

	public int getProduto_pedidoFk_pedido() {
		return model.getFk_pedido();
	}
	public void updateView() {
		view.printProduto_pedidoDetails(model.getQuantidade_produto(), model.getFk_pedido(), model.getFk_produto());
	}
}
