package IPTU;

public class Beneficiario {

  /*
   * Atributos
   */

  public String nome, rg, cpf, imovel;
  public float tamanho, renda, debitos;

  /*
   * Constructors
   */

  public Beneficiario(String nome, String rg) {
    this(nome, rg, "", "", 0, 0, 0);
  }

  public Beneficiario(
      String nome,
      String rg,
      String cpf,
      String imovel,
      float tamanho,
      float renda,
      float debitos) {
    this.nome = nome;
    this.rg = rg;
    this.cpf = cpf;
    this.imovel = imovel;
    this.tamanho = tamanho;
    this.renda = renda;
    this.debitos = debitos;
  }

  /*
   * Métodos
   */

  public void cadastrar(String imovel, float tamanho) {
    this.cadastrar(this.cpf, imovel, tamanho, this.renda, this.debitos);
  }

  public void cadastrar(float renda, float debitos) {
    this.cadastrar(this.cpf, this.imovel, this.tamanho, renda, debitos);
  }

  public void cadastrar(String cpf, String imovel, float tamanho, float renda, float debitos) {
    this.cpf = cpf;
    this.imovel = imovel;
    this.tamanho = tamanho;
    this.renda = renda;
    this.debitos = debitos;
  }

  public float calculoIPTURenda() {
    if (this.renda != 0) {
      if (this.renda <= 5000) {
        return this.debitos = this.renda * 0.1f;
      } else {
        return this.debitos = this.renda * 0.05f;
      }
    } else {
      return this.debitos = 0;
    }
  }

  public float calculoIPTUTamanho() {
    if (this.tamanho != 0) {
      return this.debitos = 10 * tamanho;
    } else {
      return this.debitos = 0;
    }
  }
}
