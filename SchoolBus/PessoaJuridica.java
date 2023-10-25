package SchoolBus;

public class PessoaJuridica extends Pessoa {

  private String nome_fantasia;
  private int num_funcionario;

  public PessoaJuridica(String nome_oficial, String cpf_cnpj, String telefone, Endereco endereco, String nome_fantasia,
      int num_funcionario) {
    super(nome_oficial, cpf_cnpj, telefone, endereco);
    this.nome_fantasia = nome_fantasia;
    this.num_funcionario = num_funcionario;
  }

  public String getNome_fantasia() {
    return this.getNome_oficial();
  }

  public void setNome_fantasia(String nome_fantasia) {
    this.nome_fantasia = nome_fantasia;
  }

  public int getNum_funcionario() {
    return num_funcionario;
  }

  public void setNum_funcionario(int num_funcionario) {
    this.num_funcionario = num_funcionario;
  }

  public String getCNPJ() {
    return this.getCpf_cnpj();
  }

}
