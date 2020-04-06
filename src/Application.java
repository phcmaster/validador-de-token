public class Application {

    /**
     * @author Pedro Henrique, 2020.
     */

    public static void main(String[] args) {
/*
               DEFINE O TOKEN
 */
        final String token = "100.00";

 /*
            REALIZA AS VALIDAÇÕES
 */
        new ValidadorDeToken().validador(token);

    }


}
