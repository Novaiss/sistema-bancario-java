public class ContaBancaria {


    private String titular;
    private double saldo;
    private int numeroConta;


    public ContaBancaria (String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return  this.saldo;
    }


    public void depositar(double valor){
         if (valor >0){
             this.saldo += valor;
             System.out.println("Depósito de $: " + valor + " realizado!");

         } else {
             System.out.println("Valor de depósito inválido.");
         }
     }


     public void sacar (double valor){

         if (valor > 0 && this.saldo >= valor) {
             this.saldo -= valor;
             System.out.println("Saque aprovado com sucesso!");

         } else{
             System.out.println("Saque negado! fundos insuficientes");
         }
     }
}
