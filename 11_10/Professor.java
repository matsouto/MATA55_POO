package 11_10;

public class Professor extends Pessoa{

  String nomeDisciplina;
  float salario;

  public Professor(String nomeDisciplina, float salario, String nome, String endereco){
    super(nome,endereco);
    this.nomeDisciplina = nomeDisciplina;
    this.salario = salario;
  }

  public String getNomeDisciplina() {
    return nomeDisciplina;
  }

  public void setNomeDisciplina(String nomeDisciplina) {
    this.nomeDisciplina = nomeDisciplina;
  }

  public float getSalario() {
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  

}
