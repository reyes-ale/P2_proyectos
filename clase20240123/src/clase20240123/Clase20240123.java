package clase20240123;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Clase20240123 {
    public static void main(String[] args) {
        Mascota m = new Mascota();
        m.setNombre("Firu");
        m.setDuenio(new Duenio());
        m.getDuenio().setNombre("Mel Zelaya");
        m.getDuenio().getHobbies().add(new Hobbie(0, "Fingir ser presidente", 24));
        m.getDuenio().getHobbies().get(0).setTiempoDedicado(17);
        m.getDuenio().setSueldo(10);
        
       
        
       /*ArrayList lista = new ArrayList();
       int opcion =0;
       
        
       while (opcion != 8){
           opcion = Integer.parseInt(
                JOptionPane.showInputDialog("MENU\n" +
                    "1-Agregar Mascota\n" +
                    "2-Agregar un numero\n" +
                    "3-Lista Mascotas\n" +
                    "4- Modificar el dia de nacimiento de una mascota\n" +
                    "5- Agregar una caracteristica a una mascota\n" +
                    "6- Modificar una caracteristica de una mascota\n" +
                    "7- Eliminar una mascota \n" +
                    "8-Salir")
            );
           
           
           
           if(opcion==1){
               int c;
               String n;
               double p;
               c = Integer.parseInt(JOptionPane.showInputDialog("codigo"));
               n = JOptionPane.showInputDialog("nombre");
               p = Double.parseDouble(JOptionPane.showInputDialog("precio"));
               
               
               lista.add(new Mascota(c, n, JColorChooser.showDialog(null, "deme el color", Color.yellow), new Date(), p));
               JOptionPane.showMessageDialog(null, "Mascota agregada");
                       
           }//fin if 1
           
           if (opcion==2){
               int n = Integer.parseInt(JOptionPane.showInputDialog("deme numero"));
               lista.add(n);
               JOptionPane.showMessageDialog(null, "Numero agregado");
               
           } // fin if 2
           
           if (opcion==3){
               String r="";
               for (Object t : lista) {
                   if (t instanceof Mascota){
                     r+=lista.indexOf(t) + "- " + t + "\n";
                   }
               }
               
               JOptionPane.showMessageDialog(null, r);
 
           }// fin if 3
          
           if (opcion==4){
               int p,d;
               p = Integer.parseInt(JOptionPane.showInputDialog("posicion de mascota"));
               
               
               if(p>=0 && p<lista.size()){
                   if (lista.get(p) instanceof Mascota) {
                       d = Integer.parseInt(JOptionPane.showInputDialog("escriba nuevo dia"));
                       ((Mascota)lista.get(p)).getFecha().setDate(d);
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "nodo seleccionado no es una mascota");
                   }
               }
               else{
                   JOptionPane.showMessageDialog(null, "posicion fuera de rango");
               }
                
           }//fin if 4
           
           if (opcion==5){
               int p;
               p=Integer.parseInt(JOptionPane.showInputDialog(null, "posicion mascota"));
               
               if (p>=0 && p<lista.size()){
                   if (lista.get(p) instanceof Mascota){
                        String c = JOptionPane.showInputDialog("caracteristica");
                        ((Mascota)lista.get(p)).getCaracteristicas().add(c);
                   
                       
                   }
               }
                
           }// fin if 5
           
           if (opcion==6){
               
               int p;
               p=Integer.parseInt(JOptionPane.showInputDialog(null, "posicion mascota"));
               if (p>=0 && p<lista.size()){
                   if (lista.get(p) instanceof Mascota){
                        int pc= Integer.parseInt(JOptionPane.showInputDialog(null, "posicion caracteristica a modificar"));
                        Mascota temp = (Mascota)lista.get(p);
                        
                        if (pc>=0 && pc<temp.getCaracteristicas().size()){
                            String c = JOptionPane.showInputDialog("caracteristica nueva");
                            temp.getCaracteristicas().add(pc,c);
                        }
                   }
               }
               
           }// fin if 6
       
       }*/
      
        
        
        
    } //fin main
    
}// fin clase
