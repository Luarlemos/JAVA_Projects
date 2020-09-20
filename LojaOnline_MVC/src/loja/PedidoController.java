package loja;

import java.time.LocalDate;

public class PedidoController {
	private Pedido model;
	private PedidoView view;
	
	public PedidoController(Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	public String getPedidoNfe() {
		return model.getNfe();
	}
	public void setPedidoNfe(String nfe) {
		model.setNfe(nfe);
	}
	public LocalDate getPedidoData_emissao() {
		return model.getData_emissao();
	}
	public void setPedidoData_emissao(LocalDate data_emissao) {
		model.setData_emissao(data_emissao);
	}
	public double getPedidoValor_total() {
		return model.getValor_total();
	}
	public void setPedidoValor_total(double valor_total) {
		model.setValor_total(valor_total);
	}
	public String getPedidoStatus_pedido() {
		return model.getStatus_pedido();
	}
	public void setPedidoStatus_pedido(String status_pedido) {
		model.setStatus_pedido(status_pedido);
	}
	public int getPedidoId_pedido() {
		return model.getId_pedido();
	}
	public int getPedidoFk_produto() {
		return model.getFk_produto();
	}
	public int getPedidoFk_cliente() {
		return model.getFk_cliente();
	}
	public void updateView() {
		view.printPedidoDetails(model.getId_pedido(), model.getNfe(), model.getData_emissao(), model.getValor_total(), model.getStatus_pedido(), model.getFk_cliente(), model.getFk_produto());
	}
}
