/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
public class Product {
     private int id;
    private String descripcion;
    private double precio;
    private String unidad;

    public Product() {
    }

    public Product(int id, String descripcion, double precio, String unidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidad = unidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return " " + id + " - " + descripcion ;
    }
    
    
    
}
