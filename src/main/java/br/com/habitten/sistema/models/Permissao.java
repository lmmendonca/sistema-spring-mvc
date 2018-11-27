package br.com.habitten.sistema.models;

import org.springframework.security.core.GrantedAuthority;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Permissao implements GrantedAuthority {

    @Id
    @NotNull
    private Long id;

    @NotNull
    private String categoria;

    @ManyToMany(mappedBy = "permissoes")
    private List<Usuario> usuarios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String getAuthority() {
        return null;
    }
}
