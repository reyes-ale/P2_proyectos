/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase022624_archivosdetexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Clase022624_archivosdetexto {
 static Scanner sc = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null; // null pq
        
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            String s = JOptionPane.showInputDialog("texto");
            archivo = new File ("./salida.txt");
            
            fw = new FileWriter(archivo, true); 
            bw = new BufferedWriter(fw);
            
            bw.write(s);//aqui escribio solamente en el buffered
            bw.newLine(); // escribe el texto del jop y deja un salto de linea 
            bw.flush(); // esto escribe en el file directamente
            
                    
            
            
            
        } catch (Exception e) {
        }
        
        bw.close();
        fw.close();
        
        
        
        
        try {
            //1. instanciar el objeto file a la ruta donde se encuentra 
            archivo = new File ("C:/Archivos/Carta2024progra2.txt"); 
            // ruta absoluta tipo A, este solo lleva 1 "/", funciona en unix
            archivo = new File ("C:\\Archivos\\Carta2024progra2.txt"); 
            // ruta absoluta tipo B, se utiliza doble porque son caracteres de escape
            
            
            //formas relativas, siempre que diga ./ es de programa en adelante y busca el archivo creado en la carpeta dentro del proyecto netbeans
            archivo = new File ("./files\\respuesta.txt");
            archivo = new File (".\\files/respuesta.txt");
            
            //../../ --> saltos para salirnos de las carpetas
            
            Scanner sc = new Scanner(archivo);
            while (sc.hasNext()) {
                String next = sc.nextLine();
                System.out.println(next);
                
            }
            
            
            
            
            fr=new FileReader(archivo);
            br=new BufferedReader(fr); // esto suve lo del archivo a java
            
            br.readLine();
            String linea = "";
            
            /*while ((linea=br.readLine()) != null) {    //mientras lo que se va leyenndo sea distinto de nulo
                System.out.println(linea);
            }*/
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println();
        
        
        sc.close();
        br.close();
        fr.close();
        
        
        //se cierran al reves
        
        
        
    }
    
}
