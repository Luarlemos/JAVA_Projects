package loja;

import java.time.LocalDate;

public class Programa {

	public static void main(String[] args) {
		LocalDate data = LocalDate.of(1996, 8, 17);
		Cliente model = new Cliente();
		Cliente model1 = new Cliente();
		ClienteView view = new ClienteView();
		ClienteView view1 = new ClienteView();
		ClienteController controller = new ClienteController(model, view);
		ClienteController controller1 = new ClienteController(model1, view1);
		Endereco modelEnd = new Endereco();
		EnderecoView viewEnd = new EnderecoView();
		EnderecoController controllerEnd = new EnderecoController(modelEnd, viewEnd);
		
		controller.setClienteNome("Luciana");
		controller.setClienteCpf("000.111.222-03");
		controller.setClienteRg("22222222222-0");
		controller.setClienteEmail("lu@hotmail.com");
		controller.setClienteNascimento(data);
		controllerEnd.setEnderecoNumero(8);
		controllerEnd.getEnderecoNumero();
		controller.updateView();
		controllerEnd.updateView();
		
		controller1.setClienteNome("Rayssa");
		controller1.updateView();

	}

}
