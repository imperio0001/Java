package primeiroProjeto.classeObjeto.ex1;

public class TesteCliente {
    public static void main(String args[]){

        Cliente novoCliente = new Cliente("Joao", "Ribamar", "da Silva", 32, "joao123@teste.com") ;

        System.out.println("Nome completo do novo cliente: " + novoCliente.getNomeCompleto());
        System.out.println("Idade do novo cliente: " + novoCliente.getIdade());
        System.out.println("E-mail do novo cliente: " + novoCliente.getEmail());

    }
}
