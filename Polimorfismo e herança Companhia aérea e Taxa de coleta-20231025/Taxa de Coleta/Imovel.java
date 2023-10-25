public class Imovel
{
    private String numeroInscricao, endereco;
    private float areaTotal, valorTotal;
    private char tipoLocalizacao;


    // Construtor para a classe Imovel
    public Imovel(String numeroInscricao, String endereco, float areaTotal, float valorTotal, char tipoLocalizacao) 
    {
        this.numeroInscricao = numeroInscricao;
        this.endereco = endereco;
        this.areaTotal = areaTotal;
        this.valorTotal = valorTotal;
        this.tipoLocalizacao = tipoLocalizacao;
    }


    /*
     * calcularTaxa() é um método que retorna o valor da taxação de
     * um imóvel, baseando-se no tipo de localização do imóvel
     * e no valor total desse imóvel
    */
    public float calcularTaxa()
    {
        switch (this.tipoLocalizacao)
        {
            case 'A':
                return this.valorTotal*0.002f;
            case 'B':
                return this.valorTotal*0.0015f;
            case 'C':
                return this.valorTotal*0.001f;
            case 'D':
                return this.valorTotal*0.0005f;
            default:
                return Float.NaN;
        }
    }
  
    // Métodos gets para os atributos
    public String getNumeroInscricao() { return this.numeroInscricao; }

    public String getEndereco() { return this.endereco; }

    public float getAreaTotal() { return this.areaTotal; }

    public float getValorTotal() { return this.valorTotal; }

    public char getTipoLocalizacao() { return this.tipoLocalizacao; }


    // Métodos sets para os atributos
    public void setNumeroInscricao(String numeroInscricao) 
    {
        this.numeroInscricao = numeroInscricao;
    }
    
    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    public void setAreaTotal(float areaTotal) 
    {
        this.areaTotal = areaTotal;
    }

    public void setValorTotal(float valorTotal) 
    {
        this.valorTotal = valorTotal;
    }

    public void setTipoLocalizacao(char tipoLocalizacao) 
    {
        this.tipoLocalizacao = tipoLocalizacao;
    }


    public String toString()
    {
        return String.format("Número de inscrição: %s \nEndereço: %s \nÁrea total: %f \nValor total: R$%.2f \nTipo da localização: %s\n", this.numeroInscricao, this.endereco, this.areaTotal, this.valorTotal, this.tipoLocalizacao);
    }
}