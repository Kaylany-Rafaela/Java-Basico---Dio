import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nome_Cliente;
    private double saldo;

    //Contrutor da classe
    public ContaTerminal(int numero, String agencia, String nome_Cliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome_Cliente = nome_Cliente;
        this.saldo = saldo;
    }

    public void imprimir(){
        System.out.println(String.format("Olá " + nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque."));
    }

    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);

        System.out.println("Informe o Número da Agência:");
        String agencia = recebe.nextLine();

        System.out.println("Informe o Número da Conta:");
        int numero = recebe.nextInt();

        //Essa estrutura serve para consumir a quebra de linha pendente no buffer do objeto Scanner.
        recebe.nextLine();

        System.out.println("Informe o nome do Sr Cliente da Conta " + numero + ":");
        String nome_Cliente = recebe.nextLine();

        //Quando for informar um número com vírgula e não com ponto
        System.out.println("Informe o seu saldo:");
        double saldo = recebe.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nome_Cliente, saldo);
        conta.imprimir();
    }
}

