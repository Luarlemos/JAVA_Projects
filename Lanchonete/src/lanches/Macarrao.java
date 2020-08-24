package lanches;

public class Macarrao extends Massa{
	public Macarrao() {
		super();
		System.out.println("Você escolheu a opção Macarrão como massa");
	}
	public double getPreco() {
		super.setPreco(22.50);
		return super.getPreco();
}
}
