package dio.desafio.dominio;

import java.time.LocalDate;

public non-sealed class Mentoria extends Conteudo{

  private LocalDate data;

  @Override
  public double calcularXp() {
    return XP_PADRAO + 20d;
  }

  public void setData(LocalDate data) {
    this.data = data;
  } 
  public LocalDate getData() {
    return data;
  }

  @Override
  public String toString() {
    return "Mentoria{" +
            "titulo='" + getTitulo() + '\'' +
            ", descricao='" + getDescricao() + '\'' +
            ", data=" + data +
            '}';
          }
}

