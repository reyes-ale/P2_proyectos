/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_archivos_mascotas;

/**
 *
 * @author aleja
 */
public class Mascota {
    private String nombre, raza;
    private double peso, precio;
    private boolean terrestre;

    public Mascota() {
    }

    public Mascota(String nombre, String raza, double peso, double precio, boolean terrestre) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.precio = precio;
        this.terrestre = terrestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        
    }

    public boolean isTerrestre() {
        return terrestre;
    }

    public void setTerrestre(boolean terrestre) {
        this.terrestre = terrestre;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", precio=" + precio + ", terrestre=" + terrestre + '}';
    }
    
    
}
