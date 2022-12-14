package primeiroProjeto.lista1;

    /*
    6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
    P(x1, y1) e P(x2, y2), escreva a distância entre eles.
     */

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class ex6 {
    public static void main(String[] args){

        double x1 = 0.0, y1, x2, y2, d;
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do x1: ");
        x1 = entrada.nextFloat();

        System.out.println("Digite o valor do y1: ");
        y1 = entrada.nextFloat();

        System.out.println("Digite o valor do x2: ");
        x2 = entrada.nextFloat();

        System.out.println("Digite o valor do y2: ");
        y2 = entrada.nextFloat();

        d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("A distância entre os pontos será igual a: " + decimal.format(d));

    }
}
