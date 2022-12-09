package primeiroProjeto;

    /*
    2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
    expressa em anos, meses e dias.
    Considere um ano = 365 dias e 1 mês = 30 dias.
     */

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        int diav, dia = 0, mes = 0, ano = 0;
        String nome;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite a sua idade em dias: ");
        diav = entrada.nextInt();

        ano = (diav/365);
        mes = ((diav%365)/30);
        dia = ((diav%365)%30);

    System.out.println("Olá " + nome + " A idade em anos, meses e dias é: " + ano + " ano(s), "+ mes +" meses e " + dia + " dia(s)");

    }
}
