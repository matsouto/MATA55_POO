package SchoolBus;

public class Endereco {

  private String rua, coplemento, bairro;
  private int number;

  public Endereco(String rua, String coplemento, String bairro, int number) {
    this.rua = rua;
    this.coplemento = coplemento;
    this.bairro = bairro;
    this.number = number;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getCoplemento() {
    return coplemento;
  }

  public void setCoplemento(String coplemento) {
    this.coplemento = coplemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

}
