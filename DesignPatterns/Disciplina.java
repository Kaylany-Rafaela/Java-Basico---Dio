package DesignPatterns;

// Classe concreta Disciplina que atua como um Subject
import java.util.ArrayList;
import java.util.List;

public class Disciplina implements Subject {
    private String nome;
    private List<Observer> observers;

    public Disciplina(String nome) {
        this.nome = nome;
        this.observers = new ArrayList<>();
    }

    @Override
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers(String mensagem) {
        for (Observer observer : observers) {
            observer.update(mensagem);
        }
    }

    // Método para simular a atualização de resultados de uma prova
    public void atualizarResultados(String mensagem) {
        System.out.println("Notificando alunos sobre os resultados da prova de " + nome);
        notificarObservers(mensagem);
    }
}
