package primeiroProjeto.heranca.contaBancaria;

public class ContaCorrente extends ContaBancaria{
    private float saque;

    public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
        super(numero, agencia, tipo, titular, saldo);

    }

    public ContaCorrente () {
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

    public float getSaque () {
        return saque;
    }
}
