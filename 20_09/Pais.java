import java.util.ArrayList;

public class Pais {
  private String nome, nomeCapital;
  private ArrayList<Pais> listaFronteiras;

  public Pais(String nome, String nomeCapital) {
    this.nome = nome;
    this.nomeCapital = nomeCapital;
    this.listaFronteiras = new ArrayList<Pais>();
  }

  // Agregação fraca, pois o país pode pertencer à várias listas de fronteiras
  public void addFronteira(Pais pais) {
    this.listaFronteiras.add(pais);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNomeCapital() {
    return nomeCapital;
  }

  public void setNomeCapital(String nomeCapital) {
    this.nomeCapital = nomeCapital;
  }

  public ArrayList<Pais> getListaFronteiras() {
    return listaFronteiras;
  }

  public void setListaFronteiras(ArrayList<Pais> listaFronteiras) {
    this.listaFronteiras = listaFronteiras;
  }
}
