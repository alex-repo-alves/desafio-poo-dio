import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp(){{
            setNome("Bootcamp Java Developer");
            setDescricao("Descrição do bootcamp Java Developer");
            getConteudos().add(curso1);
            getConteudos().add(curso2);
            getConteudos().add(mentoria);
        }};

        Dev devAlex = new Dev();
        devAlex.setNome("Alex");
        devAlex.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devAlex.getConteudosInscritos());

        devAlex.progredir();
        devAlex.progredir();

        System.out.println("-");
        System.out.println("Conteúdos concluídos: " + devAlex.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + devAlex.getConteudosInscritos());
        System.out.println("XP: " + devAlex.calcularTotalXp());

        System.out.println("-------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());

        devJoao.progredir();

        System.out.println("-");
        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }

}
