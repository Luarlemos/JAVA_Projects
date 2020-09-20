package loja;

public class Produto_pedidoView {
	public void printProduto_pedidoDetails(int quantidade_produto, int fk_pedido, int fk_produto) {
		System.out.println("Produto-Pedido: ");
		System.out.println("Quantidade de produto: " + quantidade_produto);
		System.out.println("Cliente: " + fk_pedido);
		System.out.println("Produto: " + fk_produto);
	} 
	
}
