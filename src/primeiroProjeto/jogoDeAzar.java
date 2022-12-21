package primeiroProjeto;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.Random;

public class jogoDeAzar {
    public static void main(String[] args){

        int opcao = 0, valor = 0, saldo = 100;
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        while(true) {

            System.out.println("\n========= MENU ========\n" +
                    "\n1- Saldo atual" +
                    "\n2- Continuar jogando" +
                    "\n3- Parar de jogar e ficar com o saldo atual"
            );
            try {
                System.out.println("Digite a opção desejada: ");
                opcao = entrada.nextInt();
            }catch (InputMismatchException erro1) {
                     System.err.println("Opção inválida");
                     entrada.nextLine(); //descarta a entrada errada do usuário
            }
            switch (opcao) {

                case 1:
                    System.out.println("O seu saldo é: R$" + saldo);
                    break;

                case 2:
                    valor = random.nextInt(99) + 1;
                    if (valor < 50) {
                        saldo = saldo - valor;
                    } else if (valor > 50) {
                        saldo = saldo + valor / 2;
                    } else {
                        saldo = saldo;
                    }

                    if (saldo >= 200) {
                        System.out.println("Parabéns !! Você ganhou o jogo !! Seu saldo é: R$" + saldo);
                        System.exit(2);
                    }
                    if (saldo <= 0) {
                        System.out.println("Infelizmente você perdeu o jogo. Seu saldo é: R$ " + saldo);
                        System.exit(2);
                    }

                    break;

                case 3:
                    System.out.println("Seu saldo ficou em: " + saldo + "\nObrigado e até mais!");
                    System.exit(3);
                    break;

                default:
                    System.out.println("Os valores aceitos são de 1 até 3.");
            }
        }
    }
}

