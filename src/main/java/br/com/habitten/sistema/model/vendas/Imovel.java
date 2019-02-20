package br.com.habitten.sistema.model.vendas;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Imovel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "categoriaImovel_id")
    private CategoriaImovel categoria;

    @NotNull
    private String titulo;

    private String descricao;

    @NotNull
    private double tamanho;

    @NotNull
    private double valor;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "empreendimento_id")
    private Empreendimento empreendimento;

    @OneToOne
    @JoinColumn(name = "documentoImovel_id")
    private DocumentoImovel documentoImovel;

    @ManyToMany(mappedBy = "imoveis")
    private List<Cliente> clientes;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CategoriaImovel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaImovel categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Empreendimento getEmpreendimento() {
        return empreendimento;
    }

    public void setEmpreendimento(Empreendimento empreendimento) {
        this.empreendimento = empreendimento;
    }

    public DocumentoImovel getDocumentoImovel() {
        return documentoImovel;
    }

    public void setDocumentoImovel(DocumentoImovel documentoImovel) {
        this.documentoImovel = documentoImovel;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
