package BancoDio;

public abstract class ContaBancaria {
    private String numero;  // Número da conta
    private double saldo;  // Saldo da conta
    private Cliente titular;  // Titular da conta

    // Construtor que inicializa o número da conta e o titular, e define o saldo inicial como 0
    public ContaBancaria(String numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Métodos getters para acessar os atributos privados
    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        if (valor > 0) {  // Verifica se o valor do depósito é positivo
            saldo += valor;  // Adiciona o valor ao saldo
        }
    }

    // Método abstrato para saque, a ser implementado pelas subclasses
    public abstract void sacar(double valor);

    // Método para transferir um valor para outra conta
    public void transferir(double valor, ContaBancaria contaDestino) {
        if (valor > 0 && saldo >= valor) {  // Verifica se o valor é positivo e se há saldo suficiente
            sacar(valor);  // Realiza o saque da conta atual
            contaDestino.depositar(valor);  // Deposita o valor na conta de destino
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente ou valor inválido.");  // Mensagem de erro
        }
    }

    // Método para consultar o saldo da conta
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);  // Imprime o saldo atual
    }
}
