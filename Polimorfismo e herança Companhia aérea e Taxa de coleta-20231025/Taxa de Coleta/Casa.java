public class Casa extends Imovel
{

    private char padraoConstrutivo;
    private float areaConstruida;
  

    // Construtor para a classe casa
    public Casa(String numeroInscricao, String endereco, float areaTotal, float valorTotal, char tipoLocalizacao, char padraoConstrutivo, float areaConstruida)
    {
  
        super(numeroInscricao, endereco, areaTotal, valorTotal, tipoLocalizacao);
  
        this.padraoConstrutivo = padraoConstrutivo;
        this.areaConstruida = areaConstruida;
    }


    /*
     * calcularTaxa() é um método que traz algumas
     * adições à forma de cálculo do método de mesmo nome
     * da superclasse Imovel.
     * Além da taxação padrão, ele:
     * 1. cobra 0.05% de taxa, caso a área construída seja maior que 400m2;
     * 2. cobra 0.015%, caso o padrão construtivo seja do tipo A.
    */
    @Override
    public float calcularTaxa()
    {
        float taxa = super.calcularTaxa();

        if (this.areaConstruida > 400)
            taxa += super.getValorTotal()*0.005f;
        
        if (this.padraoConstrutivo == 'A')
            taxa += super.getValorTotal()*0.0015f;

        return taxa;
    }


    //Métodos gets
    public char getPadraoConstrutivo() { return this.padraoConstrutivo; }

    public float getAreaConstruida() { return this.areaConstruida; }


    //Métodos sets
    public void setPadraoConstrutivo(char padraoConstrutivo) 
    {
	    this.padraoConstrutivo = padraoConstrutivo;
    }

    public void setAreaConstruida(float areaConstruida) 
    {
	    this.areaConstruida = areaConstruida;
    }


    @Override
    public String toString() 
    {
        String message = super.toString(); //invoca o método toString() da classe pai

        return String.format("%s Tipo do padrão construtivo: %c \nTamanho da área construída: %f \n", message, this.padraoConstrutivo, this.areaConstruida);
    }
}  