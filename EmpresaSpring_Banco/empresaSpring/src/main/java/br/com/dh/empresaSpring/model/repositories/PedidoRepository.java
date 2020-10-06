package br.com.dh.empresaSpring.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.dh.empresaSpring.model.entities.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

}
