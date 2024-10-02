
package examen1_alejandrareyes;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class PlanoCartesiano {
    ArrayList <Figura> figuras = new ArrayList();

    public PlanoCartesiano() {
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    @Override
    public String toString() {
        return "PlanoCartesiano: " + "figuras=" + figuras +  "\n";
    }
    
    
    
}
