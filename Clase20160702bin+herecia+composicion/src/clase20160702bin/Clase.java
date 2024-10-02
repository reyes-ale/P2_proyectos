/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase20160702bin;

import java.io.Serializable;

/**
 *
 * @author osman.mejia
 */
public class Clase implements Serializable{
    private String descripcion;
    private int uv;
    
    private static final long SerialVersionUID=555L;

    public Clase(String descripcion, int uv) {
        this.descripcion = descripcion;
        this.uv = uv;
    }

    public Clase() {
    }
    
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
    
}
