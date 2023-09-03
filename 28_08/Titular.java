public class Titular {
  private String nome, cpf, endereço, telefone;

  public Titular(String nome, String cpf, String endereço, String telefone) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereço = endereço;
    this.telefone = telefone;
  }

  public String getNome() {
    return this.nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public String getEndereço() {
    return this.endereço;
  }

  public String getTelefone() {
    return this.telefone;
  }
}
