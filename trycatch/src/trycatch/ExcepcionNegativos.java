/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trycatch;

import java.awt.Color;

/**
 *
 * @author aleja
 */
public class ExcepcionNegativos extends Exception{
    private Color color;

    public ExcepcionNegativos() {
    }

    public ExcepcionNegativos(Color color, String message) {
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
        return "segun este numero el color es: "+ color;
    }
    
    
    
    
    
}
