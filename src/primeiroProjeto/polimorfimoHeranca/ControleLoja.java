package primeiroProjeto.polimorfimoHeranca;

/*
Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/

import java.util.*;

public class ControleLoja {
    public static void main(String[] args) {
    int opcao;
    String item1 = "Bola de futebol";
    String item2 = "Bola de basquete";
    String item3 = "Bola de vôlei";
    int remove = 0;
    int escolhaItem;
    boolean sistema = true;
    Scanner entrada = new Scanner(System.in);
    int contador = 0;
    int valor = 0;
    String item, itemEdicao;
    List<String> estoque = new ArrayList<String>();
    List<Integer> quantidade = new ArrayList<Integer>();

        while(sistema){
            System.out.println("\n================ Sistema TOP de Linha ==============");
            System.out.println("====================================================");
            System.out.println("\n======== Escolha uma opção na lista abaixo: ======");
            System.out.println("========== 1 - Adicionar um novo item   ===========");
            System.out.println("========== 2 - Remover um item da lista ===========");
            System.out.println("========== 3 - Exibir todos os itens da lista =====");
            System.out.println("========== 4 - Editar um item da lista ============");
            System.out.println("========== 0 - Sair do sistema ====================");
            System.out.println("===================================================");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("opção 1");
                    System.out.println("Digite o número da opção do item abaixo para adicionar ao estoque: \n");
                    System.out.println("1 - Bola de futebol");
                    System.out.println("2 - Bola de basquete");
                    System.out.println("3 - Bola de vôlei");
                    escolhaItem = entrada.nextInt();
                    System.out.println("\nDigite a quantidade a ser inserida no estoque: ");
                    valor = entrada.nextInt();
                    if(escolhaItem == 1){
                        estoque.add(item1);
                        quantidade.add(valor);
                        System.out.println("Foram adicionadas " + quantidade + " do item " + item1 + " ao estoque.");
                    }else if(escolhaItem == 2){
                        estoque.add(item1);
                        quantidade.add(valor);
                        System.out.println("Foram adicionadas " + quantidade + " do item " + item2 + " ao estoque.");
                    }
                }
                case 2 -> {
                    System.out.println("opção 2");
                    System.out.println("Digite a opção do item que deseja apagar da lista");
                    System.out.println("1 - Bola de futebol");
                    System.out.println("2 - Bola de basquete");
                    System.out.println("3 - Bola de vôlei");
                    escolhaItem = entrada.nextInt();
                    if(escolhaItem == 1){
                        // quantidade.remove(valor); não é removida a qde
                        quantidade.removeAll(Collections.singleton(valor));
                        System.out.println("Foram removidas as quantidades do item " + item1 + " ao estoque.");
                    }
                }
                case 3 -> {
                    System.out.println("opção 3");
                    System.out.println("Itens que estão na lista: \n" + estoque + "\n Quantidades" + quantidade);
                }
                case 4 -> {
                    System.out.println("opção 4");
                    System.out.println("Digite o nome do item que deseja alterar");
                    item = entrada.next();
                    System.out.println("Agora digite o novo nome do item");
                    itemEdicao = entrada.next();
                    estoque.set(estoque.indexOf(item), itemEdicao);
                    System.out.println("O item " + item + " foi modificado para " + itemEdicao + " com sucesso");
                }
                case 0 -> {
                    System.out.println("Saindo do sistema");
                    sistema = false;
                    break;
                }

                default -> {
                    System.out.println("\nOpção inválida. Digite um valor de 0 até 4.");
                }
            }
        }
    }
}
