public class ContaCorrente extends ContaBancaria{

    private double taxaSaque = 1.50;

    public ContaCorrente(String titular) {
        super(titular);

    }

    @Override
    public void sacar(double  valor) {
        double valorTotal = valor + this.taxaSaque;

        if (valor > 0 && this.saldo >= valorTotal){
            this.saldo -= valorTotal;
            System.out.println("Saque de $" + valor + "realizado com sucesso (taxa de " + this.taxaSaque + ").");
        } else{
            System.out.println("Saque negado! saldo insuficiente para cobir o valor e a taxa.");

    }
}
