package primeiroProjeto;

    /*
    8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos
    impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os
    impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
    */

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){

        double custo_consumidor, custo_fabrica, porcentagem_distribuidor = 0.28, imposto = 0.45;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro A: ");
        custo_fabrica = entrada.nextInt();

        custo_consumidor = custo_fabrica + custo_fabrica*porcentagem_distribuidor + custo_fabrica*imposto;

        System.out.println("O custo do consumidor será igual a " + custo_consumidor + " reais.");

    }
}
