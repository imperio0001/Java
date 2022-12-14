package primeiroProjeto.lista1;

    /*
    3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
    expressa em segundos e mostre-o expresso em horas, minutos e segundos.
     */

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){

        int seg_evento, segC, minC, horaC;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tempo de duração do evento 1 da fábrica em segundos: ");
        seg_evento = entrada.nextInt();

        horaC = (seg_evento/3600);
        minC = ((seg_evento%3600)/60);
        segC = ((seg_evento%3600)%60);

        System.out.println("A idade em anos, meses e dias é: " + horaC + " hora(s), " + minC + " minuto(s) e " + segC + " segundo(s)");

    }
}
