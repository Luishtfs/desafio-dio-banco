public abstract class Conta implements IConta {
    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;
    protected int numero;
    protected int agencia;
    protected double saldo;

    protected String nome;

    public Conta(String nome) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.nome = nome;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirInfosComuns() {
        System.out.println(String.format("Nome: %s", this.nome));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    Aplicacoes listaAplicacoes = new Aplicacoes();
    public void imprimirAplicacoes(){
        System.out.println(listaAplicacoes);
    }
}