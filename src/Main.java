import br.com.dio.desafio.dominio.Curso;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso(){{
            setTitulo("Curso Java");
            setDescricao("Descrição curso Java");
            setCargaHoraria(8);
        }};

        System.out.println(curso);

    }

}
