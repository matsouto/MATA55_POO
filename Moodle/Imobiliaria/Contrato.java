package Imobiliaria;

public class Contrato {

  /*
   * Fields
   */

  private int numero, n_meses_total, n_meses_atraso_max, n_pres_pagas, n_pres_atraso;
  private float valor_aluguel, juros;
  private boolean status;
  private Fiador fiador;

  /*
   * Constructors
   */

  public Contrato(int numero, int n_meses_total, int n_meses_atraso_max, float valor_aluguel,
      float juros, Fiador fiador) {
    this.numero = numero;
    this.n_meses_total = n_meses_total;
    this.n_meses_atraso_max = n_meses_atraso_max;
    this.valor_aluguel = valor_aluguel;
    this.juros = juros;
    this.fiador = fiador;

    if (this.fiador.getRenda_mensal() > 3 * this.valor_aluguel) {
      this.status = true;
    } else {
      this.status = false;
    }
  }

  /*
   * Methods
   */

  public float consultarPrestacao() {
    return this.valor_aluguel / this.n_meses_total;
  }

  public float calcularPrestacaoAtraso() {
    return this.consultarPrestacao() + this.n_pres_atraso * this.juros;
  }

  public boolean pagarPrestacao() {
    if (this.n_pres_pagas < this.n_meses_total) {
      this.n_pres_pagas++;
      return true;
    } else {
      return false;
    }
  }

  public boolean verificarDespejo() {
    if (this.n_meses_total - this.n_pres_pagas > 6) {
      return (this.n_pres_atraso > this.n_meses_atraso_max) ? true : false;
    } else {
      return false;
    }
  }

  public boolean modificarRenda(float valor) {
    if (this.fiador != null) {
      this.fiador.setRenda_mensal(valor);
      return true;
    } else {
      return false;
    }
  }

  public boolean modificarFiador(Fiador fiador) {
    if (this.fiador != null) {
      this.fiador = fiador;
      return true;
    } else {
      return false;
    }
  }

  /*
   * Getters and Setters
   */

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getN_meses_total() {
    return n_meses_total;
  }

  public void setN_meses_total(int n_meses_total) {
    this.n_meses_total = n_meses_total;
  }

  public int getN_pres_pagas() {
    return n_pres_pagas;
  }

  public void setN_pres_pagas(int n_pres_pagas) {
    this.n_pres_pagas = n_pres_pagas;
  }

  public int getN_pres_atraso() {
    return n_pres_atraso;
  }

  public void setN_pres_atraso(int n_pres_atraso) {
    this.n_pres_atraso = n_pres_atraso;
  }

  public float getValor_aluguel() {
    return valor_aluguel;
  }

  public void setValor_aluguel(float valor_aluguel) {
    this.valor_aluguel = valor_aluguel;
  }

  public float getJuros() {
    return juros;
  }

  public void setJuros(float juros) {
    this.juros = juros;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public Fiador getFiador() {
    return fiador;
  }

  public void setFiador(Fiador fiador) {
    this.fiador = fiador;
  }

  public int getN_meses_atraso_max() {
    return n_meses_atraso_max;
  }

  public void setN_meses_atraso_max(int n_meses_atraso_max) {
    this.n_meses_atraso_max = n_meses_atraso_max;
  }

}