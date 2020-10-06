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

import br.com.dh.empresaSpring.model.entities.Funcionario;
import br.com.dh.empresaSpring.model.repositories.FuncionarioRepository;

@RestController
@RequestMapping(path = "funcionario")
public class FuncionarioController {
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@GetMapping
	public Iterable<Funcionario> getFuncionarios(){
		return funcionarioRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Funcionario> getById(@PathVariable int id){
		return funcionarioRepository.findById(id);
	}
	
	@PostMapping("/cadastrar")
	public Funcionario addFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
		return funcionario;
	}
	
	@PutMapping("/editar/{idFuncionario}")
	public Funcionario updateFuncionario(@PathVariable int idFuncionario, @RequestBody Funcionario dadosFuncionario) throws Exception{
		Funcionario meuFuncionario = funcionarioRepository.findById(idFuncionario)
				.orElseThrow(() -> new IllegalAccessException());
		
		if(!dadosFuncionario.getNome().isEmpty()) meuFuncionario.setNome(dadosFuncionario.getNome());
		if(!dadosFuncionario.getEmail().isEmpty()) meuFuncionario.setEmail(dadosFuncionario.getEmail());
		if(!dadosFuncionario.getCpf().isEmpty()) meuFuncionario.setCpf(dadosFuncionario.getCpf());
		if(!dadosFuncionario.getRg().isEmpty()) meuFuncionario.setRg(dadosFuncionario.getRg());
		if(!dadosFuncionario.getTelefone().isEmpty()) meuFuncionario.setTelefone(dadosFuncionario.getTelefone());
		if(!dadosFuncionario.getEndereco().isEmpty()) meuFuncionario.setEndereco(dadosFuncionario.getEndereco());
		if(!dadosFuncionario.getCargo().isEmpty()) meuFuncionario.setCargo(dadosFuncionario.getCargo());
		if(!dadosFuncionario.getSalario().isNaN()) meuFuncionario.setSalario(dadosFuncionario.getSalario());
		
		funcionarioRepository.save(meuFuncionario);
		return meuFuncionario;
	}
	@PutMapping("/demitir/{idFuncionario}")
	public Funcionario demitirFuncionario(@PathVariable int idFuncionario) throws Exception{
		Funcionario myFuncionario = funcionarioRepository.findById(idFuncionario)
				.orElseThrow(() -> new IllegalAccessException());
		if(myFuncionario.getHabilitado() == true) {
			myFuncionario.setHabilitado(false);
		}
		
		funcionarioRepository.save(myFuncionario);
		return myFuncionario;
	}
	@PutMapping("/reajustar/{idFuncionario}")
	public Funcionario reajustarFuncionario(@PathVariable int idFuncionario, @RequestBody Funcionario dadosFuncionario) throws Exception{
		Funcionario myFuncionario = funcionarioRepository.findById(idFuncionario)
				.orElseThrow(() -> new IllegalAccessException());
		
		if(myFuncionario.getSalario()<dadosFuncionario.getSalario()) {
			myFuncionario.setSalario(dadosFuncionario.getSalario());
		}
		
		funcionarioRepository.save(myFuncionario);
		return myFuncionario;
	}
	
	@DeleteMapping("/{id}")
	public void deleteFuncionario(@PathVariable int id) {
		funcionarioRepository.deleteById(id);
	}
}
