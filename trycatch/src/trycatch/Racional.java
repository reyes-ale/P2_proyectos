/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trycatch;

/**
 *
 * @author aleja
 */
public class Racional {
    int num,den;

    public Racional() {
    }

    public Racional(int num, int den) throws ExepcionDenNegativo {
        this.num = num;
        setDen(den);
        // trycatch solo en main 
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) throws ExepcionDenNegativo{
        if (den !=0){
            this.den = den;
        }
        else{
            throw new ExepcionDenNegativo();
        }
        
    }

    @Override
    public String toString() {
        return "Racional{" + "num=" + num + ", den=" + den + '}';
    }
    
    
    
}
