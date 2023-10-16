package 'SchoolBus';

import java.util.Scanner;
import java.util.ArrayList;

import SchoolBus.Motorista;
import SchoolBus.Aluno;

public class Aplicacao {
  public static void main(String[] args) {

    // Guarda as variáveis criadas em listas
    ArrayList<Aluno> alunosMain = new ArrayList<Aluno>();
    ArrayList<Motorista> motoristasMain = new ArrayList<Motorista>();
    ArrayList<Contrato> contratosMain = new ArrayList<Contrato>();
    ArrayList<Escola> escolaMain = new ArrayList<Escola>();
    ArrayList<Veiculo> veiculosMain = new ArrayList<Veiculo>();
    ArrayList<PontoDeParada> pontosDeParadaMain = new ArrayList<PontoDeParada>();

    // Menu inicial
    menu();

  }

  public static void menu() {
    int selection;
    Scanner input = new Scanner(System.in);

    System.out.println("Escolha uma opção");
    System.out.println("-------------------------\n");
    System.out.println("1 - Criar classe");
    System.out.println("2 - Calcular demanda de rota");
    System.out.println("3 - Exibir número de rotas");
    System.out.println("4 - Exibir número de pontos de parada");
    System.out.println("5 - Quit");

    selection = input.nextInt();
    input.close();

    switch (selection) {
      case 1:
        menuClasses();
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        System.exit(0);
    }
  }

  public static void menuClasses() {
    int selection;
    Scanner input = new Scanner(System.in);

    System.out.println("Que classe deseja criar?");
    System.out.println("-------------------------\n");
    System.out.println("1 - Aluno");
    System.out.println("2 - Motorista");
    System.out.println("3 - Contrato");
    System.out.println("4 - Escola");
    System.out.println("5 - Veículo");
    System.out.println("6 - Ponto de Parada");

    selection = input.nextInt();

    switch (selection) {
      case 1:
        System.out.println("Insira o nome civil: ");
        String nome_civil = input.next();
        System.out.println("Insira o nome: ");
        String nome = input.next();
        System.out.println("Insira o nome da mãe: ");
        String mae = input.next();
        System.out.println("Insira o nome do pai: ");
        String pai = input.next();
        System.out.println("Insira a naturalidade: ");
        String naturalidade = input.next();
        System.out.println("Insira o cpf: ");
        String cpf = input.next();
        System.out.println("Insira a data de nascimento: ");
        String data_nascimento = input.next();
        System.out.println("Insira a rua: ");
        String rua = input.next();
        System.out.println("Insira o complemento: ");
        String complemento = input.next();
        System.out.println("Insira o bairro: ");
        String bairro = input.next();
        System.out.println("Insira o numero: ");
        int numero = input.nextInt();
        System.out.println("Insira o telefone: ");
        String telefone = input.next();
        System.out.println("Insira a matricula: ");
        int matricula = input.nextInt();
        System.out.println("Insira a serie: ");
        String serie = input.next();
        alunosMain.add(new Aluno(nome_civil, nome, mae, pai, naturalidade, cpf, data_nascimento, rua, complemento,
            bairro, numero, telefone, matricula, serie));
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        break;
      case 6:
        break;
        input.close();
    }
  }
}
