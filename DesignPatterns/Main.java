package DesignPatterns;

// Classe Main para testar o padrão Observer
public class Main {
    public static void main(String[] args) {
        // Criando uma disciplina
        Disciplina matematica = new Disciplina("Matemática");

        // Criando alunos observadores
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");

        // Alunos se inscrevendo na disciplina
        matematica.adicionarObserver(aluno1);
        matematica.adicionarObserver(aluno2);

        // Simulando a atualização dos resultados da prova
        matematica.atualizarResultados("João: 8.5 / Maria: 7.0");

        // João decide não mais receber notificações
        matematica.removerObserver(aluno1);

        // Simulando outra atualização dos resultados da prova
        matematica.atualizarResultados("João: 9.0 / Maria: 6.5");
    }
}
