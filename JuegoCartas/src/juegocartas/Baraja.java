/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocartas;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author aleja
 */
public class Baraja {
    ArrayList <Carta> cartas = new ArrayList();
    
    public Baraja(){
        String [] palos = {"♦","♣","♠","♥"};
        String [] numeros = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (String p : palos) {
            for (String n : numeros) {
                cartas.add(new Carta(p, n));
            }
        }
        //hay que barajar
        barajarse();
    }
    
    public void barajarse(){
        Collections.shuffle(cartas);
    }
    
    public Carta repartir (){
        Carta temp;
        temp=cartas.get(0);
        cartas.remove(0);
        return temp;
    }

    @Override
    public String toString() {
        return cartas.toString();
    }
    
    
  
    
    
}
