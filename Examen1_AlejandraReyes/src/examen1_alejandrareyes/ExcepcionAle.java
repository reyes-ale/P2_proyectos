
package examen1_alejandrareyes;

import java.awt.Color;

/**
 *
 * @author aleja
 */
public class ExcepcionAle extends Exception{
    private Color color;

    public ExcepcionAle() {
    }

    public ExcepcionAle(Color color, String message) {
        super(message);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ExcepcionAle{" + "color=" + color + super.toString() +'}';
    }
    
    
    
}
