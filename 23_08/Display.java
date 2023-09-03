public class Display {
  private int dimH, dimV;
  private String textoIni;

  public Display(int dimH, int dimV, String textoIni) {
    this.dimH = dimH;
    this.dimV = dimV;
    this.textoIni = textoIni;
  }

  public int getDimH() {
    return this.dimH;
  }

  public int getDimV() {
    return this.dimV;
  }

  public String getTextoIni() {
    return this.textoIni;
  }
}
