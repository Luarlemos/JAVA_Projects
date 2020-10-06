package br.com.dh.empresaSpring.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.dh.empresaSpring.model.entities.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {

}
