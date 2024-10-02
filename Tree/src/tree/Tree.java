package tree;

import java.awt.Color;
import java.util.Date;

public class Tree {
    public static void main(String[] args) {
/*                                    cosas
              /----------------------/     \--------------\--------------\
        Plantas              Animales       Date()         Musica         Color
        /    \              /        \                    /      \
      Rosa   ficus     Perros        Gatos              Rock     Reguetton        
                       /    \ 
                  Pitbull   Aguacate
*/
        Arbol a=new Arbol();
        a.getRaiz().setContenido("Cosas");
        a.getRaiz().setHijo(new Nodo("Plantas"));
        a.getRaiz().setHijo(new Nodo("Animales"));        
        a.getRaiz().setHijo(new Nodo(new Date()));
        a.getRaiz().getHijo(0).setHijo(new Nodo("Rosa"));
        a.getRaiz().getHijo(0).setHijo(new Nodo("Ficus"));
        a.getRaiz().getHijo(1).setHijo(new Nodo("Perros"));
        a.getRaiz().getHijo(1).setHijo(new Nodo("Gatos"));
        a.getRaiz().getHijo(1).getHijo(0).setHijo(new Nodo("Pitbull"));
        a.getRaiz().getHijo(1).getHijo(0).setHijo(new Nodo("Aguacate"));
        a.getRaiz().setHijo(new Nodo("Musica"));
        a.getRaiz().getHijo(3).setHijo(new Nodo("Rock"));
        a.getRaiz().getHijo(3).setHijo(new Nodo("Reguetton"));
        a.getRaiz().setHijo(new Nodo(Color.blue));
                
        a.recorrer(a.getRaiz());
                
    }
    
}
