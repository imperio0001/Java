package primeiroProjeto.polimorfimoHeranca.ex1;

public class Cavalo extends Animal{
    private String corre;
    private boolean cascoDanificado;

    public Cavalo(String nome, int idade, String emiteSom, String corre) {
        super(nome, idade, emiteSom);
        this.corre = corre;
    }

    public Cavalo() {}

    public String getCorre() {
        return corre;
    }

    public void setCorre(String corre) {
        this.corre = corre;
    }

    public boolean isCascoDanificado() {
        return cascoDanificado;
    }

    public void setCascoDanificado(boolean cascoDanificado) {
        this.cascoDanificado = cascoDanificado;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("Nível de corrida do cavalo" + getCorre() +
                "Casco danificado" + isCascoDanificado());
    }
}
