/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase20240123;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Duenio {
    private String dni;
    private String nombre;
    private double sueldo;
    private ArrayList <Hobbie> hobbies = new ArrayList();

    public Duenio() {
    }

    public Duenio(String dni, String nombre, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Hobbie> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<Hobbie> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Duenio{" + "dni=" + dni + ", nombre=" + nombre + ", sueldo=" + sueldo + ", hobbies=" + hobbies + '}';
    }
    
    
    
    
}
