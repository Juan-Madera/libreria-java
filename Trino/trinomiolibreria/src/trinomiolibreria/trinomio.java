/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trinomiolibreria;


public class trinomio {
    // Calcular el binomio cuadrado perfecto dado dos términos
    public static String numerosdeltrinomio(int a, int b) {
        int aCuadrado=a*a;
        int bCuadrado=b*b;
        int dosAB=2*a*b;
        
        return aCuadrado+" + "+dosAB+"x + "+bCuadrado;
    }
    // Expandir el binomio cuadrado perfecto
    public static String expandir(int a, int b) {
        int aCuadrado = a*a;
        int bCuadrado = b*b;

        // a^2 + 2ab + b^2
        return aCuadrado+" + "+2*a*b+"x + "+bCuadrado;
    }

}
