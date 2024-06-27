package Abstração;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data; // Data da mentoria

    // Construtor padrão
    public Mentoria() {
    }

    // Construtor com parâmetros
    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao); // Chama o construtor da superclasse Conteudo com título e descrição
        this.data = data; // Inicializa a data da mentoria
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d; // Calcula o XP da mentoria
    }

    public LocalDate getData() {
        return data; // Retorna a data da mentoria
    }

    public void setData(LocalDate data) {
        this.data = data; // Define a data da mentoria
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulação='" + getTitulacao() + '\'' + // Obtém a titulação da mentoria
                ", descricao='" + getDescricao() + '\'' + // Obtém a descrição da mentoria
                ", data=" + data + // Obtém a data da mentoria
                '}';
    }
}
