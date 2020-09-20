package loja;

import java.time.LocalDate;

public class ClienteView {
	public void printClienteDetails(int id_cliente, String clienteNome, String clienteCpf, String clienteRg, String clienteEmail, LocalDate data_nascimento) {
		System.out.println("Cliente: ");
		System.out.println("Id: " + id_cliente);
		System.out.println("Nome: " + clienteNome);
		System.out.println("CPF: " + clienteCpf);
		System.out.println("RG: " + clienteRg);
		System.out.println("Email: " + clienteEmail);
		System.out.println("Data de Nascimento: " + data_nascimento);
	} 
}
