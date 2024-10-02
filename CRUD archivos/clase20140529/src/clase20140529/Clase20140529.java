
package clase20140529;

import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;

public class Clase20140529 {
    public static void main(String[] args) throws IOException {
        
        //Agregar 
       /* administrarPersonas ap=
                new administrarPersonas("./blady.txt");        
        ap.cargarArchivo();
        int c,e;
        String n;
        c=Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
        n=JOptionPane.showInputDialog("Nombre");
        e=Integer.parseInt(JOptionPane.showInputDialog("Edad"));        
        Persona p= new Persona(c,n,e);
        ap.getListaPersonas().add(p);        
        ap.escribirArchivo();*/
        
        
      /*  administrarPersonas ap=
                new administrarPersonas("./blady.txt");        
        ap.cargarArchivo();
        //System.out.println(ap);
        for (Persona t : ap.getListaPersonas()) {
            System.out.println( ap.getListaPersonas().indexOf(t)+"- "+t );
        }*/
                
        
        //modificar
       /*administrarPersonas ap=
                new administrarPersonas("./blady.txt");  
        int p;
        String n;
        p=Integer.parseInt(JOptionPane.showInputDialog("Posicion"));
        n=JOptionPane.showInputDialog("Nombre");
        
        ap.cargarArchivo();
        ap.getListaPersonas().get(p).setNombre(n);
        ap.escribirArchivo();*/
       
        
        //eliminar
        administrarPersonas ap=
                new administrarPersonas("./blady.txt");  
        int p;        
        p=Integer.parseInt(JOptionPane.showInputDialog("Posicion"));       
        ap.cargarArchivo();
        ap.getListaPersonas().remove(p);
        ap.escribirArchivo();
        
    }
}
