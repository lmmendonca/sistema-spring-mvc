package br.com.habitten.sistema.repository;

import br.com.habitten.sistema.model.vendas.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
