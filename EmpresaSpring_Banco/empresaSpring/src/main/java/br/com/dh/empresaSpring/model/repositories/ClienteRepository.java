package br.com.dh.empresaSpring.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.dh.empresaSpring.model.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
