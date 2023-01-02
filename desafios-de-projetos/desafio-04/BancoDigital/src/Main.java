public class Main {
    public static void main(String[] args) {

        Cliente miguel = new Cliente();
        miguel.setNome("Miguel");

        Conta cc = new ContaCorrente(miguel);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(miguel);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
