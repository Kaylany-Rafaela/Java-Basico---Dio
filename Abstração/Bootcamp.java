package Abstração;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome; // Nome do bootcamp
    private String descricao; // Descrição do bootcamp
    private final LocalDate dataInicial; // Data de início do bootcamp (definida na criação)
    private final LocalDate dataFinal; // Data de término do bootcamp (45 dias após a data inicial)
    private Set<Dev> devsInscritos; // Conjunto de devs inscritos no bootcamp
    private Set<Conteudo> conteudos; // Conjunto de conteúdos oferecidos no bootcamp

    // Construtor que recebe nome e descrição do bootcamp
    public Bootcamp(String nome, String descricao) {
        this.nome = nome; // Inicializa o nome com o valor passado
        this.descricao = descricao; // Inicializa a descrição com o valor passado
        this.dataInicial = LocalDate.now(); // Define a data inicial como a data atual
        this.dataFinal = this.dataInicial.plusDays(45); // Calcula a data final como 45 dias após a data inicial
        this.devsInscritos = new LinkedHashSet<>(); // Inicializa o conjunto de devs inscritos como um LinkedHashSet vazio
        this.conteudos = new LinkedHashSet<>(); // Inicializa o conjunto de conteúdos como um LinkedHashSet vazio
    }

    // Getter para obter o nome do bootcamp
    public String getNome() {
        return nome;
    }

    // Getter para obter a descrição do bootcamp
    public String getDescricao() {
        return descricao;
    }

    // Getter para obter a data inicial do bootcamp
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    // Getter para obter a data final do bootcamp
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    // Método para adicionar um dev à lista de devs inscritos no bootcamp
    public void adicionarDevInscrito(Dev dev) {
        this.devsInscritos.add(dev);
    }

    // Método para adicionar um conteúdo à lista de conteúdos oferecidos no bootcamp
    public void adicionarConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    // Getter para obter o conjunto de conteúdos oferecidos no bootcamp
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    // Método equals para comparar dois objetos Bootcamp com base em seus atributos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) &&
                Objects.equals(descricao, bootcamp.descricao) &&
                Objects.equals(dataInicial, bootcamp.dataInicial) &&
                Objects.equals(dataFinal, bootcamp.dataFinal) &&
                Objects.equals(devsInscritos, bootcamp.devsInscritos) &&
                Objects.equals(conteudos, bootcamp.conteudos);
    }

    // Método hashCode para gerar um código hash baseado nos atributos do bootcamp
    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
