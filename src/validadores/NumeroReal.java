package validadores;

public class NumeroReal implements Validador {

    @Override
    public boolean validar(String token) {

        if (token.startsWith("-") && token.substring(1).matches("\\d{1,3}(\\.\\d{1,3})*(,\\d{2})?")) {

            System.out.println(token + " É do tipo número real\n");
            return true;
        } else if (token.startsWith("+") && token.substring(1).matches("\\d{1,3}(\\.\\d{1,3})*(,\\d{2})?")) {
            System.out.println(token + " É do tipo número real\n");
            return true;

        } else if (token.matches("\\d{1,3}(\\.\\d{1,3})*(,\\d{2})?")) {
            System.out.println(token + " É do tipo número real\n");
            return true;
        } else {
            System.out.println(token + " Não é do tipo número real\n");
            return false;
        }

    }
}
