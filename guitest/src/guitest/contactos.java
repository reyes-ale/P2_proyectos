package guitest;

import java.awt.Color;
import java.util.Date;

public class contactos {
    private int codigo;
    private String nombre;
    private String sexo; 
    private Date fecha_nacimiento;
    private Color color;
    private String direccion;
    private String idioma;
    private String hobbie1;
    private String hobbie2;
    private String hobbie3;
    private String hobbie4;
    private String hobbie5;

    public contactos(){
    }

    public contactos(int codigo, String nombre, String sexo, Date fecha_nacimiento, Color color, String direccion, String idioma, String hobbie1, String hobbie2, String hobbie3, String hobbie4, String hobbie5) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.color = color;
        this.direccion = direccion;
        this.idioma = idioma;
        this.hobbie1 = hobbie1;
        this.hobbie2 = hobbie2;
        this.hobbie3 = hobbie3;
        this.hobbie4 = hobbie4;
        this.hobbie5 = hobbie5;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getHobbie1() {
        return hobbie1;
    }

    public void setHobbie1(String hobbie1) {
        this.hobbie1 = hobbie1;
    }

    public String getHobbie2() {
        return hobbie2;
    }

    public void setHobbie2(String hobbie2) {
        this.hobbie2 = hobbie2;
    }

    public String getHobbie3() {
        return hobbie3;
    }

    public void setHobbie3(String hobbie3) {
        this.hobbie3 = hobbie3;
    }

    public String getHobbie4() {
        return hobbie4;
    }

    public void setHobbie4(String hobbie4) {
        this.hobbie4 = hobbie4;
    }

    public String getHobbie5() {
        return hobbie5;
    }

    public void setHobbie5(String hobbie5) {
        this.hobbie5 = hobbie5;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    

    @Override
    public String toString() {
        return  nombre ;
    }
   
    
    

}

