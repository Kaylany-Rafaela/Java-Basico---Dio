package Abstração;

public class Curso extends Conteudo {

    private int cargaHoraria;

    // Construtor padrão
    public Curso() {
    }

    // Construtor com parâmetros
    public Curso(String titulacao, String descricao, int cargaHoraria) {
        super(titulacao, descricao); // Chama o construtor da superclasse Conteudo com os parâmetros titulacao e descricao
        this.cargaHoraria = cargaHoraria; // Inicializa a carga horária do curso
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria; // Calcula e retorna a experiência do curso baseada na carga horária
    }

    public int getCargaHoraria() {
        return cargaHoraria; // Retorna a carga horária do curso
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria; // Define a carga horária do curso, verificando se não é negativa
        } else {
            throw new IllegalArgumentException("Carga horária não pode ser negativa."); // Lança uma exceção se a carga horária for negativa
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulacao='" + getTitulacao() + '\'' + // Retorna uma representação em string do curso com titulação e descrição
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
