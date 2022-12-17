package primeiroProjeto.lacosRepeticao;

    /*
    4- Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    pessoas, calcule e mostre: (WHILE)
     o número de pessoas calmas;
     o número de mulheres nervosas;
     o número de homens agressivos;
     o número de outros calmos;
     o número de pessoas nervosas com mais de 40 anos;
     o número de pessoas calmas com menos de 18 anos.
    */

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){

        int idade, numeroSexo, opcao, calma = 0, nervosa = 0, agressiva = 0,mulherNevosa = 0, homemAgrssivo = 0,
                outrosCalmos = 0, nervosaQuarentaMais = 0, pessoasMenosDezoitoCalmas = 0, contador = 0;
        Scanner entrada = new Scanner(System.in);

        while(contador < 2) {

            System.out.println("\nDigite a idade em números naturais: ");
            idade = entrada.nextInt();

            System.out.println("Digite a opção relacionada ao seu sexo da pessoa: \n1-feminino \n2-masculino \n3-Outros" );
            numeroSexo = entrada.nextInt();

            System.out.println("Escolha uma opcao relacionada a pessoa: \n 1- Calma \n 2- Nervosa \n 3- Agressiva");
            opcao = entrada.nextInt();

            if (opcao == 1){
                calma++;
            }

            if (numeroSexo == 1 && opcao == 2){
                mulherNevosa++;
            }

            if (numeroSexo == 2 && opcao == 3){
                homemAgrssivo++;
            }

            if (numeroSexo == 3 && opcao == 1){
                outrosCalmos++;
            }

            if(opcao == 2 && idade > 40){
                nervosaQuarentaMais++;
            }

            if (idade < 18 && opcao == 1){
                pessoasMenosDezoitoCalmas++;
            }


        contador++;
        }
        System.out.println("Número de pessoas calmas: " + calma);
        System.out.println("Número de mulheres nervosas: " + mulherNevosa);
        System.out.println("Número de homens agressivo: " + homemAgrssivo);
        System.out.println("Número de outros calmos: " + outrosCalmos);
        System.out.println("Número de pessoas nervosas com mais de 40 anos: " + nervosaQuarentaMais);
        System.out.println("Número de pessoas calmas com menos de 18 anos: " + pessoasMenosDezoitoCalmas);
    }
}
