package SchoolBus;

import java.util.ArrayList;

public class Escola {
  private String nome, cnpj, telefone;
  private Endereco endereco;
  private ArrayList<Aluno> alunos;

  public Escola(String nome, String cnpj, String telefone) {
    this.nome = nome;
    this.cnpj = cnpj;
    this.telefone = telefone;
    this.alunos = new ArrayList<Aluno>();
  }

  public boolean matricularAluno(Aluno aluno) {
    this.alunos.add(aluno);
    return true;
  }

  public boolean exibirAlunos() {
    if (!this.alunos.isEmpty()) {
      for (Aluno aluno : this.alunos) {
        System.out.println(
            "Matricula: " + aluno.getMatricula() + " CPF: " + aluno.getCpf() + " Nome: " + aluno.getNome() + " Serie: "
                + aluno.getSerie());
      }
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

}
