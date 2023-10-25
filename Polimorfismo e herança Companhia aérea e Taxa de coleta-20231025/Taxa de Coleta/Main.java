import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Beneficiario> beneficiarios = new ArrayList<Beneficiario>();
    private static ArrayList<Imovel> imoveis = new ArrayList<Imovel>();

    public static void main(String[] args) 
    {

        System.out.println("\n########## SISTEMA DE CÁLCULO DE TAXA ##########\n");

        menu();

        sc.close();
    }


    /*
     * Exibe um mmenu para o usuário escolher qual operação
     * será realizada
     */
    public static void menu()
    {
        int opcao;
        boolean flag = true; //variável de controle do loop
        
        while(flag)
        {
            System.out.println("Menu:");
            System.out.println("1 - cadastrar imóvel");
            System.out.println("2 - cadastrar beneficiário");
            System.out.println("3 - consultar taxa de um imóvel");
            System.out.println("4 - consultar taxa total de um beneficiário");
            System.out.println("5 - Sair\n");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao)
            {
                case 1:
                    cadastrarImovel();
                    break;
                case 2:
                    cadastrarBeneficiario();
                    break;
                case 3:
                    consultarTaxaImovel();
                    break;
                case 4:
                    consultarTaxaBeneficiario();
                    break;
                case 5:
                    System.out.println("Fechando o sistema...");
                    System.out.println("Sistema encerrado.");
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }


    // Métodos sobrecarregados cadastrarBeneficiario() 

    /* cadastrarBeneficiario() apenas cadastra um beneficiário
     * sem associar ele a um imóvel 
    */
    public static Beneficiario cadastrarBeneficiario()
    {
        String nome, cpf, escolha;
        Beneficiario beneficiario;

        System.out.println("\n\n########## CADASTRAMENTO DE BENEFICIÁRIO ##########");
        System.out.print("Digite o nome do beneficiário: ");
        nome = sc.nextLine();
        System.out.print("Digite o cpf do beneficiário: ");
        cpf = sc.nextLine();

        System.out.print("\nDeseja adicionar número de telefone? (S/N) ");
        escolha = sc.nextLine();

        if (escolha.toUpperCase().equals("S"))
        {
            System.out.print("Digite o número do telefone: ");
            String telefone = sc.nextLine();
            beneficiario = new Beneficiario(nome, cpf, telefone);
        }
        else
        {
            beneficiario = new Beneficiario(nome, cpf);
        }

        beneficiarios.add(beneficiario);

        System.out.println("\n\nBeneficiário cadastrado com sucesso!\n\n");

        return beneficiario;
    }


    /* MÉTODO POLIMÓRFICO
     * cadastrarBeneficiario(Imovel i) recebe uma instância
     * da classe imóvel ou de suas subclasses
     * (Apartamento, Terreno ou Casa) e, ao cadastrar um
     * beneficiário, adiciona automaticamente essa instância
     * Imovel ao array de imóveis desse beneficiário
     */
    public static void cadastrarBeneficiario(Imovel imovel)
    {

        Beneficiario beneficiario = cadastrarBeneficiario();

        beneficiario.addImovel(imovel);

        System.out.println("\n\n O beneficiário foi cadastrado e associado ao imóvel com sucesso!\n\n");
    }


    /*
     * cadastrarImovel() recebe todos os valores necessários 
     * para cadastrar um Imovel e, após isso, faz a chamada
     * de um método para completar o cadastro a depender
     * do tipo desejado: Apartamento, Terreno ou Casa.
     */
    public static void cadastrarImovel()
    {
        String numeroInscricao, endereco, escolha;
        float areaTotal, valorTotal;
        char tipoLocalizacao;
        Imovel imovel;

        System.out.println("\n\n########## CADASTRAMENTO DE IMÓVEL ##########");

        System.out.print("Digite o número de inscrição do imóvel: ");
        numeroInscricao = sc.nextLine();
        System.out.print("Digite o endereço do imóvel: ");
        endereco = sc.nextLine();
        System.out.print("Digite o tamanho da área do imóvel: ");
        areaTotal = sc.nextFloat();
        sc.nextLine();
        System.out.print("Digite o valor total do imóvel: ");
        valorTotal = sc.nextFloat();
        sc.nextLine();

        System.out.print("Digite o tipo de localização do imóvel: (A, B, C ou D) ");
        tipoLocalizacao = sc.nextLine().charAt(0);

        System.out.println("\nQual o tipo desse imóvel? Escolha uma das opções abaixo: ");
        System.out.println("1 - apartamento");
        System.out.println("2 - casa");
        System.out.println("3 - terreno");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao)
        {
            case 1:
                imovel = cadastrarApartamento(numeroInscricao, endereco, areaTotal, valorTotal, tipoLocalizacao);
                break;
            case 2:
                imovel = cadastrarCasa(numeroInscricao, endereco, areaTotal, valorTotal, tipoLocalizacao);
                break;
            case 3:
                imovel = cadastrarTerreno(numeroInscricao, endereco, areaTotal, valorTotal, tipoLocalizacao);
                break;
            default:
                imovel = null;
                System.out.println("Opção inválida!\n\n");
        }


        // Redireciona para a associação a um beneficiário
        if (imovel != null)
        {
            System.out.print("Você deseja associar esse imóvel a um beneficiário pré-existente? (S/N) ");
            escolha = sc.nextLine();

            if (escolha.toUpperCase().equals("S"))
                associarImovelBeneficiario(imovel);
            else
                cadastrarBeneficiario(imovel);
        }
        else
        {
            System.out.println("\n\nHouve alguma falha no cadastramento do imóvel. Por favor, tente novamente.\n\n");
        }
    }


    /* MÉTODO POLIMÓRFICO
     * Esse método recebe uma instância da classe Imovel -
     * ou de alguma de suas subclasses - e a adiciona ao
     * array de imóveis de um beneficiário já cadastrado.
     */
    public static void associarImovelBeneficiario(Imovel imovel)
    {
        String cpf;

        if (beneficiarios.size()>0)
        {
            System.out.print("Digite o número do CPF do beneficiário: ");
            cpf = sc.nextLine();

            for (Beneficiario beneficiario : beneficiarios)
            {
                if (beneficiario.getCpf().equals(cpf))
                {
                    beneficiario.addImovel(imovel);
                    System.out.println("Imóvel e beneficiário associados com sucesso!\n\n");
                    return;
                }
            }

            System.out.println("Não foi encontrado nenhum beneficiário que possua esse número de CPF.\n\n");

        }
        else
        {
            System.out.println("Não há beneficiários cadastrados!\n\n");
        }
    }


    // Cadastramento de um imovel do tipo Apartamento
    public static Apartamento cadastrarApartamento(String numeroInscricao, String endereco, float areaTotal, float valorTotal, char tipoLocalizacao)
    {
        float areaPrivativa;
        char padraoConstrutivo;

        System.out.print("\nDigite o tamanho da área privativa: ");
        areaPrivativa = sc.nextFloat();
        sc.nextLine();

        System.out.print("Qual o padrão construtivo desse apartamento? (A, B, C ou D) ");
        padraoConstrutivo = sc.nextLine().charAt(0);

        Apartamento ap = new Apartamento(numeroInscricao, endereco, areaTotal, valorTotal, tipoLocalizacao, areaPrivativa, padraoConstrutivo);

        imoveis.add(ap);

        System.out.println("\n\nApartamento cadastrado com sucesso!\n\n");

        return ap;
    }


    // // Cadastramento de um imovel do tipo Casa
    public static Casa cadastrarCasa(String numeroInscricao, String endereco, float areaTotal, float valorTotal, char tipoLocalizacao)
    {
        float areaConstruida;
        char padraoConstrutivo;

        System.out.print("\nDigite o tamanho da área construída: ");
        areaConstruida = sc.nextFloat();
        sc.nextLine();

        System.out.print("Qual o padrão construtivo dessa casa? (A, B, C ou D) ");
        padraoConstrutivo = sc.nextLine().charAt(0);

        Casa casa = new Casa(numeroInscricao, endereco, areaTotal, valorTotal, tipoLocalizacao, padraoConstrutivo, areaConstruida);

        imoveis.add(casa);

        System.out.println("\n\nCasa cadastrada com sucesso!\n\n");

        return casa;

    }


    // Cadastramento de um imovel do tipo Terreno
    public static Terreno cadastrarTerreno(String numeroInscricao, String endereco, float areaTotal, float valorTotal, char tipoLocalizacao)
    {
        String tipoArea, escolha;
        boolean aPreservacao = false;

        System.out.print("\nDigite o tipo da área do terreno: (rural/urbana) ");
        tipoArea = sc.nextLine();

        System.out.print("O terreno está em uma área de preservação? (S/N) ");
        escolha = sc.nextLine();

        if (escolha.toUpperCase().equals("S"))
            aPreservacao = true;
    
        Terreno terreno = new Terreno(numeroInscricao, endereco, areaTotal, valorTotal, tipoLocalizacao, aPreservacao, tipoArea);

        imoveis.add(terreno);

        System.out.println("\n\nTerreno cadastrado com sucesso!\n\n");

        return terreno;

    }


    /* Consulta a taxa de um imóvel a partir do
     * número de inscrição
     */
    public static void consultarTaxaImovel()
    {
        System.out.println("\n\n########## CONSULTAR TAXA DE IMÓVEL ##########");

        System.out.print("Digite o número de inscrição do imóvel: ");
        String numeroInscricao = sc.nextLine();


        for (Imovel imovel : imoveis)
        {
            if (imovel.getNumeroInscricao().equals(numeroInscricao))
            {
                /* Uso do polimorfismo
                 * JVM vai decidir em tempo de execução de qual classe
                 * o método calcularTaxa() será chamado
                 */
                System.out.printf("O valor da taxa desse imóvel é de R$%.2f\n\n\n", imovel.calcularTaxa());
                return;
            }
        }

        System.out.println("Não foi encontrado nenhum imóvel que possua esse número de inscrição.\n\n");
    }


    /* Consulta o total de taxas a serem pagas
     * por um beneficiário a partir do seu CPF. 
     */
    public static void consultarTaxaBeneficiario()
    {
        System.out.println("\n\n########## CONSULTAR TAXA DE BENEFICIÁRIO ##########");

        System.out.print("Digite o número do CPF do beneficiário: ");
        String cpf = sc.nextLine();

        for (Beneficiario beneficiario : beneficiarios)
        {
            if (beneficiario.getCpf().equals(cpf))
            {
                System.out.printf("\nLista de imóveis de %s:\n", beneficiario.getNome());
                float valor = beneficiario.consultarTaxaImoveis();
                System.out.printf("\nTOTAL DE TAXAS: R$%.2f\n\n\n", valor);
                return;
            }
        }

        System.out.println("Não foi encontrado nenhum beneficiário que possua esse número de CPF.\n\n");
    }
}