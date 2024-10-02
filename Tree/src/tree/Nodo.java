package tree;

import java.util.ArrayList;

public class Nodo {
    private Nodo padre;
    private Object contenido;
    private ArrayList<Nodo> hijos = new ArrayList();

    public Nodo() {
    }

    public Nodo(Nodo padre) {
        this.padre = padre;
    }

    public Nodo(Nodo padre, Object contenido) {
        this.padre = padre;
        this.contenido = contenido;
    }

    public Nodo(Object contenido) {
        this.contenido = contenido;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Object getContenido() {
        return contenido;
    }

    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }

    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }

    public Nodo getHijo(int pos) {
        return hijos.get(pos);
    }

    public void setHijo(Nodo hijo) {
        this.hijos.add(hijo);
    }

    @Override
    public String toString() {
        return contenido.toString();
    }

}
