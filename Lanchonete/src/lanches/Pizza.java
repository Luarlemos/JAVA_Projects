package lanches;

public class Pizza extends Massa{
	public Pizza() {
		super();
		System.out.println("Você escolheu a opção Pizza como massa");
	}
	@Override
	public double getPreco() {
			super.setPreco(30.00);
			return super.getPreco();
	}
}
