// import 'casa.java'

public class Hello {
  public static void main(String[] args) {
    Casa casa1 = new Casa();
    casa1.set_quartos(2);
    System.out.println(casa1.get_quartos());

    Triangulo triangulo1 = new Triangulo(1, 1, 1);
    System.out.println(triangulo1.eEquilatero());
  }
}
