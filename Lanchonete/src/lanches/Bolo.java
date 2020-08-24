package lanches;

public class Bolo extends Lanche {
	private String massa;
	private String recheio;
	private String cobertura;
	
	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	@Override
	public int calcularTempo(int distancia) {
		int tempo;
		tempo= super.calcularTempo(distancia)+10;
		return tempo;
	}
	@Override
	public double getPreco() {
		super.setPreco(19.90);
		return super.getPreco();
	}
}
