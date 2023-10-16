import java.util.ArrayList;

public class PontoDeParada {
  private String nome;
  private double latitude, longitude;
  private int id;
  private ArrayList<Aluno> alunos;
  public static int counter;

  public PontoDeParada(String nome, double latitude,
      double longitude) {
    this.nome = nome;
    this.latitude = latitude;
    this.longitude = longitude;
    this.alunos = new ArrayList<Aluno>();
    this.id = counter;
    counter += 1;
  }

  // Exibir o número total de pontos de parada criadas
  public static void totalPontosDeParada() {
    System.out.println(counter);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ArrayList<Aluno> getAlunos() {
    return alunos;
  }

  public void setAlunos(ArrayList<Aluno> alunos) {
    this.alunos = alunos;
  }
}