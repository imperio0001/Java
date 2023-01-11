package primeiroProjeto.polimorfimoHeranca.ex1;

public class Cachorro extends Animal {
    private String corre;

    public Cachorro (String nome, int idade, String emiteSom, String corre) {
        super(nome, idade, emiteSom);
        this.corre = corre;

    }

    public Cachorro(){}

    public String getCorre() {
        return corre;
    }

    public void setCorre(String corre) {
        this.corre = corre;
    }

    @Override
    public void visualizar (){
        super.visualizar();
        System.out.println("\nNível da corrida: " + getCorre());
    }
}
