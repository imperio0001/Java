package primeiroProjeto.lista2;

    /*
    3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
    categoria ela se encontra:
     10-14 infantil
     15-17 juvenil
     18-25 adulto
    */

import java.util.Scanner;

public class ex3_lista2_java {
    public static void main(String[] args) {

        int idade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa em anos completos: ");
        idade = entrada.nextInt();

        if(idade >= 10 && idade <= 14){

            System.out.println("Essa pessoa encontra-se na categoria infantil.");

        }
        else if(idade > 14 && idade <= 17){

            System.out.println("Essa pessoa encontra-se na categoria juvenil.");
        }
        else if(idade > 17 && idade <= 25){

            System.out.println("Essa pessoa encontra-se na categoria adulto.");
        }
        else{

            System.out.println("Essa pessoa não encontra-se em nenhuma categoria.");

        }

        System.out.println("Final do programa.");
    }
}
