package primeiroProjeto.lista1;

    /*
    5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é
    ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
     */

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){

        int peso1 = 2, peso2 = 3, peso3 = 5;
        float nota1, nota2, nota3, mf;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        nota1 = entrada.nextFloat();

        System.out.println("Digite a nota 2: ");
        nota2 = entrada.nextFloat();

        System.out.println("Digite a nota 3: ");
        nota3 = entrada.nextFloat();

        mf = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);

        System.out.println("A média final do aluno é: " + mf);

    }
}
