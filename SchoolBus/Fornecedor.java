package SchoolBus;

import java.util.ArrayList;

public class Fornecedor extends PessoaJuridica {
  private ArrayList<Contrato> contratos;

  public Fornecedor(String nome_oficial, String cpf_cnpj, String telefone, Endereco endereco, String nome_fantasia,
      int num_funcionario) {
    super(nome_oficial, cpf_cnpj, telefone, endereco, nome_fantasia, num_funcionario);
    this.contratos = new ArrayList<Contrato>();
  }

  @Override
  public void apresentarDados() {
    super.apresentarDados();
  }
}
