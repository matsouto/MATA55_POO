public class PassageiroVip extends Passageiro
{
    private String numeroDocartao, bandeira;


    /*
     * Construtor da classe PassageiroVip
     * Inicializa todos os atributos
     */
    public PassageiroVip(String nome, String cpf, int idade, String numeroDocartao, String bandeira)
    {
        super(nome, cpf, idade);
        this.numeroDocartao = numeroDocartao;
        this.bandeira = bandeira;
    }


    /*
     * Construtor da classe PassageiroVip
     * Inicializa todos os atributos, à exceção do atributo
     * idade
     */
    public PassageiroVip(String nome, String cpf, String numeroDocartao, String bandeira)
    {
        this(nome, cpf, 0, numeroDocartao, bandeira);
    }


    /*
     * adicionaRegistro() sobrescevre o método da superclasse e
     * adicona 50% a mais de milhas para os passageiros VIPs.
     */
    @Override  
    public void adicionaRegistro(String dataVoo, int numeroVoo, float qtdMilhas)
    {   
        qtdMilhas = qtdMilhas*1.5f;
        
        super.adicionaRegistro(dataVoo, numeroVoo, qtdMilhas);
    }


    // Métodos gets
    public String getNumeroDoCartao() { return this.numeroDocartao; }

    public String getBandeira() { return this.bandeira; }


    // Métodos sets
    public void setBandeira(String bandeira) 
    { 
        this.bandeira = bandeira; 
    }

    public void setNumeroDoCartao(String numeroDoCartao) 
    { 
        this.numeroDocartao = numeroDoCartao; 
    }

 
}