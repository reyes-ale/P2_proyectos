
package cubito;

/**
 *
 * @author aleja
 */
public class Cubito {

    public static void main(String[] args) {
        int tamanio = 4;
        
        for (int i = 0; i < tamanio + (tamanio/2); i++) {
            for (int j = 0; j < tamanio + (tamanio/2); j++) {
                System.out.println("*");
            }
        }
    }
    
}
