package Abstração;

import java.util.*;

public class Dev {
    private String nome; // Nome do desenvolvedor
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); // Conjunto de conteúdos nos quais o dev está inscrito
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); // Conjunto de conteúdos concluídos pelo dev

    // Método para inscrever o dev em um bootcamp
    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcamp.adicionarDevInscrito(this); // Adiciona este Dev à lista de devs inscritos no bootcamp
        bootcamp.getConteudos().forEach(this::inscreverConteudo); // Inscreve este Dev em todos os conteúdos do bootcamp
    }

    // Método para inscrever o dev em um conteúdo específico
    public void inscreverConteudo(Conteudo conteudo) {
        this.conteudosInscritos.add(conteudo); // Adiciona o conteúdo aos conteúdos inscritos pelo dev
    }

    // Método para progredir no conteúdo (remover da lista de inscritos e adicionar aos concluídos)
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst(); // Encontra o primeiro conteúdo inscrito
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get()); // Adiciona o conteúdo aos concluídos
            this.conteudosInscritos.remove(conteudo.get()); // Remove o conteúdo dos inscritos
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!"); // Mensagem se não houver conteúdos inscritos
        }
    }

    // Método para calcular o total de XP acumulado pelos conteúdos concluídos
    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp) // Calcula o XP de cada conteúdo concluído
                .sum(); // Soma todos os XP
    }

    // Getters e setters para o nome, conteúdos inscritos e conteúdos concluídos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    // Métodos equals e hashCode para comparar dev por nome, conteúdos inscritos e conteúdos concluídos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
