package primeiroProjeto.lista2;

    /*
    1- Faça um programa que receba três inteiros e diga qual deles é o maior.
    */

import java.util.Scanner;

public class ex1_lista2_java {

    public static void main(String[] args){

        int a, b, c;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro: ");
        a = entrada.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        b = entrada.nextInt();

        System.out.println("Digite o terceiro valor inteiro: ");
        c = entrada.nextInt();

        if(a > b && a > c){

            System.out.println("O maior número digitado foi: " + a);
        }
        else if(b > c){

            System.out.println("O maior número digitado foi: " + b);

        }
        else{

            System.out.println("O maior número digitado foi: " + c);

        }

        System.out.println("Final do programa.");
    }
}
