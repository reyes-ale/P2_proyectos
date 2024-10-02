
import java.awt.Color;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleja
 */
public class HiloCajita implements Runnable{
    public JPanel cajita;
    public Color c1,c2;
    
    
    public HiloCajita(JPanel cajita, Color c1, Color c2) {
        this.cajita = cajita;
        this.c1=c1;
        this.c2=c2;
    }   
    

    @Override
    public void run() {
        int cont=0;
        
        while(true){
           if (cont==0){
               cajita.setBackground(c1);
               cont=1;
           }
           else if (cont==1){
                cajita.setBackground(c2);
                cont=0;
           }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }        
    
    }
}
