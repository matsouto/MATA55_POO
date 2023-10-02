package Livraria;

public class Livro {
  private String titulo, autor, area;
  private float preco;
  private int quantidade;

  public Livro(String titulo, String autor, String area, float preco, int quantidade) {
    this.titulo = titulo;
    this.autor = autor;
    this.area = area;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
}
