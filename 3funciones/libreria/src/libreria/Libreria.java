/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;
import juanmadera.factorial;
import juanmadera.ramdom;
import juanmadera.suma;
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        factorial f=new factorial();
        ramdom r=new ramdom();
        suma s=new suma();
        
System.out.println("La suma de los numero es: " + s.nose(12312, 33123));
 System.out.println(2 + " es un numero " + f.verificarNumero(2));
 System.out.println("Número aleatorio generado: " + r.numeroramdom(1, 100));
    }
    
}
