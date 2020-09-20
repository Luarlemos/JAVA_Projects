package loja;

import java.time.LocalDate;

public class Pedido {
	private int id_pedido;
	private String nfe;
	private LocalDate data_emissao;
	private double valor_total;
	private String status_pedido;
//	private Cliente cliente;
//	private Produto produto;
//	final private int fk_produto = produto.getId_produto();
//	final private int fk_cliente = cliente.getId_cliente();
	private int fk_produto;
	private int fk_cliente;
	
	public String getNfe() {
		return nfe;
	}
	public void setNfe(String nfe) {
		this.nfe = nfe;
	}
	public LocalDate getData_emissao() {
		return data_emissao;
	}
	public void setData_emissao(LocalDate data_emissao) {
		this.data_emissao = data_emissao;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public String getStatus_pedido() {
		return status_pedido;
	}
	public void setStatus_pedido(String status_pedido) {
		this.status_pedido = status_pedido;
	}
	public int getId_pedido() {
		return id_pedido;
	}
	public int getFk_produto() {
		return fk_produto;
	}
	public int getFk_cliente() {
		return fk_cliente;
	}
	
	
}
