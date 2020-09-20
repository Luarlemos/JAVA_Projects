package loja;

public class ProdutoController {
	private Produto model;
	private ProdutoView view;
	
	public ProdutoController(Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getProdutoNome() {
		return model.getNome();
	}
	public void setProdutoNome(String nome) {
		model.setNome(nome);
	}
	public String getProdutoDescricao() {
		return model.getDescricao();
	}
	public void setProdutoDescricao(String descricao) {
		model.setDescricao(descricao);
	}
	public int getProdutoEstoque() {
		return model.getEstoque();
	}
	public void setProdutoEstoque(int estoque) {
		model.setEstoque(estoque);
	}
	public double getProdutoPreco() {
		return model.getPreco();
	}
	public void setProdutoPreco(double preco) {
		model.setPreco(preco);
	}
	public int getProdutoId_produto() {
		return model.getId_produto();
	}
	
	public void updateView() {
		view.printProdutoDetails(model.getId_produto(), model.getNome(), model.getDescricao(), model.getEstoque(), model.getPreco());
	}
}
