package primeiroProjeto.lista2;

    /*
    2- Faça um programa que entre com três números e coloque em ordem crescente.
     */

import java.util.Scanner;

public class ex2_lista2_java {

    public static void main(String[] args) {

        int a, b, c;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro: ");
        a = entrada.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        b = entrada.nextInt();

        System.out.println("Digite o terceiro valor inteiro: ");
        c = entrada.nextInt();

        if(a > b && a > c){
            if(b > c){
                System.out.println("A ordem crescente dos números será: " + c + ", " + b + ", " + a + ".");
            }
            else{
                System.out.println("A ordem crescente dos números será: " + b + ", " + c + ", " + a + ".");
            }
        }
        else if(b > a && b > c){
            if(a > c){
                System.out.println("A ordem crescente dos números será: " + c + ", " + a + ", " + b + ".");
            }
            else{
                System.out.println("A ordem crescente dos números será: " + a + ", " + c + ", " + b + ".");
            }

        }
        else if(c > a && c > b){
            if(a > b){
                System.out.println("A ordem crescente dos números será: " + b + ", " + a + ", " + c + ".");
            }
            else{
                System.out.println("A ordem crescente dos números será: " + a + ", " + b + ", " + c + ".");
            }
        }

        System.out.println("Final do programa.");
    }
}
