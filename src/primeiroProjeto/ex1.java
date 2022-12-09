package primeiroProjeto;

    /*
    1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
    dias e mostre-a expressa apenas em dias.
    Considere um ano tendo 365 dias e um mês contendo 30 dias.
	*/

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){

        int diaN = 0, mesN = 0, anoN, dias = 0, diaA = 23, mesA = 11, anoA = 2022;
        String nome;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite o ano do seu nascimento no formato aaaa: ");
        anoN = entrada.nextInt();

        System.out.println("Digite o mês do seu nascimento no formato mm: ");
        mesN = entrada.nextInt();

        System.out.println("Digite o dia do seu nascimento no formato dd: ");
        diaN = entrada.nextInt();

        // se a data de nascimento for menor que a data atual
        while(anoN < anoA || mesN < mesA || diaN < diaA) {
            dias++;
            diaN++;
            if(diaN > 30) {
                diaN = 1;
                mesN++;
                 if(mesN > 12) {
                    mesN = 1;
                    anoN++;
                }
            }
        }

        System.out.println("Olá " + nome+ ". Sua idade em dias é: " + dias + " dia(s).\n");
    }
}
