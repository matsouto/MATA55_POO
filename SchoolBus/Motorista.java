package SchoolBus;

import java.util.Date;
import java.util.ArrayList;

public class Motorista extends PessoaFisica {

  /*
   * Fields
   */

  private String rua, complemento, bairro;
  private String telefone;
  private String num_habilitacao, cat_habilitacao;

  private ArrayList<Contrato> contratos;

  private int numero;
  private int tipo; // servidor - 0 ou terceirizado - 1
  private int num_contrato; // apenas para tipo = 1

  /*
   * Constructors
   */

  public Motorista(String nome_oficial, String cpf_cnpj, String telefone, Endereco endereco, String nome, String mae,
      String pai, String naturalidade, Date data_nascimento, String rua, String complemento, String bairro,
      String telefone2, String num_habilitacao, String cat_habilitacao, int numero,
      int tipo, int num_contrato) {
    super(nome_oficial, cpf_cnpj, telefone, endereco, nome, mae, pai, naturalidade, data_nascimento);
    this.rua = rua;
    this.complemento = complemento;
    this.bairro = bairro;
    telefone = telefone2;
    this.num_habilitacao = num_habilitacao;
    this.cat_habilitacao = cat_habilitacao;
    this.numero = numero;
    this.tipo = tipo;
    this.num_contrato = num_contrato;
    this.contratos = new ArrayList<Contrato>();
  }

  /*
   * Methods
   */

  @Override
  public void apresentarDados() {
    super.apresentarDados();
    System.out.println(
        "rua: " + this.rua + " complemento: " + this.complemento + " bairro: " + this.bairro +
            " telefone: " + this.telefone +
            " num_habilitacao: " + this.num_habilitacao + " cat_habilitacao: " + this.cat_habilitacao +
            " numero: " + this.numero +
            " tipo: " + this.tipo + // servidor - 0 ou terceirizado - 1
            " num_contrato: " + this.num_contrato); // apenas para tipo = 1
  }

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
