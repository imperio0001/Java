package primeiroProjeto;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args){
        boolean sistema = true;
        int opcao;
        float valor = 0, soma = 0, saque = 0;
        Scanner entrada = new Scanner(System.in);

        while(sistema) {

            System.out.println("\nEscolha uma das opções: " +
                    "\n1- Saldo" +
                    "\n2- Sacar" +
                    "\n3- Depositar" +
                    "\n0- Sair");
            opcao = entrada.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("O seu saldo é: R$" + (soma - saque));
                    break;

                case 2:
                    System.out.println("Insira o valor que deseja sacar: ");
                    saque = entrada.nextFloat();
                    if (soma <= 0) {
                        System.out.println("Você não possui saldo para sacar.");
                    }
                    break;

                case 3:
                    System.out.println("Deposite um valor: ");
                    valor = entrada.nextFloat();
                    soma = soma + valor;
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    sistema = false;
                    break;

                default:
                    System.out.println("Opção inválida. Digite um valor de 0 até 3.");
            }
        }
    }
}
