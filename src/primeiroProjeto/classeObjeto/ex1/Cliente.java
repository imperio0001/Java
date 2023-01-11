package primeiroProjeto.classeObjeto.ex1;

/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/


public class Cliente {
    private String primeiroNome;
    private String ultimoNome;
    private String nomesDoMeio;
    private int idade; //em anos completos
    private String email;


    public Cliente (String primeiroNome,String ultimoNome,String nomeDoMeio,int idade, String email){

        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.nomesDoMeio = nomeDoMeio;
        this.idade = idade;
        this.email = email;

    }
    //metodo que retorna nome completo do cliente
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

