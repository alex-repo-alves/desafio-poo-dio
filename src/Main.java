import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso(){{
            setTitulo("Curso Java");
            setDescricao("Descrição curso Java");
            setCargaHoraria(8);
        }};

        Curso curso2 = new Curso(){{
            setTitulo("Curso JS");
            setDescricao("Descrição curso JS");
            setCargaHoraria(4);
        }};

        Mentoria mentoria = new Mentoria(){{
            setTitulo("Mentoria Java");
            setDescricao("Descrição mentoria Java");
            setData(LocalDate.now());
        }};

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }

}
