public class EstoqueMercado {
    public static void main(String[] args) {
        String Produtos[] = { "Laranjas", "Uvas", "Maças", "Péra" };

        // em arrays o indice de elementos inicia em 0

        for (int laranjas = 0; laranjas <= Produtos.length; laranjas++) {
            System.out.println(laranjas + " " + Produtos[laranjas]);
        }

        // forma do for abreviada

        /*
         * for (String Produto : Produtos) {
         * System.out.println("nome dos produtos sao " + Produto);
         * }
         */
    }

}
