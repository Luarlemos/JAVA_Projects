package lanches;

public abstract class Lanche {
	private double preco;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int calcularTempo(int distancia) {
		return distancia*10;
	}

}
