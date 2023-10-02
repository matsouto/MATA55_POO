package SchoolBus;

public class Veiculo {

  /*
   * Fields
   */

  private String placa, modelo;
  private int ano, capacidade;
  private int num_contrato, tipo;
  private Contrato contrato;

  /*
   * Constructors
   */

  // Próprio
  public Veiculo(String placa, String modelo, int ano, int capacidade) {
    this.placa = placa;
    this.modelo = modelo;
    this.ano = ano;
    this.capacidade = capacidade;
    this.tipo = 0;
  }

  // Alugado
  public Veiculo(String placa, String modelo, int ano, int capacidade, int num_contrato) {
    this.placa = placa;
    this.modelo = modelo;
    this.ano = ano;
    this.capacidade = capacidade;
    this.num_contrato = num_contrato;
    this.tipo = 1;
  }

  /*
   * Methods
   */

  public boolean alugado() {
    if (this.tipo == 1) {
      return true;
    } else {
      return false;
    }
  }

  /*
   * Getters and Setters
   */

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
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

  public int getTipo() {
    return tipo;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
  }

}
