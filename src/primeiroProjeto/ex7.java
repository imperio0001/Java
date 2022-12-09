package primeiroProjeto;

    /*
    7. Um sistema de equações lineares do tipo:
    , pode ser resolvido segundo mostrado abaixo :
    x = (ce - bf)/(ae - bd) , y = (af - cd) / (ae - bd)
    Escreva um sistema que lê os coeficientes a,b,c,d,g e f e
    calcula e mostra os valores de x e y.
     */

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){

    double a, b, c, d, g, f, x, y;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o valor do a: ");
    a = entrada.nextInt();

    System.out.println("Digite o valor do b: ");
    b = entrada.nextInt();

    System.out.println("Digite o valor do c: ");
    c = entrada.nextInt();

    System.out.println("Digite o valor do d: ");
    d = entrada.nextInt();

    System.out.println("Digite o valor do g: ");
    g = entrada.nextInt();

    System.out.println("Digite o valor do f: ");
    f = entrada.nextInt();

    x = (c*g - b*f)/(a*g - b*d);
    y = (a*f - c*a)/(a*g - b*d);

    System.out.println("x = " + x + " y = " + y);

    }
}
