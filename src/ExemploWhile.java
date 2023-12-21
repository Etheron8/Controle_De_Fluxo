public class ExemploWhile {
    public static void main(String[] args) {
        double saldo = 50;

        while (saldo >= 0) {

            saldo--;
            System.out.println("saldo " + saldo);
            if (saldo <= 0) {
                System.out.println("loop parado");
                break;

            }

        }

    }
}
