/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatch;

import java.awt.Color;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleja
 */
public class TrycatchExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionNegativos {
        try {
            Racional r = new Racional(1,-3);
            validar(-2);
            /*try {
            validar(-1);        } catch (ExcepcionNegativos ex) {
            System.out.println(ex.getMessage());
            }*/
        } catch (ExepcionDenNegativo ex) {
            System.out.println("no se aceptan numeros negativos");
        }
        
        
    }
    
    static void validar(int num)throws ExcepcionNegativos{
        if (num<0){
            //lanzar exepcion
            throw new ExcepcionNegativos(Color.PINK, "no se aceptan numeros negativos");
            
        }
    }
    
}
