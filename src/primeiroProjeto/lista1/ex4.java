package primeiroProjeto.lista1;

	/*
	4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
	calcule a seguinte expressão:
	*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import static java.lang.Math.pow;

public class ex4 {
    public static void main(String[] args){

        int A, B, C, R, S;
        double D = 0;
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite um número inteiro e positivo: ");
        A = entrada.nextInt();

        System.out.println("Digite um número inteiro e positivo: ");
        B = entrada.nextInt();

        System.out.println("Digite um número inteiro e positivo: ");
        C = entrada.nextInt();

        R = (A + B)*(A + B);
        S = (B + C)*(B + C);
        D = ((R + S)/2);

        System.out.println("R = " + R + " S = " + S + " D = " + D);

    }
}
