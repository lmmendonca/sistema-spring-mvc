package br.com.habitten.sistema.repository;

import br.com.habitten.sistema.model.vendas.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {

}
