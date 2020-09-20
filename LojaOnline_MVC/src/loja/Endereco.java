package loja;

public class Endereco {
	private int id_endereco;
	private int numero;
	private String rua; 
	private String bairro; 
	private String complemento;
	private String cidade;
	private String estado;
	//private Cliente cliente;
	//final private int fk_cliente = cliente.getId_cliente();
	private int fk_cliente;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getId_endereco() {
		return id_endereco;
	}
	public int getFk_cliente() {
		return fk_cliente;
	}
		    
	
}
