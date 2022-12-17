package primeiroProjeto.lacosRepeticao;

    /*
    6- Escrever um programa que receba vários números inteiros no teclado. E no
    final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).(DO...WHILE)
    */

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        int numero, mediaMultiploTres = 0, contador = 0, soma =0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\nDigite um número inteiro ou digite 0 para finalizar o sistema: ");
            numero = entrada.nextInt();

            if(numero % 3 == 0){

                contador++;
                soma = soma + numero;
                mediaMultiploTres = soma/contador;

            }
            System.out.println("A média dos números múltiplos de 3 é igual a: " + mediaMultiploTres);
        }
        while (numero != 0);

        System.out.println("Final do programa.");
    }
}
