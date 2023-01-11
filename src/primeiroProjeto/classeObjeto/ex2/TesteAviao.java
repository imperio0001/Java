package primeiroProjeto.classeObjeto.ex2;

public class TesteAviao {
    public static void main (String args[]){

        Aviao novoAviao = new Aviao("Airbus 350", 5, 1980, "medio");

        System.out.println("Modelo do Novo avião: " + novoAviao.getModelo());
        System.out.println("Capacidade de carga: " + novoAviao.getCapacidadeCarga() + " toneladas.");
        System.out.println("Ano de fabricação: " + novoAviao.getAnoDeFabricacao());
        System.out.println("Porte do avião: " + novoAviao.getPorte());

    }
}
