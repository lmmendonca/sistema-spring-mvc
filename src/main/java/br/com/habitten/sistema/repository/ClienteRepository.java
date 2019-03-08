package br.com.habitten.sistema.repository;

import br.com.habitten.sistema.model.vendas.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findById(long id);

}
