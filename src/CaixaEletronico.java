public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25.00;
        double saque = 10.50;
        // condicional simples

        if (saque <= saldo)
            System.err.println("você sacou " + saque + " Seu Saldo Atual é " + (saldo -
                    saque) + "$ ");

    }
}
