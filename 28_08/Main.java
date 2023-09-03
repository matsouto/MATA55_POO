import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {

    String nome = JOptionPane.showInputDialog("Digite seu nome: ");
    String cpf = JOptionPane.showInputDialog("Digite o CPF: ");
    String endereco = JOptionPane.showInputDialog("Digite o  endereço: ");
    String telefone = JOptionPane.showInputDialog("Digite o telefone: ");
    String agencia = JOptionPane.showInputDialog("Digite a agencia: ");
    int numero = JOptionPane.showInputDialog("Digite o numero da conta: ");
    double saldo = JOptionPane.showInputDialog("Digite o saldo inicial: ");

    Titular titular = new Titular(nome, cpf, endereco, telefone);

    if (saldo > 0) {
      Conta especial = new Conta(titular, agencia, numero, saldo);
    } else {
      Conta conta = new Conta(titular, agencia, numero);
    }

    JOptionPane.showMessageDialog(null, "O saldo em conta é: " + conta.getSaldo());
    JOptionPane.showMessageDialog(null, "O saldo em conta é: " + conta.getLimiteUsado());
  }
}
