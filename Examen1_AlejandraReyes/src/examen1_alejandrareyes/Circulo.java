
package examen1_alejandrareyes;

import java.awt.Color;

/**
 *
 * @author aleja
 */
public class Circulo extends Figura{
    double radio;

    public Circulo() {
    }

    public Circulo(double radio, Color color, double transparencia) throws ExcepcionAle {
        super(color, transparencia);
        this.setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) throws ExcepcionAle {
        if (radio>50){
            throw new ExcepcionAle(Color.red, "El radio no puede ser mayor de 50");
        }
        this.radio = radio;
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
    public double Area() {
       //pi r 2
       double area = 3.14 * (radio*radio);
       return area;
    }
    
    @Override
    public double Perimetro() {
     //pi.diametro
     double perimetro = 3.14*(radio+radio);
     return perimetro;
    }
    
    public boolean determinarsicabe(double radio,double radio2){
        
        if (radio<radio2){
            return true;
        }
        else{
             return false;
        }
    }
    

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + super.toString()+'}';
    }
    
    
    
    
}
