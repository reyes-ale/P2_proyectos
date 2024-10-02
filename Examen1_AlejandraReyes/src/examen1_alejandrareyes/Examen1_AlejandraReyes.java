
package examen1_alejandrareyes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Examen1_AlejandraReyes {
static PlanoCartesiano plano1 = new PlanoCartesiano();
static PlanoCartesiano plano2 = new PlanoCartesiano();
static PlanoCartesiano plano3 = new PlanoCartesiano();
static PlanoCartesiano plano4 = new PlanoCartesiano();
static PlanoCartesiano plano5 = new PlanoCartesiano();
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Scanner leerS = new Scanner (System.in);
        ArrayList <PlanoCartesiano> planoscartesianos= new ArrayList ();
        
        
        planoscartesianos.add(plano1);
        planoscartesianos.add(plano2);
        planoscartesianos.add(plano3);
        planoscartesianos.add(plano4);
        planoscartesianos.add(plano5);
        
        
        System.out.print("* * * * * MENU * * * * *");
        System.out.print("\n 1. Probar el metodo recursivo SUBCONJUNTO_PARES con numeros random \n 2. Agregar una nueva figura geometrica a algun plano cartesiano del ArrayList"
                + "\n 3. Imprimir toda la informacion general de un triangulo isosceles de algun plano cartesiano del ArrayList \n 4. Determinar si algun circulo encaja dentro de otro de los"
                + "circulos de otro plano cartesiano \n 5. Imprimir las areas y perimetros de todas las figuras geometricas de todos los planos cartesianos del Arraylist \n 6. Salir \n Ingrese una opcion: ");
        int op = leer.nextInt();
        
        while (op!=6){
            switch(op){
                case 1:
                    int[] arreglo = new int[5];
                    Random rand = new Random();

                    for (int i = 0; i < 5; i++) {
                        arreglo[i] = rand.nextInt(45);
                    }
                    for (int i = 0; i < 5; i++) {
                        System.out.print(arreglo[i] + " ");
                    }
                    System.out.println();
                    System.out.println("* * * pares * * *");
                    ArrayList<Integer> pares = new ArrayList();
                    System.out.println(subconjuntopares(arreglo, 0,0, pares));
                    
                    break;
                    
                case 2://agregar
                    for (int i = 0; i < planoscartesianos.size(); i++) {
                        System.out.println(i+ ". "+ planoscartesianos.get(i));
                    } 
                    System.out.print("Ingrese la posicion del plano cartesiano en donde agregara la figura: ");
                    int pos = leer.nextInt();
                    
                    while (pos<0 || pos>planoscartesianos.size()-1 ){
                        System.out.println("Posicion fuera de rango.");
                        System.out.print("Ingrese posicion nuevamente: ");
                        pos = leer.nextInt();
                    }
                    
                    System.out.print("Ingrese 't' para agregar un triangulo o ingrese 'c' para agregar un circulo: ");
                    String fig = leerS.nextLine();
                    if (fig.equalsIgnoreCase("c")) {
                        System.out.println("Ingrese Color del Color Chooser: ");
                                Color color = JColorChooser.showDialog(null, "Ingrese color:", Color.yellow);
                                System.out.print("Ingrese Transparencia: ");
                                double trans = leer.nextDouble();
                                
                        boolean flag2 = true;
                        
                         while (flag2) {
                            try {
                                System.out.print("Ingrese radio: ");
                                int radio = leer.nextInt();
                                
                                planoscartesianos.get(pos).getFiguras().add(new Circulo(radio, color, trans));
                                System.out.println("Circulo agregado exitosamente!");
                                flag2 = false;
                                

                            } catch (ExcepcionAle e) {
                                System.out.println(e.getMessage());

                            }
                        }
                        
                        
                    } else if (fig.equalsIgnoreCase("t")) {
                           System.out.println("Ingrese Color del Color Chooser: ");
                                Color color = JColorChooser.showDialog(null, "Ingrese color:", Color.yellow);
                                System.out.print("Ingrese Transparencia: ");
                                double trans = leer.nextDouble();
                                
                        boolean flag = true;
                        
                        while (flag) {
                            try {
                             
                                System.out.print("Ingrese lado1: ");
                                int lado1 = leer.nextInt();
                                System.out.print("Ingrese lado2: ");
                                int lado2 = leer.nextInt();
                                System.out.print("Ingrese lado3: ");
                                int lado3 = leer.nextInt();
                                
                                planoscartesianos.get(pos).getFiguras().add(new Triangulo(lado1, lado2, lado3, color, trans));
                                System.out.println("Triangulo agregado exitosamente!");
                                flag = false;

                            } catch (ExcepcionAle e) {
                                System.out.println(e.getMessage());

                            }
                        }
                        
                    }
                    
                    
                    break;
                    
                case 3://info iso
                    for (int i = 0; i < planoscartesianos.size(); i++) {
                        System.out.println(i+ ". "+ planoscartesianos.get(i));
                    } 
                    System.out.print("Ingrese la posicion del plano del cual desea ver la figura: ");
                    int pos2 = leer.nextInt();
                    
                    while (pos2<0 || pos2>planoscartesianos.size()-1 ){
                        System.out.println("Posicion fuera de rango.");
                        System.out.print("Ingrese posicion nuevamente: ");
                        pos2 = leer.nextInt();
                    }
                    
                    System.out.print("Ingrese la posicion de la figura en el plano que desea ver: ");
                    int pos3 = leer.nextInt();
                    
                    while (pos3<0 || pos3>planoscartesianos.get(pos2).getFiguras().size()-1 ){
                        System.out.println("Posicion fuera de rango.");
                        System.out.print("Ingrese posicion nuevamente: ");
                        pos3 = leer.nextInt();
                    }
                    
                    while (planoscartesianos.get(pos2).getFiguras().get(pos3) instanceof Circulo){
                        System.out.println("La figura en la posicion que eligio no es un triangulo.");
                        System.out.print("Ingrese posicion nuevamente: ");
                        pos3 = leer.nextInt();
                    }
                    
                    while (planoscartesianos.get(pos2).getFiguras().get(pos3) instanceof Triangulo && !((((Triangulo)((planoscartesianos.get(pos2).getFiguras()).get(pos3))).autodefinir()).equalsIgnoreCase("isosceles"))){
                        
                        System.out.println("El triangulo de esa posicion no es un isosceles");
                        System.out.print("Ingrese posicion nuevamente: ");
                        pos3 = leer.nextInt();
                    }
                    
                    
                            if ((((Triangulo)((planoscartesianos.get(pos2).getFiguras()).get(pos3))).autodefinir()).equalsIgnoreCase("isosceles")){
                                System.out.println(((planoscartesianos.get(pos2).getFiguras()).get(pos3)));
                            }
                        
                    break;
                    
                case 4: //comp circulos
                    for (int i = 0; i < planoscartesianos.size(); i++) {
                        System.out.println(i+ ". "+ planoscartesianos.get(i));
                    } 
                    System.out.print("Ingrese la posicion del plano cartesiano de donde desea utilizar el circulo: ");
                    int posicion = leer.nextInt();
                    
                    while (posicion<0 || posicion>planoscartesianos.size()-1 ){
                        System.out.println("Posicion fuera de rango.");
                        System.out.print("Ingrese posicion nuevamente: ");
                        posicion = leer.nextInt();
                    }
                    
                    System.out.print("Ingrese la posicion de la figura en el plano que desea ver si cabe: ");
                    int pos5 = leer.nextInt();
                    
                    while (pos5<0 || pos5>planoscartesianos.get(posicion).getFiguras().size()-1 ){
                        System.out.println("Posicion fuera de rango.");
                        System.out.print("Ingrese posicion nuevamente: ");
                        pos5 = leer.nextInt();
                    }
                    
                    
                    while (planoscartesianos.get(posicion).getFiguras().get(pos5) instanceof Triangulo){
                        System.out.println("La figura en la posicion que eligio no es un circulo.");
                        System.out.print("Ingrese posicion nuevamente: ");
                        pos5 = leer.nextInt();
                    }
                    
                    for (int i = 0; i < planoscartesianos.size(); i++) {
                        System.out.println(i+ ". "+ planoscartesianos.get(i));
                    } 
                    System.out.print("Ingrese la posicion del segundo plano cartesiano de donde desea utilizar el segundo circulo: ");
                    int posicion2 = leer.nextInt();
                    
                    while (posicion2<0 || posicion2>planoscartesianos.size()-1 ){
                        System.out.println("Posicion fuera de rango.");
                        System.out.print("Ingrese posicion nuevamente: ");
                        posicion2 = leer.nextInt();
                    }
                    
                    System.out.print("Ingrese la posicion de la figura en el plano que desea ver si cabe: ");
                    int pos4 = leer.nextInt();
                    
                    while (pos4<0 || pos4>planoscartesianos.get(posicion2).getFiguras().size()-1 ){
                        System.out.println("Posicion fuera de rango.");
                        System.out.print("Ingrese posicion nuevamente: ");
                        pos4 = leer.nextInt();
                    }
                    
                    while (planoscartesianos.get(posicion2).getFiguras().get(pos4) instanceof Triangulo){
                        System.out.println("La figura en la posicion que eligio no es un circulo.");
                        System.out.print("Ingrese posicion nuevamente: ");
                        pos4 = leer.nextInt();
                    }
                    
                    
                    
                    if ((((Circulo)((planoscartesianos.get(posicion).getFiguras()).get(pos5))).determinarsicabe((((Circulo)((planoscartesianos.get(posicion).getFiguras()).get(pos5))).getRadio()), 
                            (((Circulo)((planoscartesianos.get(posicion2).getFiguras()).get(pos4))).getRadio()))==true)){
                        System.out.println("El circulo 1 cabe en el circulo 2");
                    }   
                    
                    
            else if ((((Circulo)((planoscartesianos.get(posicion).getFiguras()).get(pos5))).determinarsicabe((((Circulo)((planoscartesianos.get(posicion2).getFiguras()).get(pos4))).getRadio()), 
                            (((Circulo)((planoscartesianos.get(posicion).getFiguras()).get(pos5))).getRadio()))==true)){
                        System.out.println("El circulo 2 cabe en el circulo 1");
                                
                    }
                    
                     else if ((((Circulo)((planoscartesianos.get(posicion).getFiguras()).get(pos5))).determinarsicabe((((Circulo)((planoscartesianos.get(posicion2).getFiguras()).get(pos4))).getRadio()), 
                            (((Circulo)((planoscartesianos.get(posicion).getFiguras()).get(pos5))).getRadio()))==false)){
                        System.out.println("El circulo 2 no cabe en el circulo 1");
                                
                    }
                     else if ((((Circulo)((planoscartesianos.get(posicion).getFiguras()).get(pos5))).determinarsicabe((((Circulo)((planoscartesianos.get(posicion).getFiguras()).get(pos5))).getRadio()), 
                            (((Circulo)((planoscartesianos.get(posicion2).getFiguras()).get(pos4))).getRadio()))==false)){
                        System.out.println("El circulo 1 no cabe en el circulo 2");
                                
                    }
                    
                                
            
                    break;
                    
                case 5:// a y p
                    System.out.println();
                    System.out.println("* * * * * Areas y Perimetros * * * * *");
                    for (int i = 0; i < planoscartesianos.size(); i++) {
                        for (int j = 0; j < planoscartesianos.get(i).getFiguras().size(); j++) {
                            System.out.println(planoscartesianos.get(i).getFiguras().get(j).Area());
                            System.out.println(planoscartesianos.get(i).getFiguras().get(j).Perimetro());
                            System.out.println();
                        }
                    } 
                    break;
            }
            
            
            System.out.println();
            System.out.print("* * * * * MENU * * * * *");
            System.out.print("\n 1. Probar el metodo recursivo SUBCONJUNTO_PARES con numeros random \n 2. Agregar una nueva figura geometrica a algun plano cartesiano del ArrayList"
                    + "\n 3. Imprimir toda la informacion general de un triangulo isosceles de algun plano cartesiano del ArrayList \n 4. Determinar si algun circulo encaja dentro de otro de los"
                    + "circulos de otro plano cartesiano \n 5. Imprimir las areas y perimetros de todas las figuras geometricas de todos los planos cartesianos del Arraylist \n 6. Salir \n Ingrese una opcion: ");
            op = leer.nextInt();
        }
        
        
    }
    
    
    public static ArrayList<Integer> subconjuntopares (int[] array, int cont, int pos, ArrayList<Integer> pares) {
        
        if (cont == array.length-1) {
            return pares;
        } 
        else {
            if (array[pos] % 2 == 0) {
                pares.add(array[pos]);
            }
            return subconjuntopares(array, cont+1, pos + 1,pares);
        }
    }

}

