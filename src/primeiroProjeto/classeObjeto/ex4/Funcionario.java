package primeiroProjeto.classeObjeto.ex4;

/*
4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.
*/

public class Funcionario {
    private String primeiroNome;
    private String ultimoNome;
    private String nomesDoMeio;
    private int idade; //em anos completos
    private float salario;

    public Funcionario (String primeiroNome, String nomesDoMeio, String ultimoNome, int idade, float salario){

     this.primeiroNome = primeiroNome;
     this.nomesDoMeio = nomesDoMeio;
     this.ultimoNome = ultimoNome;
     this.idade = idade;
     this.salario = salario;

    }

    public String getNomeCompleto() {
        String nomeCompleto = primeiroNome + " " + nomesDoMeio + " " + ultimoNome;
        return nomeCompleto;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNomesDoMeio() {
        return nomesDoMeio;
    }

    public void setNomesDoMeio(String nomesDoMeio) {
        this.nomesDoMeio = nomesDoMeio;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
