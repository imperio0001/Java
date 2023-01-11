package primeiroProjeto.classeObjeto.ex3;

public class Celular {
    private String marca;
    private String modelo;
    private float preco;
    private int garantiaFabricante;
    private boolean ligado;
    private String status;

    public Celular(String marca, String modelo, float preco, int garantiaFabricante) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.garantiaFabricante = garantiaFabricante;

    }

    public void setLigado(boolean alteraEstado){
        if(isLigado() != alteraEstado)
            this.ligado = alteraEstado;
    }

    public boolean isLigado(){
        return ligado;
    }

    public boolean desliga() {
        return ligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco() {
        this.preco = preco;
    }

    public int getGarantiaFabricante() {
        return garantiaFabricante;
    }

    public void setGarantiaFabricante(int garantiaFabricante) {
        this.garantiaFabricante = garantiaFabricante;
    }
}
