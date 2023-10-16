package 11_10;

public class Estudante extends Pessoa {
  
  String nomeEscola;
  int serie;

  public Estudante(String nomeEscola, int serie, String nome, String endereco){
    super(nome, endereco);
    this.nomeEscola = nomeEscola;
    this.serie = serie;
  }
}
