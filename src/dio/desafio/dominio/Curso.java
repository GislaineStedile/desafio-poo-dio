package dio.desafio.dominio;

public non-sealed class Curso extends Conteudo{

  private int cargaHoraria;

  @Override
  public double calcularXp() {
    return XP_PADRAO * cargaHoraria;
  }
  
  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }
  public int getCargaHoraria() {
    return cargaHoraria;
  }

  @Override
  public String toString(){
    return "Curso{" +
            "titulo='" + getTitulo() + '\'' +
            ", descricao='" + getDescricao() + '\'' +
            ", cargaHoraria=" + cargaHoraria +
            '}';
  }

}
