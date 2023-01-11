package primeiroProjeto.heranca.contaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        //ContaBancaria conta1 = new ContaBancaria(1111, 111, "Corinthienzo");
        ContaCorrente contaCorrente1 = new ContaCorrente(1111, 111, 1, "Corinthienzo", 5);

        System.out.println("Número da Agência: " + contaCorrente1.getAgencia());

    }
}
