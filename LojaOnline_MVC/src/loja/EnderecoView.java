package loja;

public class EnderecoView {
	public void printEnderecoDetails(int id_endereco, int numero, String rua, String bairro,String complemento, String cidade, String estado,int fk_cliente) {
		System.out.println("Endereco: ");
		System.out.println("Id: " + id_endereco);
		System.out.println("Numero: " + numero);
		System.out.println("Rua: " + rua);
		System.out.println("Bairro: " + bairro);
		System.out.println("Complemento: " + complemento);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
		System.out.println("Cliente: " + fk_cliente);
	} 
}
