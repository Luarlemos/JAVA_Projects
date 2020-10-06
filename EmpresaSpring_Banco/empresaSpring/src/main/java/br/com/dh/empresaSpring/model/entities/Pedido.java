package br.com.dh.empresaSpring.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pedido;
	private String data_pedido;
	private String status_pedido;
	
	@ManyToOne
	@JoinColumn(name = "fk_cliente")
	@JsonIgnoreProperties("pedidos")
	private Cliente cliente;
	
	public int getId_pedido() {
		return id_pedido;
	}
	
	public String getData_pedido() {
		return data_pedido;
	}
	public void setData_pedido(String data_pedido) {
		this.data_pedido = data_pedido;
	}
	public String getStatus_pedido() {
		return status_pedido;
	}
	public void setStatus_pedido(String status_pedido) {
		this.status_pedido = status_pedido;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
}
