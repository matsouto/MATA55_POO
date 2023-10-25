import java.util.ArrayList;

public class Beneficiario
{
    private String nome, cpf, telefone;
    private ArrayList<Imovel> imoveis;


    /*
    * Construtor para a classe Beneficiário:
    * Esse construtor inicializa todos os atributos.
    */ 
    public Beneficiario(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.imoveis = new ArrayList<Imovel>();
    }


    /*
    * Construtor para a classe Beneficiário:
    * Esse construtor inicializa apenas os atributos nome
    * e CPF.
    */ 
    public Beneficiario(String nome, String cpf)
    {
        this(nome, cpf, null);
    }


    /*
     * MÉTODO POLIMÓRFICO
     * addImovel() é um método que adiciona instâncias da
     * classe Imóvel ou de alguma de suas subclasses ao
     * array de imóveios de um beneficiário. 
     */
    public boolean addImovel(Imovel imovel)
    {
        if (imovel == null)
            return false;
        
        this.imoveis.add(imovel);

        return true;
    }


    /*
     * consultarTaxaImoveis() gera uma saída formatada contendo:
     * 1. uma lista dos imóveis de um determinado beneficiário
     *    e a respectiva taxa de cada um deles;
     * 2. o total da taxação a ser paga por esse beneficiário;
     */
    public float consultarTaxaImoveis()
    {
        float taxacaoTotal = 0f;
        for (Imovel imovel : imoveis)
        {
            System.out.printf("Imovel %s \n", imovel.getNumeroInscricao());

            /* 
             * Em tempo de execução, a máquina virtual Java vai decidir  
             * de qual classe será executado o método calcularTaxa() 
             */
            System.out.printf("Taxa: R$%.2f\n", imovel.calcularTaxa());
            taxacaoTotal += imovel.calcularTaxa();
        }

        return taxacaoTotal;
    }


    //Métodos gets
    public ArrayList<Imovel> getImoveis() { return this.imoveis; }

    public String getTelefone() { return this.telefone; }

    public String getNome() { return this.nome; }

    public String getCpf() { return this.cpf; }


    //Métodos sets
    public void setImoveis(ArrayList<Imovel> imoveis) 
    { 
        this.imoveis = imoveis; 
    }
    
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }


    public String toString()
    {
        String message = String.format("Beneficiário %s, CPF %s", this.nome, this.cpf);

        if (this.telefone != null)
        {
            message = String.format("%s e telefone %s.\n\n", message, this.telefone);
            return message;
        }

        return String.format("%s. \n\n", message);
    }
}