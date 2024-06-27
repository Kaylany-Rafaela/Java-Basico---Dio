package BancoDio;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private String nome;  // Nome do banco
    private Map<String, Cliente> clientes;  // Mapa de clientes, onde a chave é o CPF e o valor é o objeto Cliente

    // Construtor que inicializa o nome do banco e o mapa de clientes
    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new HashMap<>();  // Inicializa o mapa de clientes
    }

    // Método para adicionar um cliente ao mapa de clientes
    public void adicionarCliente(Cliente cliente) {
        if (!clientes.containsKey(cliente.getCpf())) {  // Verifica se o cliente já existe no mapa pelo CPF
            clientes.put(cliente.getCpf(), cliente);  // Adiciona o cliente ao mapa se não existir
        } else {
            System.out.println("Cliente com CPF " + cliente.getCpf() + " já existe.");  // Mensagem se o cliente já existir
        }
    }

    // Método para buscar um cliente pelo CPF
    public Cliente buscarClientePorCpf(String cpf) {
        return clientes.get(cpf);  // Retorna o cliente correspondente ao CPF, ou null se não existir
    }
}
