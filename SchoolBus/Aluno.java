package SchoolBus;

import java.util.Date;

public class Aluno extends PessoaFisica {
  private String rua, complemento, bairro;
  private int numero;
  private String telefone;
  private int matricula;
  private String serie;
  private Escola escola;
  private PontoDeParada pontoDeParada;

  public Aluno(String nome_oficial, String cpf_cnpj, String telefone, Endereco endereco, String nome, String mae,
      String pai, String naturalidade, Date data_nascimento, String rua, String complemento, String bairro, int numero,
      String telefone2, int matricula, String serie, Escola escola, PontoDeParada pontoDeParada) {
    super(nome_oficial, cpf_cnpj, telefone, endereco, nome, mae, pai, naturalidade, data_nascimento);
    this.rua = rua;
    this.complemento = complemento;
    this.bairro = bairro;
    this.numero = numero;
    telefone = telefone2;
    this.matricula = matricula;
    this.serie = serie;
    this.escola = escola;
    this.pontoDeParada = pontoDeParada;
  }

  @Override
  public void apresentarDados() {
    super.apresentarDados();
    System.out.println(
        "rua: " + this.rua + " complemento: " + this.complemento + " bairro: " + this.bairro + " numero: " + this.numero
            + " telefone: " +
            this.telefone +
            " matricula: " +
            this.matricula +
            " serie: " + this.serie +
            " escola: " + this.escola +
            " ponto de parada: " + this.pontoDeParada);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMae() {
    return mae;
  }

  public void setMae(String mae) {
    this.mae = mae;
  }

  public String getPai() {
    return pai;
  }

  public void setPai(String pai) {
    this.pai = pai;
  }

  public String getNaturalidade() {
    return naturalidade;
  }

  public void setNaturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public Escola getEscola() {
    return escola;
  }

  public void setEscola(Escola escola) {
    this.escola = escola;
  }
}
