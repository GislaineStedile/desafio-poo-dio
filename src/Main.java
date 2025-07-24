import java.time.LocalDate;

import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        curso.setTitulo("Java Básico");
        curso.setDescricao("Aprenda os fundamentos de Java.");
        curso.setCargaHoraria(80);
        
        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Aprofunde seus conhecimentos em Java.");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
