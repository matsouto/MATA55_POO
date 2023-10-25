public class Terreno extends Imovel
{
    private String tipoArea;
    private boolean areaPreservacaoAmbiental;


    // Construtor para a classe Terreno
    public Terreno(String numeroInscricao, String endereco, float areaTotal, float valorTotal, char tipoLocalizacao, boolean areaPreservacaoAmbiental, String tipoArea)
    {
        super(numeroInscricao, endereco, areaTotal, valorTotal, tipoLocalizacao);
        this.tipoArea = tipoArea;
        this.areaPreservacaoAmbiental = areaPreservacaoAmbiental;
    }


    /*
     * calcularTaxa() é um método que traz algumas
     * adições à forma de cálculo do método de mesmo nome
     * da superclasse Imovel.
     * Além da taxação padrão, ele:
     * 1. cobra 20% de taxa, caso o terreno esteja em área
     *    de preservação;
     * 2. dá um desconto de 10%, caso seja umterreno em
     *    área rural.
    */
    @Override
    public float calcularTaxa()
    {
        float taxa = super.calcularTaxa();

        if (this.areaPreservacaoAmbiental)
            taxa += super.getValorTotal()*0.2f;
        
        if (this.tipoArea.equals("rural"))
        {
            taxa *= 0.9f;
        }

        return taxa;
    }



    // Métodos gets 
    public String getTipoArea() { return this.tipoArea; }

    public boolean isAreaPreservacaoAmbiental() { return this.areaPreservacaoAmbiental; }


    // Métodos sets
    public void setTipoArea(String tipoArea) {
    this.tipoArea = tipoArea;
    }

    public void setAreaPreservacaoAmbiental(boolean areaPreservacaoAmbiental)
    {
        this.areaPreservacaoAmbiental = areaPreservacaoAmbiental;
    }


    @Override
    public String toString()
    {
        String message = super.toString(); //invoca o método toString() da classe pai

        return String.format("%s É área de preservação? %b \nTipo da área: %s \n", message, this.areaPreservacaoAmbiental, this.tipoArea);
    }
}