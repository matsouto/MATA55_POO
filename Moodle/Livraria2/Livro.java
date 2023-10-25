package Livraria2;

public class Livro extends Titulo {
  private String autorPrincipal, resumo;

  public Livro(String nome, String autorPrincipal, String editora, String resumo, float preco) {
    super(nome, editora, preco);
    this.autorPrincipal = autorPrincipal;
    this.resumo = resumo;
  }

  @Override
  public float consultarPrecoFinal() {
    return this.preco * 0.03f;
  }

}
