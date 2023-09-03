public class Televisao {
  private String marca = "";
  private String canal = "canal_padrao";
  private String senha = "";
  private boolean power, smart;

  public Televisao(String marca, String senha) {
    this.marca = marca;
    this.senha = senha;
    this.power = false;
    this.smart = true;
  }

  public Televisao(String senha) {
    this.power = false;
    this.smart = false;
  }

  public boolear ligar() {
    return (this.power = true);
  }

  public boolean ligar(String canal) {
    this.canal = canal;
    this.power = true;
    return true;
  }

  public boolean ligar(String canal, String senha) {
    if (this.smart && this.senha == senha) {
      return (this.power = true);
    } else {
      return false;
    }
  }
}
