package BancoDio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;  // Nome do cliente
    private String cpf;  // CPF do cliente
    private List<ContaBancaria> contas;  // Lista de contas do cliente

    // Construtor que inicializa o nome e CPF do cliente, e a lista de contas
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();  // Inicializa a lista de contas
    }

    // Métodos getters para acessar os atributos privados
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    // Método para adicionar uma conta à lista de contas do cliente
    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    // Método para listar todas as contas do cliente
    public void listarContas() {
        for (ContaBancaria conta : contas) {  // Itera sobre a lista de contas
            System.out.println("Número: " + conta.getNumero() + " | Saldo: " + conta.getSaldo());  // Imprime informações de cada conta
        }
    }
}
