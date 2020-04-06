import validadores.Identificador;
import validadores.NumeroInteiro;
import validadores.NumeroReal;

public class ValidadorDeToken {


    public void validador(String token) {

        boolean identificador = new Identificador().validar(token);
        boolean numeroInteiro = new NumeroInteiro().validar(token);
        boolean numeroReal = new NumeroReal().validar(token);

        if (identificador == false && numeroInteiro == false
            && numeroReal == false) {

            System.out.println("TOKEN NÃO IDENTIFICADO");

        }

    }


}
