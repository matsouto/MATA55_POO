package SchoolBus;

import java.util.Date;

import java.util.Iterator;

import java.util.ArrayList;

public class Contrato {
  private int num_contrato;
  private Date data_inicio;
  private Date data_fim;
  private double valor;
  private ArrayList<Veiculo> veiculos;
  private ArrayList<Motorista> motoristas;

  public Contrato(int num_contrato, Date data_inicio, Date data_fim, double valor) {
    this.num_contrato = num_contrato;
    this.data_inicio = data_inicio;
    this.data_fim = data_fim;
    this.valor = valor;
    this.veiculos = new ArrayList<Veiculo>();
    this.motoristas = new ArrayList<Motorista>();
  }

  public boolean addVeiculo(Veiculo veiculo) {
    if (veiculo.getTipo() == 1) {
      this.veiculos.add(veiculo);
      return true;
    } else {
      return false;
    }
  }

  public boolean addMotorista(Motorista motorista) {
    if (motorista.getTipo() == 1) {
      this.motoristas.add(motorista);
      return true;
    } else {
      return false;
    }
  }

  public boolean delVeiculo(Veiculo veiculo) {
    for (int i = 0; i <= this.veiculos.size(); i++) {
      if (this.veiculos.get(i).getPlaca().equals(veiculo.getPlaca())) {
        this.veiculos.remove(i);
        return true;
      } else {
        return false;
      }
    }
  }

  public boolean delMotorista(Motorista motorista) {
    for (int i = 0; i <= this.motoristas.size(); i++) {
      if (this.motoristas.get(i).getNome().equals(motorista.getNome())) {
        this.motoristas.remove(i);
        return true;
      } else {
        return false;
      }
    }
  }

  public int getNum_contrato() {
    return num_contrato;
  }

  public void setNum_contrato(int num_contrato) {
    this.num_contrato = num_contrato;
  }

  public Date getData_inicio() {
    return data_inicio;
  }

  public void setData_inicio(Date data_inicio) {
    this.data_inicio = data_inicio;
  }

  public Date getData_fim() {
    return data_fim;
  }

  public void setData_fim(Date data_fim) {
    this.data_fim = data_fim;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

}