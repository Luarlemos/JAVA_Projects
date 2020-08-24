package lanches;

public class Massa extends Lanche {
	private String molho;
	
	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	@Override
	public int calcularTempo(int distancia) {
		int tempo;
		tempo= super.calcularTempo(distancia)+30;
		return tempo;
	}
	@Override
	public double getPreco() {
		//super.setPreco(15.99);
		return super.getPreco();
	}
}
