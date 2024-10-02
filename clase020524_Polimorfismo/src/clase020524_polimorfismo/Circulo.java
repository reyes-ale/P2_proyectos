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
public class Circulo extends Figura{
    private int radio;

    public Circulo() {
        super();
    }

    public Circulo(int radio, Color color) {
        super(color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    public double Area (){
        return Math.PI * Math.pow(radio, 2); 
    }
    
    
    
    
   
    
}
