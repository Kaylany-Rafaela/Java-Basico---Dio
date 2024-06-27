package Abstração;

import java.time.LocalDate;

public class Roda {
    public static void main(String[] args) {
        // Criando cursos
        Curso curso1 = new Curso();
        curso1.setTitulacao("Curso de Java"); // Definindo o título do curso 1
        curso1.setDescricao("Descrição do curso de Java"); // Definindo a descrição do curso 1
        curso1.setCargaHoraria(8); // Definindo a carga horária do curso 1

        Curso curso2 = new Curso();
        curso2.setTitulacao("Curso de JavaScript"); // Definindo o título do curso 2
        curso2.setDescricao("Descrição do curso de JavaScript"); // Definindo a descrição do curso 2
        curso2.setCargaHoraria(4); // Definindo a carga horária do curso 2

        // Criando mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulacao("Mentoria de Java"); // Definindo a titulação da mentoria
        mentoria.setDescricao("Descrição da mentoria de Java"); // Definindo a descrição da mentoria
        mentoria.setData(LocalDate.now()); // Definindo a data atual para a mentoria

        // Criando bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
        bootcamp.adicionarConteudo(curso1); // Adicionando o curso 1 ao bootcamp
        bootcamp.adicionarConteudo(curso2); // Adicionando o curso 2 ao bootcamp
        bootcamp.adicionarConteudo(mentoria); // Adicionando a mentoria ao bootcamp

        // Criando desenvolvedores
        Dev devPaula = new Dev();
        devPaula.setNome("Paula"); // Definindo o nome da dev Paula
        devPaula.inscreverBootcamp(bootcamp); // Inscrito a dev Paula no bootcamp
        exibirProgressoDev(devPaula); // Exibindo o progresso da dev Paula

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor"); // Definindo o nome da dev Vitor
        devVitor.inscreverBootcamp(bootcamp); // Inscrito a dev Vitor no bootcamp
        devVitor.progredir(); // Progresso da dev Vitor
        exibirProgressoDev(devVitor); // Exibindo o progresso da dev Vitor
    }

    private static void exibirProgressoDev(Dev dev) {
        System.out.println("----- Progresso de " + dev.getNome() + " -----");
        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos()); // Exibe os conteúdos inscritos pelo dev
        System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos()); // Exibe os conteúdos concluídos pelo dev
        System.out.println("XP Total: " + dev.calcularTotalXp()); // Exibe o total de XP do dev
        System.out.println();
    }
}
