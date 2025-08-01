package dio.desafio.dominio;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

  private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
      this.conteudosInscritos.addAll(bootcamp.getConteudos());
      bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
      Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
      if(conteudo.isPresent()){
        this.conteudosConcluidos.add(conteudo.get());
        this.conteudosInscritos.remove(conteudo.get());
      } else {
        System.err.println("Você não está matriculado em nenhum conteúdo!");
      }
    }

    public double calcularTotalXp() {
      if (this.conteudosConcluidos.isEmpty()) {
        return 0;
      }
      return this.conteudosConcluidos.stream()
              .mapToDouble(Conteudo::calcularXp)
              .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;

        return nome != null ? nome.equals(dev.nome) : dev.nome == null;
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }
}
