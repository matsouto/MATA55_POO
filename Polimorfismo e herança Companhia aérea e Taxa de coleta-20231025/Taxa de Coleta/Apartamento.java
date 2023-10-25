public class Apartamento extends Imovel {

    private float areaPrivativa;
    private char padraoConstrutivo;

    public Apartamento(String numeroInscricao, String endereco, float areaTotal, float valorTotal, char tipoLocalizacao, float areaPrivativa, char padraoConstrutivo)
    {
        super(numeroInscricao, endereco, areaTotal, valorTotal, tipoLocalizacao);
        this.areaPrivativa = areaPrivativa;
        this.padraoConstrutivo = padraoConstrutivo;
    }


    /*
     * calcularTaxa() é um método que traz algumas
     * adições à forma de cálculo do método de mesmo nome
     * da superclasse Imovel.
     * Além da taxação padrão, ele:
     * 1. cobra 5% de taxa, caso o apto tenha uma área 
     *    privativa maior que 300m2;
     * 2. adiciona taxação para os tipos construtivos A, B e C.
    */
    @Override
    public float calcularTaxa()
    {
        float taxa = super.calcularTaxa();

        if (this.areaPrivativa > 300)
            taxa += super.getValorTotal()*0.05f;

        switch (this.padraoConstrutivo)
        {
            case 'A':
                taxa += super.getValorTotal()*0.005f;
                break;
            case 'B':
                taxa += super.getValorTotal()*0.002f;
                break;
            case 'C':
                taxa += super.getValorTotal()*0.001f;
                break;
        }

        return taxa;
    }


    //Métodos gets
    public float getAreaPrivativa() { return areaPrivativa; }

    public char getPadraoConstrutivo() { return padraoConstrutivo; }


    //Métodos sets

    public void setAreaPrivativa(float areaPrivativa) 
    {
        this.areaPrivativa = areaPrivativa;
    }

    public void setPadraoConstrutivo(char padraoConstrutivo) 
    {
        this.padraoConstrutivo = padraoConstrutivo;
    }


    @Override
    public String toString()
    {
        String message = super.toString(); //invoca o método toString() da classe pai

        return String.format("%s Tipo do padrão construtivo: %c \nTamanho da área privativa: %f \n", message, this.padraoConstrutivo, this.areaPrivativa);
    }
}