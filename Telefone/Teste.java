package Telefone;

public class Teste {
    public static void main(String[] args) {
        // Criando uma instância de Telefone
        AparelhoTelefonico.Telefone telefone = new AparelhoTelefonico.Telefone();

        // Utilizando os métodos do Telefone
        telefone.getReprodutor().selecionarMusica("Nome da Música");
        telefone.getReprodutor().tocar();

        telefone.getAparelhoTelefonico().ligar("123456789");
        telefone.getAparelhoTelefonico().atender();

        telefone.getNavegador().exibirPagina("https://github.com/Kaylany-Rafaela");
        telefone.getNavegador().adicionarNovaAba();
        telefone.getNavegador().atualizarPagina();
    }
}
