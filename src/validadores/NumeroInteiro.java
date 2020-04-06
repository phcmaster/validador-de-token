package validadores;

public class NumeroInteiro implements Validador {


    @Override
    public boolean validar(String token) {

        if (token.startsWith("-") && token.substring(1).matches("[0-9]([0-9])*")) {

            System.out.println(token + " É do tipo número inteiro \n");
            return true;
        } else if (token.startsWith("+") && token.substring(1).matches("[0-9]([0-9])*")) {
            System.out.println(token + " É do tipo número inteiro \n");
            return true;

        } else if (token.matches("[0-9]([0-9])*")) {
            System.out.println(token + " É do tipo número inteiro\n");
            return true;
        } else {
            System.out.println(token + " Não é do tipo numero inteiro\n");
            return false;
        }

    }
}
