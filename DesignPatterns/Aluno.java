package DesignPatterns;

// Classe concreta Aluno que atua como um Observer
public class Aluno implements Observer {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("Aluno " + nome + ": Recebi a seguinte mensagem - " + mensagem);
    }
}
