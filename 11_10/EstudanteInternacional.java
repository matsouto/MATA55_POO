public class EstudanteInternacional extends Estudante {
  String paisOrigem;

  public EstudanteInternacional(String nomeEscola, int serie, String nome, String endereco, String paisOrigem) {
    super(nomeEscola, serie, nome, endereco);
    this.paisOrigem = paisOrigem;

  }
}
