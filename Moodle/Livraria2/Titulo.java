package Livraria2;

public class Titulo {
  protected String nome, editora;
  protected float preco;

  public Titulo(String nome, String editora, float preco) {
    this.nome = nome;
    this.editora = editora;
    this.preco = preco;
  }

  public void consultarTitulo() {
    System.out.println("Nome: " + this.nome + " Editora: " + this.editora + " Preço: " + this.preco);
  }

  public float consultarPrecoFinal() {
    return this.preco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

}
