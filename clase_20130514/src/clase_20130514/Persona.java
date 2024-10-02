
package clase_20130514;

public class Persona {
    private String Nombre;
    private int Edad;
    private String nacionalidad;

    public Persona(String Nombre, int Edad, String nacionalidad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return Nombre;
    }
}
