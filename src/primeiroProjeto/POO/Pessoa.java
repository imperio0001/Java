package primeiroProjeto;

public class Pessoa {
    private String primeiroNome;
    private String ultimoNome;
    private String nomesDoMeio;

    //Construtor: executa apenas um procedimento
    // sempre será o mesmo nome da classe seguido dos parâmetros que eu preciso ter
    public Pessoa (String primeiro, String meio, String ultimo){
        primeiroNome = primeiro;
        ultimoNome = ultimo;
        nomesDoMeio = meio;
    }

    //método
    public String getNomeCompleto(){
        String nomeCompleto = primeiroNome + " " + nomesDoMeio + " " + ultimoNome;
        return nomeCompleto;
    }
}
