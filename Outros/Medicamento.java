package Outros;

import java.util.Date;

public class Medicamento {
  private String nome, principio_ativo;
  private float preco;
  private Date data_fabricacao;
  private Date data_validade;

  public Medicamento(String nome, float preco, Date data_fabricacao, String principio_ativo) {
    this(nome, preco, data_fabricacao, null, principio_ativo);
  }

  public Medicamento(String nome, float preco, Date data_fabricacao, Date data_validade, String principio_ativo) {
    this.nome = nome;
    this.preco = preco;
    this.data_fabricacao = data_fabricacao;
    this.data_validade = data_validade;
    this.principio_ativo = principio_ativo;
  }
}
