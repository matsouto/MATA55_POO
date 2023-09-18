import java.util.ArrayList;

public class Agenda {
  private String nome;
  private ArrayList<Contato> listaContatos;

  public void adicionarContato(Contato contato) {
    this.listaContatos.add(contato);
  }
}