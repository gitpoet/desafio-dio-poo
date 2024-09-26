import br.com.dantas.desafioDioPoo.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());



        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcap Java developer");
        bootcamp.setDescricao("Descrição Bootcamp java developer");
        bootcamp.getConsteudos().add(curso1);
        bootcamp.getConsteudos().add(curso2);
        bootcamp.getConsteudos().add(mentoria1);
        Dev dev = new Dev();
        dev.setNome("Carlos");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos: " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteúdo conscluídos: " + dev.getConsteudosConcluidos());
        System.out.println(dev.calcularTotalXp());
        System.out.println(bootcamp.getDataInicial());



        Dev dev2 = new Dev();
        dev2.setNome("Ivana");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdo conscluídos: " + dev2.getConsteudosConcluidos());
        System.out.println(dev2.calcularTotalXp());






    }
}