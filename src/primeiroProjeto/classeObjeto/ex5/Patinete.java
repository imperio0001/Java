package primeiroProjeto.classeObjeto.ex5;

/*
5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

import javax.swing.*;

public class Patinete {
    private String marca;
    private String cor;
    private float preco;
    private int garantia;
    private float veloc_atual = 0;

    public Patinete (String marca, String cor, float preco, int garantia, float veloc_atual){
     this.marca = marca;
     this.cor = cor;
     this.preco = preco;
     this.garantia = garantia;
     this.veloc_atual = veloc_atual;
    }

        public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public float getVeloc_atual() {
        return veloc_atual;
    }

    public void setVeloc_atual(float veloc_atual) {
        this.veloc_atual = veloc_atual;
    }
}
