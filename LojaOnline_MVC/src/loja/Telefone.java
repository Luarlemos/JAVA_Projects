package loja;

public class Telefone{
	private int id_telefone;
	private String ddd;
	private String numero;
	//private Cliente cliente;
	//final private int fk_cliente = cliente.getId_cliente();
	private int fk_cliente;
	
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getId_telefone() {
		return id_telefone;
	}
	public int getFk_cliente() {
		return fk_cliente;
	}
}
