package BancoDio;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeJuros;  // Taxa de juros da conta poupança

    // Construtor que inicializa o número da conta, titular e taxa de juros
    public ContaPoupanca(String numero, Cliente titular, double taxaDeJuros) {
        super(numero, titular);  // Chama o construtor da classe base (ContaBancaria)
        this.taxaDeJuros = taxaDeJuros;  // Define a taxa de juros
    }

    // Método para calcular e adicionar os juros ao saldo
    public void calcularJuros() {
        double juros = getSaldo() * taxaDeJuros;  // Calcula os juros com base no saldo e na taxa de juros
        depositar(juros);  // Adiciona os juros ao saldo
    }

    // Implementação do método sacar para a conta poupança
    @Override
    public void sacar(double valor) {
        if (valor > 0 && getSaldo() >= valor) {  // Verifica se o valor é positivo e se há saldo suficiente
            depositar(-valor);  // Realiza o saque subtraindo o valor do saldo
        } else {
            System.out.println("Saldo insuficiente.");  // Mensagem de erro se não houver saldo suficiente
        }
    }
}
