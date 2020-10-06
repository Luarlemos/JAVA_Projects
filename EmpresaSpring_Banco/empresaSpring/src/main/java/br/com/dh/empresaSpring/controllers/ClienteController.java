package br.com.dh.empresaSpring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.empresaSpring.model.entities.Cliente;
import br.com.dh.empresaSpring.model.repositories.ClienteRepository;


@RestController
@RequestMapping(path = "cliente")
public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping()
	public Iterable<Cliente> getClientes(){	
		return clienteRepository.findAll();
	}
	@GetMapping("/{id}")
	public Optional<Cliente> getById(@PathVariable int id){
		return clienteRepository.findById(id);
	}
	@PostMapping("/cadastrar")
	public Cliente addCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
		return cliente;
	}
	@PutMapping("/editar/{idCliente}")
	public Cliente updateCliente(@PathVariable int idCliente, @RequestBody Cliente dadosCliente) throws Exception {
		Cliente meuCliente = clienteRepository.findById(idCliente)
				.orElseThrow(() -> new IllegalAccessException());
				
		if(!dadosCliente.getNome().isEmpty()) meuCliente.setNome(dadosCliente.getNome());
		if(!dadosCliente.getEmail().isEmpty()) meuCliente.setEmail(dadosCliente.getEmail());
		if(!dadosCliente.getCpf().isEmpty()) meuCliente.setCpf(dadosCliente.getCpf());
		if(!dadosCliente.getRg().isEmpty()) meuCliente.setRg(dadosCliente.getRg());
		if(!dadosCliente.getTelefone().isEmpty()) meuCliente.setTelefone(dadosCliente.getTelefone());
		if(!dadosCliente.getEndereco().isEmpty()) meuCliente.setEndereco(dadosCliente.getEndereco());
		
		clienteRepository.save(meuCliente);
		return meuCliente;
	}
	
	@DeleteMapping("/apagar/{id}")
	public void deleteCliente(@PathVariable int id) {
		clienteRepository.deleteById(id);
	}
}
