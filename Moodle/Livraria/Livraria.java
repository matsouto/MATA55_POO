package Livraria;

import java.util.ArrayList;
import java.util.Iterator;

public class Livraria {
  private String nome, cnpj;
  private ArrayList<Livro> listaLivros;

  public Livraria() {
    this.listaLivros = new ArrayList<Livro>();
  }

  public boolean addLivro(
      String titulo,
      String autor,
      String area,
      float preco) {
    if (this.listaLivros != null) {
      this.listaLivros.add(new Livro(titulo, autor, area, preco, 0));
      return true;
    } else {
      return false;
    }
  }

  public boolean addLivro(
      String titulo,
      String autor,
      float preco) {
    if (this.listaLivros != null) {
      this.listaLivros.add(new Livro(titulo, autor, "multidisciplinar", preco, 0));
      return true;
    } else {
      return false;
    }
  }

  public boolean comprarLivro(
      String titulo,
      int quantidade) {
    for (Livro livro : listaLivros) {
      if (livro.getTitulo().equals(titulo)) {
        livro.setQuantidade(livro.getQuantidade() + quantidade);
        return true;
      }
    }
    return false;
  }

  public void consultarLivro(
      String vendedor,
      String titulo) {
    for (Iterator<Livro> it = this.listaLivros.iterator(); it.hasNext();) {
      Livro livro = it.next();
      if (livro.getTitulo().equals(titulo)) {
        System.out.println(
            "Titulo: " + livro.getTitulo() + "Preço: " + livro.getPreco() + "Quantidade: " + livro.getQuantidade());
        if (livro.getQuantidade() == 0) {
          System.out.println("Sem estoque, deseja fazer pedido de novos exemplares?");
        }
        return;
      }
    }
    System.out.println("Título não faz parte do nosso catálogo");
    return;
  }

  public void listagemMensal() {
    int total_quantidade = 0;
    for (Iterator<Livro> it = listaLivros.iterator(); it.hasNext();) {
      Livro livro = it.next();
      System.out.println(
          "Titulo: " + livro.getTitulo() + "Preço: " + livro.getPreco() + "Quantidade: " + livro.getQuantidade());
      total_quantidade = total_quantidade + livro.getQuantidade();
    }
    System.out.println("Quantidade total em estoque: " + total_quantidade);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public ArrayList<Livro> getListaLivros() {
    return listaLivros;
  }

  public void setListaLivros(ArrayList<Livro> listaLivros) {
    this.listaLivros = listaLivros;
  }

}
