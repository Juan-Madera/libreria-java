
package juanmadera;

/**
 *
 * @author jsmad
 */
public class factorial {
   public static String verificarNumero(int numero) {
        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "cero";
        }
    }  
}
