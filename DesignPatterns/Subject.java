package DesignPatterns;

// Interface Subject que define os métodos para adicionar, remover e notificar Observers
public interface Subject {
    void adicionarObserver(Observer observer);
    void removerObserver(Observer observer);
    void notificarObservers(String mensagem);
}
