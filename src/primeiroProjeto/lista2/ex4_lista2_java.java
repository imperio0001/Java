package primeiroProjeto.lista2;

    /*
    4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
    número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    ímpar exiba o número elevado ao quadrado.
    */

import java.util.Scanner;

public class ex4_lista2_java {
    public static void main(String[] args) {

        double numero, raiz, potencia;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        numero = entrada.nextInt();

        if(numero%2 == 0){

            raiz = Math.sqrt(numero);

            System.out.println("A número digitado é par. A raiz quadrada de " + numero + " é igual a: " + raiz);

        }
        else{

        potencia = Math.pow(numero, 2);
        System.out.println("O número digitado é ímpar. O número " + numero + " elevado ao quadrado é igual a: " + potencia);
        }

        System.out.println("Final do programa.");
    }
}
