package Livraria2;

public class LivroDidatico extends Livro {

  private String area;

  public LivroDidatico(String nome, String autorPrincipal, String editora, String resumo, float preco, String area) {
    super(nome, autorPrincipal, editora, resumo, preco);
    this.area = area;
  }

  @Override
  public float consultarPrecoFinal() {
    return this.preco * 0.02f;
  }
}