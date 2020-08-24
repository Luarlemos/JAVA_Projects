package lanches;
import java.util.Arrays;

public class Sanduiche extends Lanche{
	private String[] ingredientes = new String[10];

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	@Override
	public int calcularTempo(int distancia) {
		int tempo;
		tempo= super.calcularTempo(distancia)+15;
		return tempo;
	}
	@Override
	public void setPreco(double valor) {
		double preco;
		if(valor>=6) {
			preco=3*valor;
		}
		else {
			preco=18;
		}
		
		super.setPreco(preco);
	}
	@Override
	public double getPreco() {
	//	super.setPreco(23.50);
		return super.getPreco();
	}
	@Override
	public String toString() {
		return "Sanduiche [ingredientes=" + Arrays.toString(ingredientes) + "]";
	}
	
}
