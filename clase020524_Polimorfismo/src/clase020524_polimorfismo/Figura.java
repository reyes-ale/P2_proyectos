package clase020524_polimorfismo;

import java.awt.Color;

/**
 *
 * @author aleja
 */
public abstract class Figura {
    private Color color;

    public Figura() {
    }

    public Figura(Color color) {
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
        return "Figura{" + "color=" + color + '}';
    }
    
    public abstract double Area(); //abstract -- no lleva cueropo
    
    
}
