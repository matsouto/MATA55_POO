package IPTU;

public class Hello {
  public static void main(String[] args) {

    Beneficiario b1 = new Beneficiario("Alberto", "14.285.1232");
    b1.cadastrar("casa", 200f);
    b1.cadastrar(4000, 75857);
    System.out.println(b1.imovel);
    System.out.println(b1.tamanho);
    System.out.println(b1.renda);
    System.out.println(b1.debitos);
  }
}
