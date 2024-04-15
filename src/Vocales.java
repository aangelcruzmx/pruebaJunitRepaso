import java.util.ArrayList;
import java.util.Arrays;

public class Vocales {
    private String cadena;

    public Vocales() {
    }

    public Vocales(String cadena) {
        this.cadena = cadena;
    }

    public static int cuentaVocales (String cadena){
        ArrayList <String> vocales = new ArrayList<>(Arrays.asList ("a","e","i","o","u"));
        ArrayList <String> cadenaEnLista = new ArrayList<>();
        int contador = 0;

        for (int i = 0; i <cadena.length() ; i++) {
            cadenaEnLista.add(String.valueOf(cadena.charAt(i)));
            for (int j = 0; j < vocales.size() ; j++) {
            if (cadenaEnLista.get(i).equalsIgnoreCase(vocales.get(j))){
                contador++;
            }
            }
        }
        return contador;

    }

}
