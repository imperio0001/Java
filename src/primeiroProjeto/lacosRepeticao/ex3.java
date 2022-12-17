package primeiroProjeto.lacosRepeticao;

    /*
    3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    idade for =-99. (WHILE)
    */

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){

        int idade = 0, contadorMenor21 = 0, contadorMaior50 = 0;
        Scanner entrada = new Scanner(System.in);

        while (idade != -99){

            System.out.println("Digite uma idade em números naturais ou digite -99 para finalizar o sistema: ");
            idade = entrada.nextInt();

            if(idade < 21 && idade >= 0){
                contadorMenor21++;
            }

            if(idade > 50){
                contadorMaior50++;
            }

            System.out.println("Total de pessoal com menos de 21 anos: " + contadorMenor21);
            System.out.println("Total de pessoal com mais de 50 anos: " + contadorMaior50);

        }

        System.out.println("Final do programa.");

    }
}
