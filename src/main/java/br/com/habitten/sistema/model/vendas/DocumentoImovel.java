package br.com.habitten.sistema.model.vendas;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DocumentoImovel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String matriculaRGI;
    private String descricao;
    private String indicacaoFiscal;
    private String cadastroPrefeitura;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMatriculaRGI() {
        return matriculaRGI;
    }

    public void setMatriculaRGI(String matriculaRGI) {
        this.matriculaRGI = matriculaRGI;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIndicacaoFiscal() {
        return indicacaoFiscal;
    }

    public void setIndicacaoFiscal(String indicacaoFiscal) {
        this.indicacaoFiscal = indicacaoFiscal;
    }

    public String getCadastroPrefeitura() {
        return cadastroPrefeitura;
    }

    public void setCadastroPrefeitura(String cadastroPrefeitura) {
        this.cadastroPrefeitura = cadastroPrefeitura;
    }
}
