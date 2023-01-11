package primeiroProjeto.polimorfimoHeranca.ex1;

public class Preguica extends Animal{
    private String sobeArvore;

    public Preguica(String nome, int idade, String emiteSom, String sobeArvore) {
        super(nome, idade, emiteSom);
        this.sobeArvore = sobeArvore;
    }

    public String getSobeArvore() {
        return sobeArvore;
    }

    public void setSobeArvore(String sobeArvore) {
        this.sobeArvore = sobeArvore;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("Animal sobre em árvore" + getSobeArvore());
    }
}