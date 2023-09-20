import java.util.ArrayList;

public class Continente {
  private String nome;
  private ArrayList<Pais> listaPaises;

  public Continente(String nome) {
    this.nome = nome;
    this.listaPaises = new ArrayList<Pais>();
  }

  // Agregação forte, pois o país é criado pelo continente
  public void addPais(String nome, String nomeCapital) {
    this.listaPaises.add(new Pais(nome, nomeCapital));
  }

  public void addFronteira(Pais pais, Pais fronteira) {
    pais.addFronteira(fronteira);
  }

  public void listarPaisesFronteiras() {
    for (Pais pais : listaPaises) {
      System.out.print(pais.getNome());
      for (Pais fronteira : pais.getListaFronteiras()) {
        System.out.println(fronteira.getNome());
      }
    }
  }
}
