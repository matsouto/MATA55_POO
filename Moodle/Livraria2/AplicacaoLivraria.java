package Livraria2;

import java.util.ArrayList;

public class AplicacaoLivraria {
  public String nomeLivraria;
  public ArrayList<Titulo> titulos;

  public void imprimirTitulos() {
    for (Titulo titulo : this.titulos) {
      System.out.println(titulo.getNome());
    }
  }
}
