package br.com.habitten.sistema.repository;

import br.com.habitten.sistema.models.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
    Usuario findByLogin(String login);
}
