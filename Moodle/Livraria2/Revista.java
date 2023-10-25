package Livraria2;

public class Revista extends Titulo {
  String periodicidade;

  public Revista(String nome, String editora, String periodicidade, float preco) {
    super(nome, editora, preco);
    this.periodicidade = periodicidade;
  }

  @Override
  public float consultarPrecoFinal() {
    return this.preco * 0.1f;
  }
}
