package Abstração;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d; // Constante para XP padrão

    private String titulacao; // Titulação do conteúdo
    private String descricao; // Descrição do conteúdo

    // Construtor padrão
    public Conteudo() {
    }

    // Construtor com parâmetros
    public Conteudo(String titulacao, String descricao) {
        this.titulacao = titulacao; // Inicializa a titulação com o valor passado
        this.descricao = descricao; // Inicializa a descrição com o valor passado
    }

    // Método abstrato para calcular XP, a ser implementado nas subclasses concretas
    public abstract double calcularXp();

    // Getter para obter a titulação do conteúdo
    public String getTitulacao() {
        return titulacao;
    }

    // Setter para definir a titulação do conteúdo, com validação básica
    public void setTitulacao(String titulacao) {
        if (titulacao != null && !titulacao.isEmpty()) {
            this.titulacao = titulacao; // Define a titulação se não for nula ou vazia
        } else {
            throw new IllegalArgumentException("Titulação não pode ser nula ou vazia."); // Lança exceção se a titulação for inválida
        }
    }

    // Getter para obter a descrição do conteúdo
    public String getDescricao() {
        return descricao;
    }

    // Setter para definir a descrição do conteúdo
    public void setDescricao(String descricao) {
        this.descricao = descricao; // Define a descrição com o valor passado
    }
}
