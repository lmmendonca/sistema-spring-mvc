package br.com.habitten.sistema.model.vendas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Cliente implements Serializable {

  private static final long serialVersionUID = 2L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String nome;

  private String sobrenome;

  private Date data_nascimento;

  private String rg;

  private Long cpf;

  private String nacionalidade;

  private Integer estado_civil;

  @ManyToOne
  @JoinColumn(name = "conjugue_id")
  private Cliente conjugue;

  private String telefone;

  private String celular;

  private String email;

  @ManyToOne
  @JoinColumn(name = "endereco_id")
  private Endereco endereco;

  private String proficao;

  @ManyToMany
  @JoinTable(name = "cliente_imovel", joinColumns =
          {@JoinColumn(name = "cliente_id", referencedColumnName = "id")}, inverseJoinColumns =
          {@JoinColumn(name = "imovel_id", referencedColumnName = "id")})
  private List<Imovel> imoveis;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public Date getData_nascimento() {
    return data_nascimento;
  }

  public void setData_nascimento(Date data_nascimento) {
    this.data_nascimento = data_nascimento;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public Long getCpf() {
    return cpf;
  }

  public void setCpf(Long cpf) {
    this.cpf = cpf;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public Integer getEstado_civil() {
    return estado_civil;
  }

  public void setEstado_civil(Integer estado_civil) {
    this.estado_civil = estado_civil;
  }

  public Cliente getConjugue() {
    return conjugue;
  }

  public void setConjugue(Cliente conjugue) {
    this.conjugue = conjugue;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public String getProficao() {
    return proficao;
  }

  public void setProficao(String proficao) {
    this.proficao = proficao;
  }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
}

