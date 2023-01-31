public class ContaTeste {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.cliente = "Daniela";
        conta.saldo = 4000.00;
        conta.exibesaldo();

        conta.saque(1);
        conta.exibesaldo();
    }
    
}
