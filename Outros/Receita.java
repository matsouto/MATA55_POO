package Outros;

import java.util.ArrayList;

public class Receita {
  private Paciente paciente;
  private ArrayList<Medicamento> ListaMedicamentos;

  public Receita(String nome, String endereco, String cpf) {
    this.paciente = new Paciente(nome, endereco, cpf);
    this.ListaMedicamentos = new ArrayList<Medicamento>();
  }
}
