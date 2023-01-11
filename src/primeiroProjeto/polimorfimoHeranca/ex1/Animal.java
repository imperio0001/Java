package primeiroProjeto.polimorfimoHeranca.ex1;

/*
Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal: ...
Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.
*/

public abstract class Animal {

    private String nome;
    private int idade;
    private String emiteSom;

    public Animal (String nome, int idade, String emiteSom){
        this.nome = nome;
        this.idade = idade;
        this.emiteSom = emiteSom;

    }
    public Animal(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmiteSom() {
        return emiteSom;
    }

    public void setEmiteSom(String emiteSom) {
        this.emiteSom = emiteSom;
    }

    public void visualizar() {
        System.out.println("\nNome do animal: " + getNome() +
                "\nIdade do animal: " + getIdade() +
                "\nSom que o animal emite: " + getEmiteSom()
                );
    }
}
