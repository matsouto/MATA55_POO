public class RegistroDeMilha 
{
    private int numeroVoo;
    private float qtdMilhas;
    private String dataVoo, status;


    /* Construtor da classe RegistroDeMilha
     * Inicializa todos os atributos
     */
    public RegistroDeMilha(String dataVoo, int numeroVoo, float qtdMilhas, String status)
    {
        this.dataVoo = dataVoo;
        this.numeroVoo = numeroVoo;
        this.qtdMilhas = qtdMilhas;
        this.status = status;
    }


    /* Construtor da classe RegistroDeMilha
     * Inicializa todos os atributos, à exceção do status.
     * Considera status = under analysis.
     */
    public RegistroDeMilha(String dataVoo, int numeroVoo, float qtdMilhas)
    {
        this(dataVoo, numeroVoo, qtdMilhas, "under analysis");
    }


    // Verifica se dois registros de milhas são iguais
    public boolean equals(RegistroDeMilha registro)
    {
        return (this.dataVoo.equals(registro.getDataVoo())) && (this.numeroVoo == registro.getNumeroVoo()) && (this.qtdMilhas == registro.getQtdMilhas()) && (this.status.equals(registro.getStatus()));
    }


    public String toString()
    {
        String msg = "";

        msg += "\nData: " + this.dataVoo;
        msg += "\nNúmero do voo: " + this.numeroVoo;
        msg += "\nQuantidade de milhas: " + this.qtdMilhas;
        msg += "\nStatus: " + this.status;

        return msg;
    }


    // Métodos sets
    public void setDataVoo(String dataVoo)
    {
        this.dataVoo = dataVoo;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public void setNumeroVoo(int numeroVoo)
    {
        this.numeroVoo = numeroVoo;
    }

    public void setQtdMilhas(float qtdMilhas)
    {
        this.qtdMilhas = qtdMilhas;
    }


    // Métodos gets
    public String getDataVoo()
    {
        return this.dataVoo;
    }

    public String getStatus()
    {
        return this.status;
    }

    public int getNumeroVoo()
    {
        return this.numeroVoo;
    }

    public float getQtdMilhas()
    {
        return this.qtdMilhas;
    }

}
