package SchoolBus;

import java.util.ArrayList;

public class Rota {
  private ArrayList<PontoDeParada> pontosDeParada;
  private int id;
  public static int counter;

  public Rota() {
    this.pontosDeParada = new ArrayList<PontoDeParada>();
    this.id = counter;
    counter += 1;
  }

  // Exibir o número total de rotas criadas
  public static void totalRotas() {
    System.out.println(counter);
  }

  // Calcula a demanda total da rota
  public int calcularDemanda() {
    int demanda = 0;
    for (PontoDeParada pontoDeParada : this.pontosDeParada) {
      demanda += pontoDeParada.getAlunos().size();
    }
    return demanda;
  }
}
