/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase020524_polimorfismo;

import java.awt.Color;

/**
 *
 * @author aleja
 */
public class Rectangulo extends Figura implements Comportamiento, Comp2, Comp3{
    private int largo,ancho;

    public Rectangulo() {
        super();
    }

    public Rectangulo(int largo, int ancho, Color color) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "largo=" + largo + ", ancho=" + ancho + '}';
    }
    
    public double Area (){
        return 0;
    }

    @Override
    public void dibujar() {
    
    }
    
    
    
    
}
