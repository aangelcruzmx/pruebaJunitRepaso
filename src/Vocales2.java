import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vocales2 {
    private String cadena;

    public Vocales2() {
    }

    public Vocales2(String cadena) {
        this.cadena = cadena;
    }

    public static String sinVocales (String cadena){
        ArrayList<String> vocales = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
        ArrayList<String> cadenaEnLista = new ArrayList<>();
        /*
        las operaciones principales sobre a StringBuilderson los métodos append e insert, que están sobrecargados
        para aceptar datos de cualquier tipo. Cada uno convierte efectivamente un dato determinado en una cadena y luego agrega o
        inserta los caracteres de esa cadena en el generador de cadenas.
        El metodo append siempre agrega estos caracteres al final del constructor;
        El metodo insert agrega los caracteres en un punto específico.
        * */
        StringBuilder cadenaNueva = new StringBuilder();
        int contador = 0;

        for (int i = 0; i < cadena.length() ; i++) {
            String caracterActual = String.valueOf(cadena.charAt(i));
            if (!vocales.contains(caracterActual.toLowerCase())){
                cadenaNueva.append(caracterActual);
            }
        }
        //es necesario el .tostring para que devuelva la cadena generada
        return cadenaNueva.toString();
    }




}
