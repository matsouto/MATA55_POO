public class Chefia extends Empregado {
  private float bonus;

  public Chefia(String nome, String cpf, float salario, float bonus) {
    super(nome, cpf, salario);
    this.bonus = bonus;
  }

  public float calculaEmprestimo() {
    return super.calculaEmprestimo() + this.bonus;
    //return 1000 + this.bonus //isso funciona?
  }

  public String toString() {
    return super.toString() + ", bonus chefia: " + this.bonus;
  }
}