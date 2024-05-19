# Java-Basico---Dio
É um repositório para armazenar todos codigos do curso de java basico da Plataforma DIO.

Onde há a Criação da atividade Simulando uma conta bancaria através do Terminal/Console;
criação de um pequeno sistema para validação de processo seletivo;
Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet e com UML sendo classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +atender()
        +iniciarCorreioVoz()
        +ligar(String numero)
    }

    class NavegadorInternet {
        +adicionarNovaAba()
        +atualizarPagina()
        +exibirPagina(String url)
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
