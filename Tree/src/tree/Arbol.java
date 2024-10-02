package tree;
public class Arbol {
    private Nodo raiz;

    public Arbol() {
        raiz = new Nodo(null);
    }

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public void recorrer (Nodo n){   
        System.out.print(n+"[");
        for (Nodo hijo : n.getHijos()) {
            if (hijo.getHijos().isEmpty() ) { 
                if (n.getHijos().indexOf(hijo) == n.getHijos().size()-1 ) {
                    System.out.print(hijo+" "); 
                } else {
                    System.out.print(hijo+", "); 
                }                    
            } else { 
                recorrer(hijo);
            }
        }
       System.out.print("], ");
    }
    
   

    
    
    
}
