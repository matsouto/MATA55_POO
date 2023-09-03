public class Conta {
  private String agencia, tipo;
  private boolean especial;
  private int numero;
  private double limite = 0;
  private double saldo = 0;
  private double limiteUsado;
  private Titular titular;

  public Conta(Titular titular, String agencia, int numero) {
    this.especial = false;
    this.agencia = agencia;
    this.numero = numero;
    this.titular = titular;
  }

  public Conta(Titular titular, String agencia, int numero, double saldo) {
    this.especial = true;
    this.agencia = agencia;
    this.numero = numero;
    this.saldo = saldo;
    this.titular = titular;
    this.limite = 1000;
  }

  public boolean deposito(double valor) {
    if (this.titular != null) {
      this.saldo += valor;
      return true;
    } else {
      return false;
    }
  }

  public boolean saque(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    } else if (this.especial && this.saldo + (this.limite - this.limiteUsado) >= valor) {
      this.limiteUsado += valor - this.saldo;
      this.saldo = 0;
      return true;
    } else {
      return false;
    }
  }

  public double getSaldo() {
    return this.saldo;
  }

  public double getLimiteUsado() {
    return this.limiteUsado;
  }
}
