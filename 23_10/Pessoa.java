public class Pessoa{
  private String nome;
  private String cpf;

  public Pessoa(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
  }

  public float calculaEmprestimo(){
     return 1000;
  }

  public String toString() {
    return this.nome + ", cpf: " + this.cpf;
  }
}