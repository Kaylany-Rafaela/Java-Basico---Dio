package Telefone;

public class AparelhoTelefonico {
    // Método para atender uma chamada
    public void atender() {
        System.out.println("Atendendo chamada...");
        // Implementação para atender chamada
    }

    // Método para iniciar o correio de voz
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        // Implementação para iniciar correio de voz
    }

    // Método para fazer uma ligação para um número específico
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
        // Implementação para fazer ligação
    }

    public static class NavegadorInternet {
        // Método para adicionar uma nova aba
        public void adicionarNovaAba() {
            System.out.println("Adicionando nova aba...");
            // Implementação para adicionar nova aba
        }

        // Método para atualizar a página atual
        public void atualizarPagina() {
            System.out.println("Atualizando página...");
            // Implementação para atualizar página
        }

        // Método para exibir uma página específica a partir de sua URL
        public void exibirPagina(String url) {
            System.out.println("Exibindo página: " + url);
            // Implementação para exibir página
        }
    }

    public static class ReprodutorMusical {
        // Método para tocar música
        public void tocar() {
            System.out.println("Tocando música...");
            // Implementação para tocar música
        }

        // Método para pausar a reprodução
        public void pausar() {
            System.out.println("Pausando música...");
            // Implementação para pausar música
        }

        // Método para selecionar uma música específica
        public void selecionarMusica(String musica) {
            System.out.println("Selecionando música: " + musica);
            // Implementação para selecionar música
        }
    }

    public static class Telefone {
        private ReprodutorMusical reprodutor;
        private AparelhoTelefonico aparelho;
        private NavegadorInternet navegador;

        // Construtor para inicializar as instâncias das classes associadas
        public Telefone() {
            this.reprodutor = new ReprodutorMusical();
            this.aparelho = new AparelhoTelefonico();
            this.navegador = new NavegadorInternet();
        }

        // Método para obter o reprodutor de música
        public ReprodutorMusical getReprodutor() {
            return reprodutor;
        }

        // Método para obter o aparelho telefônico
        public AparelhoTelefonico getAparelhoTelefonico() {
            return aparelho;
        }

        // Método para obter o navegador de internet
        public NavegadorInternet getNavegador() {
            return navegador;
        }
    }

}

