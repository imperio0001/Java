package primeiroProjeto.classeObjeto.ex2;

/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

public class Aviao {
    private String modelo;
    private float capacidadeCarga;
    private int anoDeFabricacao;
    private String porte;

    public Aviao (String modelo, float capacidadeCarga, int anoDeFabricacao, String porte){
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
        this.anoDeFabricacao = anoDeFabricacao;
        this.porte = porte;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public float getCapacidadeCarga(){
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getAnoDeFabricacao(){
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao){
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getPorte(){
        return porte;
    }

    public void setPorte(String porte){
        this.porte = porte;
    }
}
