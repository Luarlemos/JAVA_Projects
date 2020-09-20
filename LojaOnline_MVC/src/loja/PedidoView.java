package loja;

import java.time.LocalDate;

public class PedidoView {
	public void printPedidoDetails(int id_pedido, String nfe, LocalDate data_emissao,double valor_total, String status_pedido,int fk_cliente,int fk_produto) {
		System.out.println("Pedido: ");
		System.out.println("Id: " + id_pedido);
		System.out.println("NFE: " + nfe);
		System.out.println("Data de emissao: " + data_emissao);
		System.out.println("Valor Total: " + valor_total);
		System.out.println("Status do Pedido: " + status_pedido);
		System.out.println("Cliente: " + fk_cliente);
		System.out.println("Produto: " + fk_produto);
	} 

}
