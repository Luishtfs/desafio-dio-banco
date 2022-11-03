public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente("Luis");
        Conta poupanca = new ContaPoupanca("Luis");

        cc.depositar(100);

        cc.transferir(80, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.imprimirAplicacoes();
        poupanca.imprimirAplicacoes();
    }
}
