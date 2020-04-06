package validadores;

public class Identificador implements Validador {


    @Override
    public boolean validar(String token) {
        if (token.matches("[A-Za-z]([[A-Za-z]0-9])*")) {
            System.out.println(token + " É identificador\n");
            return true;
        } else {
            System.out.println(token + " Não é identificador\n");
            return false;
        }
    }
}
