package clase20160702bin;

import java.io.Serializable;
import javax.swing.Icon;

/**
 *
 * @author OMejia
 */
public class persona implements Serializable{
    private String nombre;
    private int edad;
    private Icon fotografia;
    
    private static final long SerialVersionUID=777L;

    public persona(String nombre, int edad, Icon fotografia) {
        this.nombre = nombre;
        this.edad = edad;
        this.fotografia = fotografia;
    }
    
    public Icon getFotografia() {
        return fotografia;
    }

    public void setFotografia(Icon fotografia) {
        this.fotografia = fotografia;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return nombre;
    }
    

}
