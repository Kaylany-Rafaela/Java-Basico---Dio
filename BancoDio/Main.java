package BancoDio;

// Imports das classes necessárias
import BancoDio.ContaCorrente;
import BancoDio.ContaPoupanca;
import BancoDio.Cliente;
import BancoDio.Banco;

public class Main {
    public static void main(String[] args) {
        // Criação do banco
        Banco banco = new Banco("Banco Digital");

        // Criação dos clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        // Adiciona os clientes ao banco
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Criação das contas correntes e poupanças
        ContaCorrente cc1 = new ContaCorrente("0001", cliente1, 500.0);
        ContaPoupanca cp1 = new ContaPoupanca("0002", cliente1, 0.01);
        ContaCorrente cc2 = new ContaCorrente("0003", cliente2, 300.0);

        // Adiciona as contas aos clientes
        cliente1.adicionarConta(cc1);
        cliente1.adicionarConta(cp1);
        cliente2.adicionarConta(cc2);

        // Realiza operações nas contas
        cc1.depositar(1000);  // Deposita 1000 na conta corrente de cliente1
        cc1.sacar(300);  // Saca 300 da conta corrente de cliente1
        cc1.consultarSaldo();  // Consulta o saldo da conta corrente de cliente1

        cp1.depositar(200);  // Deposita 200 na conta poupança de cliente1
        cp1.calcularJuros();  // Calcula os juros na conta poupança de cliente1
        cp1.consultarSaldo();  // Consulta o saldo da conta poupança de cliente1

        cc1.transferir(200, cc2);  // Transfere 200 da conta corrente de cliente1 para a conta corrente de cliente2

        // Lista as contas dos clientes
        cliente1.listarContas();  // Lista as contas de cliente1
        cliente2.listarContas();  // Lista as contas de cliente2
    }
}
