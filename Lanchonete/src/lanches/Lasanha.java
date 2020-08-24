package lanches;

public class Lasanha extends Massa {
	public Lasanha() {
		super();
		System.out.println("Você escolheu a opção Lasanha como massa");
	}
	public double getPreco() {
		super.setPreco(34.90);
		return super.getPreco();
	}
}
