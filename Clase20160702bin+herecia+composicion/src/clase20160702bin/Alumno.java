/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase20160702bin;

import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author osman.mejia
 */
public class Alumno extends persona{
    private ArrayList<Clase> clases=new ArrayList();

    public Alumno(String nombre, int edad, Icon fotografia) {
        super(nombre, edad, fotografia);
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Alumno{" + "clases=" + clases + '}';
    }
    
    
}
