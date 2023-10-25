package SchoolBus;

import java.util.ArrayList;

public class Escola extends PessoaJuridica {
  private ArrayList<Aluno> alunos;

  public Escola(String nome_oficial, String cpf_cnpj, String telefone, Endereco endereco, String nome_fantasia,
      int num_funcionario) {
    super(nome_oficial, cpf_cnpj, telefone, endereco, nome_fantasia, num_funcionario);
    this.alunos = new ArrayList<Aluno>();
  }

  @Override
  public void apresentarDados() {
    super.apresentarDados();
  }

  public boolean matricularAluno(Aluno aluno) {
    this.alunos.add(aluno);
    return true;
  }

  public boolean exibirAlunos() {
    if (!this.alunos.isEmpty()) {
      for (Aluno aluno : this.alunos) {
        System.out.println(
            "Matricula: " + aluno.getMatricula() + " CPF: " + aluno.getCpf_cnpj() + " Nome: " + aluno.getNome()
                + " Serie: "
                + aluno.getSerie());
      }
      return true;
    } else {
      return false;
    }
  }
}
