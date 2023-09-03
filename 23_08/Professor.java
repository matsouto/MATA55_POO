public class Professor {

  private String nome, departamento, data;
  private int n_registro;

  public Professor(String nome, String departamento, String data,
                   int n_registro) {

    this.nome = nome;
    this.departamento = departamento;
    this.data = data;
    this.n_registro = n_registro;
  }

  public Professor(String nome, String departamento, String data) {

    this(nome, departamento, "21/02/2001", registro);
  }
}
