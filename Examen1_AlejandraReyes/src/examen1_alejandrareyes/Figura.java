
package examen1_alejandrareyes;

import java.awt.Color;

/**
 *
 * @author aleja
 */
public abstract class Figura {
    protected Color color;
    protected double transparencia;

    public Figura() {
    }
    
    
    public Figura(Color color, double transparencia) {
        this.color = color;
        this.transparencia = transparencia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getTransparencia() {
        return transparencia;
    }

    public void setTransparencia(double transparencia) {
        this.transparencia = transparencia;
    }

    @Override
    public String toString() {
        return ", color=" + color + ", transparencia=" + transparencia + '}';
    }
    
    public abstract double Area();
    public abstract double Perimetro();
    
    
    
    
    
}
