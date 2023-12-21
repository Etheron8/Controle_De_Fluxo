import java.util.Scanner;
import java.util.Locale;

public class CaixaDeMercado {

    public static void main(String[] args) {

        // condicional em encadeada com objeto Scanner
        Scanner scc = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 50.00;

        System.out.println("Bem vindo ao SuperMercado Fluxo qual o nome do produto que voce comprar ?");
        String produto = scc.next();

        System.out.println("escolha a quantidades de " + produto + " que você irá levar ?");
        int quantidades = scc.nextInt();

        System.out
                .println("as " + quantidades + "x " + produto + " tem um valor unitário qual é o valor por unidade ?");
        double preço = scc.nextDouble();

        if ((quantidades * preço) <= saldo) {
            System.out.println(
                    "Obrigado você comprou " + quantidades + "x " + produto + " por " + (preço * quantidades) + "$");
        } else {
            System.out.println("olá o valor de sua conta " + (quantidades * preço) + " e maior que seu saldo de "
                    + saldo + " Remova algo ou cancele sua compra");
        }

    }

}
