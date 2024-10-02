
package com.mycompany.listas_alejandrareyes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Listas_AlejandraReyes {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Scanner leerS = new Scanner (System.in);
        ArrayList <String> libreria = new ArrayList<>();
        
        libreria.add("Harry Potter");
        libreria.add("El Rey Leon");
        
        System.out.println("* * * * * MENU * * * * *");
        System.out.println("1. Agregar");
        System.out.println("2. Listar");
        System.out.println("3. Eliminar");
        System.out.println("4. Actualizar");
        System.out.println("5. Laboratorio 8: uso de arraylist");
        System.out.println("6. Laboratorio 9: uso de arraylist");
        System.out.println("6. Laboratorio 10: uso de arraylist");
        System.out.println("6. Salir");
        
        System.out.println("7. Salir");
        System.out.print("Ingrese una opcion: ");
        int opcion = leer.nextInt();
        System.out.println();
        
        while (opcion>0 && opcion<5){
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el nombre del libro a agregar: ");
                    String libro = leerS.nextLine();
                    libreria.add(libro);
                    System.out.println("Se agrego el libro: " + libro + "a la libreria");
                    System.out.println();
                    break; 

                case 2: 
                    System.out.println("Libros: ");
                    for (int i=0; i<libreria.size(); i++){
                        System.out.println(i + 1 + "." + libreria.get(i));
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Libros: ");
                    for (int i=0; i<libreria.size(); i++){
                        System.out.println(i + 1 + "." + libreria.get(i));
                    }
                    System.out.print("Ingrese el indice del libro que quiera eliminar: ");
                    int indice = leer.nextInt();
                    libreria.remove(indice-1);

                    System.out.println();
                    break;

                case 4:
                    System.out.println("Libros: ");
                    for (int i=0; i<libreria.size(); i++){
                        System.out.println(i + 1 + "." + libreria.get(i));
                    }
                    System.out.print("Ingrese el indice del libro que desea actualizar: ");
                    int indice2 = leer.nextInt();

                    System.out.print("Ingrese el texto que desea ingresar en esa posicion: ");
                    String libro2 = leerS.nextLine();
                    libreria.set(indice2-1,libro2);
                    break;

            }
            
            System.out.println("* * * * * MENU * * * * *");
            System.out.println("1. Agregar");
            System.out.println("2. Listar");
            System.out.println("3. Eliminar");
            System.out.println("4. Actualizar");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
            System.out.println();
                
                
                
        }
        
    }
}
