package primeiroProjeto.classeObjeto.ex3;

import java.util.Scanner;

public class TesteCelular {
    public static void main(String[] args) {

        char opcao = 's';
        Scanner entrada = new Scanner(System.in);

        Celular novoCelular = new Celular("xiaomi" , "zenfone", 1500, 1);

        System.out.println("Marca do novo celular: " + novoCelular.getMarca());
        System.out.println("Modelo do novo celular: " + novoCelular.getModelo());
        System.out.println("Preço do novo celular: " + novoCelular.getPreco());
        System.out.println("Garantia do novo celular: " + novoCelular.getGarantiaFabricante() + " ano(s)");

        System.out.print("\nLigar o celular?[S/N]: ");
        opcao = entrada.next().charAt(0);

        if(opcao == 's' || opcao == 'S')
            novoCelular.setLigado(true);

        else if(opcao == 'n' || opcao == 'N')
            novoCelular.setLigado(false);


        if(novoCelular.isLigado())
            System.out.println("\nLigando o celular..." +
            "\n Celular ligado");

        else
            System.out.println("Ok");
    }
}
