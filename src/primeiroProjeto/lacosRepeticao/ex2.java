package primeiroProjeto.lacosRepeticao;

    /*
    2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
    */

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){

        int numero, par = 0, impar = 0, contador;
        Scanner entrada = new Scanner(System.in);

        for(contador = 0; contador < 10; contador++){
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            System.out.println("Contagem: " + numero);

            if(numero % 2 == 0){
                par++;
            }
            else{
                impar++;
            }
        }
        System.out.println("O total de números pares digitados é igual a: " + par);
        System.out.println("\nO total de números ímpares digitados é igual a: " + impar);
        System.out.println("Final do programa.");
    }
}
