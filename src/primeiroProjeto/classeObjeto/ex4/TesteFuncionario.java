package primeiroProjeto.classeObjeto.ex4;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario novoFuncionario= new Funcionario("Jose", "Alberto", "dos Santos", 21, 4000);

        System.out.println("Nome completo do funcionário: " + novoFuncionario.getNomeCompleto());
        System.out.println("A idade do novo funcionário é: " + novoFuncionario.getIdade() + " anos completos.");
        System.out.println("Seu salário é de: " + novoFuncionario.getSalario() + " reais.");

    }
}
