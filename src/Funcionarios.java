public class Funcionarios {
    public static void main(String[] args) {
        String caixa = "Luiza";
        String repositor = "Marcos";

        String pessoa = "Gustavo";

        String triagem = pessoa.equals(caixa) ? pessoa + " é Funcionario Acesso Liberado ele é um Caixa"
                : pessoa.equals(repositor) ? pessoa + " é Funcionario Acesso Liberado ele é um repositor"
                        : "Cuidado ele Não é um funcionario desse Mercado";

        System.out.println(triagem);
    }

}
