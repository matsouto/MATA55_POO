public class Triangulo {

  /*
   * ----------------
   * Fields
   * ----------------
   */

  private float lado1;
  private float lado2;
  private float lado3;

  /*
   * ----------------
   * Getters and Setters
   * ----------------
   */

  public float getLado1() {
    return this.lado1;
  }

  public float getLado2() {
    return this.lado2;
  }

  public float getLado3() {
    return this.lado3;
  }

  public void setLado1(float lado1) {
    this.lado1 = lado1;
  }

  public void setLado2(float lado2) {
    this.lado2 = lado2;
  }

  public void setLado3(float lado3) {
    this.lado3 = lado3;
  }

  /*
   * ----------------
   * Constructors
   * ----------------
   */

  // Equilátero
  public Triangulo(float l1) {
    this.lado1 = l1;
    this.lado2 = l1;
    this.lado3 = l1;
  }

  // Isósceles
  public Triangulo(float l1, float l2) {
    this.lado1 = l1;
    this.lado2 = l2;
    this.lado3 = l2;
  }

  // Escaleno
  public Triangulo(float l1, float l2, float l3) {
    this.lado1 = l1;
    this.lado2 = l2;
    this.lado3 = l3;
  }

  /*
   * ----------------
   * Methods
   * ----------------
   */

  // Methods
  public boolean eEquilatero() {
    return this.lado1 == this.lado2 && this.lado2 == this.lado3;
  }
}
