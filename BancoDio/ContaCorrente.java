package BancoDio;

public class ContaCorrente extends ContaBancaria {
    private double limite;  // Limite da conta corrente

    // Construtor que inicializa o número da conta, titular e limite
    public ContaCorrente(String numero, Cliente titular, double limite) {
        super(numero, titular);  // Chama o construtor da classe base (ContaBancaria)
        this.limite = limite;  // Define o limite da conta corrente
    }

    // Implementação do método sacar para a conta corrente
    @Override
    public void sacar(double valor) {
        if (valor > 0 && getSaldo() + limite >= valor) {  // Verifica se o valor é positivo e se há saldo suficiente considerando o limite
            depositar(-valor);  // Realiza o saque subtraindo o valor do saldo
        } else {
            System.out.println("Saldo insuficiente.");  // Mensagem de erro se não houver saldo suficiente
        }
    }
}
