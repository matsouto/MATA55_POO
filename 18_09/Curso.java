import java.util.ArrayList;

public class Curso {
  private int codigo;
  private String nome;
  private ArrayList<Disciplina> DisciplinasObrigatorias;
  private ArrayList<Disciplina> DisciplinasOptativas;

  public Curso() {
    this.DisciplinasObrigatorias = new ArrayList<Disciplina>();
    this.DisciplinasOptativas = new ArrayList<Disciplina>();
  }

  public void alterarCargaHorariaOptativa(int codigo, int cargaHoraria) {
    for (Disciplina disciplina : DisciplinasOptativas) {
      if (disciplina.getCodigo() == codigo) {
        disciplina.setCargaHoraria(cargaHoraria);
      }
    }
  }

  public void totalDisciplinas() {
    System.out.println(this.DisciplinasOptativas.size());
    System.out.println(this.DisciplinasObrigatorias.size());
  }

  public void totalCargaHoraria() {
    int totalOpt = 0;
    int totalObr = 0;

    for (Disciplina disciplina : DisciplinasOptativas) {
      totalOpt = totalOpt + disciplina.getCargaHoraria();
    }

    for (Disciplina disciplina : DisciplinasObrigatorias) {
      totalObr = totalObr + disciplina.getCargaHoraria();
    }
  }

  public void adicionarDisciplinaOpt(Disciplina disciplina) {
    this.DisciplinasOptativas.add(disciplina);
  }

  public void removerDisciplinaOpt(Disciplina disciplina) {
    this.DisciplinasOptativas.remove(disciplina);
  }

  public void adicionarDisciplinaObr(Disciplina disciplina) {
    this.DisciplinasObrigatorias.add(disciplina);
  }

  public void removerDisciplinaObr(Disciplina disciplina) {
    this.DisciplinasObrigatorias.remove(disciplina);
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<Disciplina> getDisciplinasObrigatorias() {
    return DisciplinasObrigatorias;
  }

  public void setDisciplinasObrigatorias(ArrayList<Disciplina> disciplinasObrigatorias) {
    DisciplinasObrigatorias = disciplinasObrigatorias;
  }

  public ArrayList<Disciplina> getDisciplinasOptativas() {
    return DisciplinasOptativas;
  }

  public void setDisciplinasOptativas(ArrayList<Disciplina> disciplinasOptativas) {
    DisciplinasOptativas = disciplinasOptativas;
  }

}
