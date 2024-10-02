
package clase020524_polimorfismo;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Clase020524_Polimorfismo {

    public static void main(String[] args) {
        ArrayList <Figura> lista = new ArrayList();
        
        
        //lista.add(new Circulo(10,Color.yellow));
        lista.add(new Rectangulo(2,3,Color.blue));
        
        System.out.println(lista.get(0).Area());
        System.out.println(lista.get(1).Area());
        
    }
    
}
