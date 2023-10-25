import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    private static ArrayList<Passageiro> listaPassageiros = new ArrayList<Passageiro>();
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        System.out.println("\n\n############ COMPANHIA AÉREA ############\n\n");

        menu();

        sc.close();
    }


    public static void menu()
    {
        boolean flag = true;
        int opcao;

        while (flag)
        {
            System.out.println("Menu:");
            System.out.println("0 - sair");
            System.out.println("1 - cadastrar passageiro");
            System.out.println("2 - registrar milhas");
            System.out.println("3 - listar passageiros\n");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao)
            {
                case 0:
                    System.out.println("Encerrando o sistema...");
                    System.out.println("Sistema encerrado");
                    flag = false;
                    break;
                case 1:
                    cadastrarPassageiro();
                    break;
                case 2:
                    registrarMilhas();
                    break;
                case 3:
                    listarPassageiros();
                    break;
                default:
                    System.out.println("Opção inválida! \n");
            }
        }
    }


    /*
     * cadastrarPassageiro() faz o cadastramento de um passageiro.
     * Caso a idade informada seja não-positiva, o atributo idade
     * não é inicializado.
     */
    public static void cadastrarPassageiro()
    {
        String nome, cpf;
        int vip, idade;
        Passageiro passageiro;

        System.out.println("\n\n############ CADASTRAMENTO DE PASSAGEIRO ############\n\n");

        System.out.print("Informe o nome do passageiro: ");
        nome = sc.nextLine(); 

        System.out.print("Informe o CPF do passageiro: ");
        cpf = sc.nextLine();

        System.out.print("Informe a idade do passageiro: ");
        idade = sc.nextInt();
        sc.nextLine();
        
        System.out.println("O passageiro é VIP? \n[1] SIM \n[2] NÃO ");
        vip = sc.nextInt();
        sc.nextLine();

        if (vip == 1)
        {
            System.out.print("Informe o numero do cartao: ");
            String numCartao = sc.nextLine();

            System.out.print("Informe a bandeira: ");
            String bandeira = sc.next();


            /* 
             * POLIMORFISMO
             * passageiro é uma referência da classe Passageiro, mas
             * essa referência vai passar a apontar para uma instância 
             * da classe PassageiroVip
            */
            if (idade > 0)
            {
                passageiro = new PassageiroVip(nome, cpf, idade, numCartao, bandeira);
            }
            else
            {
                passageiro = new PassageiroVip(nome, cpf, numCartao, bandeira);
            }
                
        }
        else
        {
            if (idade > 0)
            {
                passageiro = new Passageiro(nome, cpf, idade);
            }
            else
            {
                passageiro = new Passageiro(nome, cpf);
            }
        }

        listaPassageiros.add(passageiro);

        System.out.println("\n\nPassageiro cadastrado com sucesso!\n\n");
    }


    /*
     * registrarMilhas() adicona milhas para um passageiro a partir do
     * número de CPF. 
     * Se as milhas forem não-positivas, elas não são
     * adicionadas ao array de milhas do passageiro.
     */
    public static void registrarMilhas()
    {
        String cpf;

        System.out.println("\n\n############ REGISTRO DE MILHAS ############\n\n");

        System.out.print("Informe o CPF do passageiro que receberá as milhas: ");
        cpf = sc.nextLine();

        for (Passageiro passageiro : listaPassageiros)
        {
            if (cpf.equals(passageiro.getCpf()))
            {
                System.out.print("Insira a data do voo: ");
                String data = sc.nextLine();

                System.out.print("Insira o número do voo: ");
                int numero = sc.nextInt();
                sc.nextLine();

                System.out.print("Insira a quantidade de milhas: ");
                float qtdMilhas = sc.nextFloat();
                sc.nextLine();

                if (qtdMilhas > 0)
                {
                    /*
                     * Uso do polimorfismo
                     * JVM vai decidir em tempo de execução se o método a
                     * ser chamado é o da classe Passageiro ou da classe
                     * PassageiroVip
                     */
                    passageiro.adicionaRegistro(data, numero, qtdMilhas);

                    System.out.println("\n\nMilhas adicionadas com sucesso!\n\n");
                }
                else
                {
                    System.out.println("\n\nA quantidade de milhas deve ser positiva!\n\n");
                }

                return;
            }
        }

        System.out.println("\n\nPassageiro não encontrado!\n\n");
    }


    /*
     * Exibe uma listagem dos passageiros, informando o nome
     * e se é passageiro VIP ou comum
     */
    public static void listarPassageiros()
    {
        System.out.println("\n\n############ LISTAGEM DE PASSAGEIROS ############\n\n");

        if (!listaPassageiros.isEmpty())
        {
            for (Passageiro passageiro : listaPassageiros)
            {
                if (passageiro instanceof PassageiroVip)
                {
                    // Verifica se é uma instância da classe PassageiroVip
                    System.out.printf("Passageiro VIP: %s \n", passageiro.getNome());
                }
                else
                {
                    System.out.printf("Passageiro comum: %s \n", passageiro.getNome());
                }
            }

            System.out.println("\n\n");
        }
        else
        {
            System.out.println("Não há passageiros cadastrados!\n\n");
        }
    }
}
