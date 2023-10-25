import java.util.ArrayList;

public class Passageiro
{
    private String nome, cpf;
    private int idade;
    private ArrayList<RegistroDeMilha> registrosDeMilha;


    /*
     * Construtor da classe Passageiro
     * Inicializa todos os atributos
     */
    public Passageiro(String nome, String cpf, int idade)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.registrosDeMilha = new ArrayList<RegistroDeMilha>();
    }


    /*
     * Construtor da classe Passageiro
     * Inicializa todos os atributos, à exceção do atributo
     * idade
     */
    public Passageiro(String nome, String cpf)
    {
        this(nome, cpf, 0);
    }


    /*
     * adicionaRegistro() cria uma instância de RegistroDeMilha
     * e a adiciona ao array de milhas do passageiro
     */
    public void adicionaRegistro(String dataVoo, int numeroVoo, float qtdMilhas)
    {
        RegistroDeMilha registro = new RegistroDeMilha(dataVoo, numeroVoo, qtdMilhas);

        this.registrosDeMilha.add(registro);
       
    }


    // Métodos sobrecarregados consultaRegistro()

    /*
     * Verifica se há registro de milha de um determinado voo
     * baseando-se no número do voo e na data.
     */
    public String consultaRegistro(int numeroVoo, String dataVoo)
    {
        String msg = "Dados do voo: ";

        for (RegistroDeMilha registro : this.registrosDeMilha)
        {
            if (registro.getNumeroVoo() == numeroVoo)
            {
                if (registro.getDataVoo().equals(dataVoo))
                {
                    msg += registro.toString();

                    return msg;
                }
            }
        }

        return "Registro não encontrado";
    }


    /*
     * Recebe uma referÊncia de uma instância de RegistroDeMilha
     *  e verifica se ela está no array de milhas do passageiro
     */
    public String consultaRegistro(RegistroDeMilha registro)
    {
        String msg = "Dados do voo: ";

        for (RegistroDeMilha reg : this.registrosDeMilha)
        {
            if (registro.equals(reg))
            {

                msg += registro.toString();

                return msg;
            }
        }

        return "Registro não encontrado";
    }


    /*
     * Exibe uma listagem de todos os regisatros de milha de 
     * um passageiro e o total da quantidade de registros e
     * de milhas.
     */
    public void consultaRegistros()
    {
        int contador = 0;
        float qtdMilhas = 0;
        for (RegistroDeMilha registro : this.registrosDeMilha)
        {
            String msg = "Registro " + contador + ": ";
            msg += registro.toString();
            msg += "\n";
            System.out.println(msg);

            contador++;
            qtdMilhas += registro.getQtdMilhas();
        }

        if (this.registrosDeMilha.isEmpty())
        {
            System.out.println("Não há registro de milhas");
        }
        else
        {
            System.out.printf("Quantidade total de registros: %d\n", contador);
            System.out.printf("Quantidade total de milhas: %.0f\n" , qtdMilhas);
        }
    }

    /*
     * Exibe uma listagem dos regisatros de milha de um
     * passageiro.
     * Se @param par for true, exibe apenas os registros válidos
     * ou que estão em análise;
     * Se @param par for false, exibe apenas os registros que
     * estão expirados.
     */
    public void consultaRegistros(boolean par)
    {
        int contador = 0;
        float qtdMilhas = 0;

        if (par)
        {
            for (RegistroDeMilha registro : this.registrosDeMilha)
            {
                if (registro.getStatus().equals("valid") || registro.getStatus().equals("under analysIs"))
                {
                    String msg = "Registro " + contador + ": ";
                    msg += registro.toString();
                    msg += "\n";
                    System.out.println(msg);

                    contador++;
                    qtdMilhas += registro.getQtdMilhas();
                }

            }

            System.out.printf("Quantidade total de registros: %d\n", contador);
            System.out.printf("Quantidade total de milhas: %.0f\n" , qtdMilhas);

        }
        else
        {
            for (RegistroDeMilha registro : this.registrosDeMilha)
            {
                if (registro.getStatus().equals("expired"))
                {
                    String msg = "Registro " + contador + ": ";
                    msg += registro.toString();
                    msg += "\n";
                    System.out.println(msg);

                }
            }
        }

    }


    // Métodos sets
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public void setRegistrosDeMilha(ArrayList<RegistroDeMilha> registrosDeMilha)
    {
        this.registrosDeMilha = registrosDeMilha;
    }


    // Métodos gets
    public String getNome()
    {
        return this.nome;
    }

    public String getCpf()
    {
        return this.cpf;
    }

    public int getIdade()
    {
        return this.idade;
    }

    public ArrayList<RegistroDeMilha> getRegistroDeMilha()
    {
        return this.registrosDeMilha;
    }

}