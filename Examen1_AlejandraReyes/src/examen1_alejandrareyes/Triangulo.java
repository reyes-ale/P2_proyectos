/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_alejandrareyes;

import java.awt.Color;

/**
 *
 * @author aleja
 */
public class Triangulo extends Figura{
    protected double lado1,lado2,lado3;
    // no puede pasar de 10 de longitud

    
    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double lado3, Color color, double transparencia) throws ExcepcionAle {
        super(color, transparencia);
        this.setLado1(lado1);
        this.setLado2(lado2);
        this.setLado3(lado3);
    }

    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws ExcepcionAle {
        if (lado1>10){
            throw new ExcepcionAle(Color.yellow, "La longitud de su lado 1 no puede ser mayor a 10");
        }
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) throws ExcepcionAle {
        if (lado2>10){
            throw new ExcepcionAle(Color.blue, "La longitud de su lado 2 no puede ser mayor a 10");
        }
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) throws ExcepcionAle {
        if (lado3>10){
            throw new ExcepcionAle(Color.red, "La longitud de su lado 3 no puede ser mayor a 10");
        }
        this.lado3 = lado3;
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
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + super.toString()+'}';
    }

    @Override
    public double Area() {
        double base = determinarbase(lado1, lado2, lado3);
        double altura = determinaraltura(lado1, lado2, lado3);

        double area = (base * altura) * 1/2;

        return area;
    }

    @Override
    public double Perimetro() {
     double perimetro = lado1+lado2+lado3;
        
     return perimetro;
    }
    
    public String autodefinir(){
        //equi,isoseles,esca
        //equi todo igual, iso solo 2, esca nada
        String tipo="";
        if (lado1==lado2 || lado1==lado3|| lado2==lado3){
            return tipo="isosceles";
        }
        else if (lado1==lado2 && lado1==lado3 || lado2==lado1 && lado2==lado3 || lado3==lado2&& lado1==lado3){
            return tipo="equilatero";
        }
        else if (lado1!=lado2 && lado1!=lado3 || lado2!=lado1 && lado2!=lado3 || lado3!=lado2&& lado1!=lado3){
            return tipo="escaleno";
        }
        return tipo;
        
    }
    
   public static double determinarbase (double lado1, double lado2, double lado3){
       double base=0;
       if (lado1>lado2 && lado1>lado3){
            base=lado1;
        }
        else if (lado2>lado1 && lado2>lado3){
            base=lado2;
        }
         else if (lado3>lado1 && lado3>lado2){
            base=lado3;
        }
       return base;
   }
   
   public static double determinaraltura (double lado1, double lado2, double lado3){
       double mayor2=0;
       //5,6,4
       if (lado1>lado2 && lado1>lado3){
            if (lado2>lado3){
                 mayor2=lado2;
            }
            else if (lado3>lado2){
                 mayor2=lado3;
            }
        }
        else if (lado2>lado1 && lado2>lado3){
            if (lado1>lado3){
                 mayor2=lado1;
            }
            else if (lado3>lado1){
                 mayor2=lado3;
            }
        }
         else if (lado3>lado1 && lado3>lado2){
            if (lado2>lado1){
                 mayor2=lado2;
            }
            else if (lado1>lado2){
                 mayor2=lado1;
            }
        }
       return mayor2;
   }
    
   
    
    
    
    
}
