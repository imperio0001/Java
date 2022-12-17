package primeiroProjeto.lacosRepeticao;

    /*
    5- Crie um programa que leia um número do teclado até que encontre um
    número igual a zero. No final, mostre a soma dos números
    digitados.(DO...WHILE)
    */

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){

        int numero, soma = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            soma = soma + numero;
        }
        while (numero != 0);

        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("Final do programa.");

    }
}
