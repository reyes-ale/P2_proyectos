/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocartas;

/**
 *
 * @author aleja
 */
public class Carta {
    private String palo, numero;

    public Carta() {
    }

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return palo  + numero;
    }
    
    public boolean compara (Carta c){
        if (this.palo.equals(c.getPalo()) && this.numero.equals(c.getNumero())){
            return true;
        }
        return false;
    }
    
    
    
    
}
