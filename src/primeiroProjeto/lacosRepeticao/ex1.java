package primeiroProjeto.lacosRepeticao;

    /*
    1- Informar todos os números de 1000 a 1999 que quando divididos por 11
    obtemos resto = 5. (FOR)
    */

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){

        int incremento;
        Scanner entrada = new Scanner(System.in);

        for(incremento = 1000; incremento <= 1999; incremento++){

            if(incremento % 11 == 5){

                System.out.println(incremento);

            }
        }

        System.out.println("Final do programa.");

    }
}
