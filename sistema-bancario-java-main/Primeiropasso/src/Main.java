public class Main {

    public static void main(String[] args){

        ContaBancaria conta1 = new ContaBancaria("Dev iniciante");

        conta1.depositar(500.0);
        conta1.sacar(150.0);
        conta1.sacar(1000.0);

        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo da conta: $ " + conta1.getSaldo());
    }


}