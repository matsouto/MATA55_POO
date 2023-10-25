public class Empregado extends Pessoa{
  private float salario;

  public Empregado(String nome, String cpf, float salario) {
    super(nome, cpf);
    this.salario = salario;
  }

  public float calculaEmprestimo() {
    return this.salario * (float)2;
  }
  public float getSalario(){
      return salario;}

  public String toString() {
    return super.toString() + ", salario: " + this.salario;
  }

}