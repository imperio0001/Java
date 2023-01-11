package primeiroProjeto.classeObjeto.ex5;

import static java.lang.System.*;

public class TestePatinete {
    public static void main(String[] args) {

        Patinete novoPatinete = new Patinete("top", "azul", 2000, 1, 5);

        out.println("Marca: " + novoPatinete.getMarca());
        out.println("Cor: " + novoPatinete.getCor());
        out.println("Preço: " + novoPatinete.getPreco());
        out.println("Garantia: " + novoPatinete.getGarantia());

        out.println("Velocidade atual do test drive: " + novoPatinete.getVeloc_atual());

    }
}
