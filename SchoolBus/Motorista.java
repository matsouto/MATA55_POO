package SchoolBus;

import java.util.Date;

public class Motorista {

  /*
   * Fields
   */

  private String nome_civil, nome, cpf_cnpj;
  private String mae, pai;
  private String naturalidade;
  private String rua, complemento, bairro;
  private String telefone;
  private String num_habilitacao, cat_habilitacao;

  private Date data_nascimento;

  private int numero;
  private int tipo; // servidor - 0 ou terceirizado - 1
  private int num_contrato; // apenas para tipo = 1

  /*
   * Constructors
   */

  public Motorista( // Servidor sem nome social
      String nome_civil,
      String cpf_cnpj,
      String mae,
      String pai,
      String naturalidade,
      String rua,
      String complemento,
      String bairro,
      String telefone,
      String num_habilitacao,
      String cat_habilitacao,
      Date data_nascimento,
      int numero) {
    this(nome_civil, nome_civil, cpf_cnpj, mae, pai, naturalidade, rua, complemento, bairro, telefone,
        num_habilitacao, cat_habilitacao, data_nascimento, numero);
  }

  public Motorista( // Terceirizado sem nome social
      String nome_civil,
      String cpf_cnpj,
      String mae,
      String pai,
      String naturalidade,
      String rua,
      String complemento,
      String bairro,
      String telefone,
      String num_habilitacao,
      String cat_habilitacao,
      Date data_nascimento,
      int numero,
      int num_contrato) {
    this(nome_civil, nome_civil, cpf_cnpj, mae, pai, naturalidade, rua, complemento, bairro, telefone,
        num_habilitacao, cat_habilitacao, data_nascimento, numero, num_contrato);
  }

  public Motorista( // Servidor
      String nome_civil,
      String nome,
      String cpf_cnpj,
      String mae,
      String pai,
      String naturalidade,
      String rua,
      String complemento,
      String bairro,
      String telefone,
      String num_habilitacao,
      String cat_habilitacao,
      Date data_nascimento,
      int numero) {
    this.nome_civil = nome_civil;
    this.nome = nome;
    this.cpf_cnpj = cpf_cnpj;
    this.mae = mae;
    this.pai = pai;
    this.naturalidade = naturalidade;
    this.rua = rua;
    this.complemento = complemento;
    this.bairro = bairro;
    this.telefone = telefone;
    this.num_habilitacao = num_habilitacao;
    this.cat_habilitacao = cat_habilitacao;
    this.data_nascimento = data_nascimento;
    this.numero = numero;
    this.tipo = 0;
  }

  public Motorista( // Terceirizado
      String nome_civil,
      String nome,
      String cpf_cnpj,
      String mae,
      String pai,
      String naturalidade,
      String rua,
      String complemento,
      String bairro,
      String telefone,
      String num_habilitacao,
      String cat_habilitacao,
      Date data_nascimento,
      int numero,
      int num_contrato) {
    this.nome_civil = nome_civil;
    this.nome = nome;
    this.cpf_cnpj = cpf_cnpj;
    this.mae = mae;
    this.pai = pai;
    this.naturalidade = naturalidade;
    this.rua = rua;
    this.complemento = complemento;
    this.bairro = bairro;
    this.telefone = telefone;
    this.num_habilitacao = num_habilitacao;
    this.cat_habilitacao = cat_habilitacao;
    this.data_nascimento = data_nascimento;
    this.numero = numero;
    this.tipo = 1;
    this.num_contrato = num_contrato;
  }

  /*
   * Methods
   */

  public boolean terceirizado() {
    if (this.tipo == 1) {
      return true;
    } else {
      return false;
    }
  }

  /*
   * Getters and Setters
   */

  public String getNome_civil() {
    return nome_civil;
  }

  public void setNome_civil(String nome_civil) {
    this.nome_civil = nome_civil;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf_cnpj() {
    return cpf_cnpj;
  }

  public void setCpf_cnpj(String cpf_cnpj) {
    this.cpf_cnpj = cpf_cnpj;
  }

  public String getMae() {
    return mae;
  }

  public void setMae(String mae) {
    this.mae = mae;
  }

  public String getPai() {
    return pai;
  }

  public void setPai(String pai) {
    this.pai = pai;
  }

  public String getNaturalidade() {
    return naturalidade;
  }

  public void setNaturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getNum_habilitacao() {
    return num_habilitacao;
  }

  public void setNum_habilitacao(String num_habilitacao) {
    this.num_habilitacao = num_habilitacao;
  }

  public String getCat_habilitacao() {
    return cat_habilitacao;
  }

  public void setCat_habilitacao(String cat_habilitacao) {
    this.cat_habilitacao = cat_habilitacao;
  }

  public Date getData_nascimento() {
    return data_nascimento;
  }

  public void setData_nascimento(Date data_nascimento) {
    this.data_nascimento = data_nascimento;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getTipo() {
    return tipo;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
  }

  public int getNum_contrato() {
    return num_contrato;
  }

  public void setNum_contrato(int num_contrato) {
    if (this.tipo != 1) {
      System.out.println("Método Inválido");
    } else {
      this.num_contrato = num_contrato;
    }
  }

}
