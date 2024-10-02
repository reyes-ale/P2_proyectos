/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud_archivos_mascotas;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Crud_archivos_Mascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        Scanner leerS = new Scanner(System.in);
        
        //////////////////////////////////////////escribir
        /*administradorMascotas am = new administradorMascotas("./inventariomascotas.txt");
        am.cargar();
        
        
        System.out.println("Ingrese nombre: ");
        String nombre = leerS.nextLine();
        System.out.println("Ingrese raza: ");
        String raza = leerS.nextLine();
        System.out.println("Ingrese peso: ");
        double peso = leer.nextDouble();
        System.out.println("Ingrese precio: ");
        double precio = leer.nextDouble();
        System.out.println("Es terrestre? [s/n]: ");
        String t = leerS.nextLine();
        boolean terrestre=false;
        if (t.equalsIgnoreCase("s")){
            terrestre=true;
        }
        else if (t.equalsIgnoreCase("n")){
            terrestre=false;
        }
        
        Mascota m = new Mascota(nombre, raza, peso, precio, terrestre);
        am.getMascotas().add(m);
        am.escribir();*/
        
        
        ///////////////////////////////////////////////////////////////imprimir
        
        /*administradorMascotas am2 = new administradorMascotas("./inventariomascotas.txt");
        am2.cargar();
        
        for (int i = 0; i < am2.getMascotas().size(); i++) {
            System.out.println(i + " " +am2.getMascotas().get(i));
        }*/
        
        ///////////////////////////////////////////////////////modificar
        /*administradorMascotas am3 = new administradorMascotas("./inventariomascotas.txt");
        System.out.println("Ingrese posicion: ");
        int pos = leer.nextInt();
        
        while (pos<(am3.getMascotas().size()-1) || pos>(am3.getMascotas().size()-1)){
            System.out.println("Esa posicion no existe");
            System.out.println("Ingrese de nuevo la posicion: ");
            pos=leer.nextInt();
        }
        System.out.println("Ingrese nombre: ");
        String nombremod = leerS.nextLine();
         System.out.println("Ingrese raza: ");
        String razamod = leerS.nextLine();
        
        
        am3.cargar();
        am3.getMascotas().get(pos).setNombre(nombremod);
        am3.getMascotas().get(pos).setRaza(razamod);
        am3.escribir();*/
        
        ////////////////////////////////////////////////////eliminar
       administradorMascotas am4 = new administradorMascotas("./inventariomascotas.txt");
        System.out.println("Ingrese posicion a eliminar: ");
        int pos2 = leer.nextInt();
         while (pos2<(am4.getMascotas().size()-1) || pos2>(am4.getMascotas().size()-1)){
             
             00000................................................................................................................................................................................................................................................................................................................................................................................
            System.out.println("Esa posicion no existe");
            System.out.println("Ingrese de nuevo la posicion: ");
            pos2=leer.nextInt();
        }

        am4.cargar();
        am4.getMascotas().remove(pos2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
