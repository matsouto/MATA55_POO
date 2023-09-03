package Imobiliaria;

public class Fiador {

  /*
   * Fields
   */

  private String nome, cpf;
  private float renda_mensal;

  /*
   * Constructors
   */

  public Fiador(String nome, String cpf, float renda_mensal) {
    this.nome = nome;
    this.cpf = cpf;
    this.renda_mensal = renda_mensal;
  }

  /*
   * Getters and Setters
   */

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public float getRenda_mensal() {
    return renda_mensal;
  }

  public void setRenda_mensal(float renda_mensal) {
    this.renda_mensal = renda_mensal;
  }
}
