/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursivas_170124;

/**
 *
 * @author aleja
 */
public class Recursivas_170124 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(potencia(2,5));
        System.out.println(fib(5));
    }
    public static int potencia(int b, int e){
        if (e==0) {
            return 1;
        } else {
           return b*potencia(b,e-1);
        }
    }
        
    public static int fib(int p){
        if (p==0 || p==1) {
            return 1;
        } else {
        return fib(p-1)+fib(p-2);
        }
    }  
    public static int mult(int a,int b){
        if (b==1) {
            return a;
        } else {
            return a+mult(a,b-1);
            }
    }
}
    

