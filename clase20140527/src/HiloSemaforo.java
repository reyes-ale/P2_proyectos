
import java.awt.Color;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleja
 */
public class HiloSemaforo implements Runnable{
    private JPanel sema;
    
    public HiloSemaforo(JPanel sema) {
        this.sema = sema;
    }   

    @Override
    public void run() {
        int cont =0; 
        while(true){
           if (cont==0){
               sema.setBackground(Color.RED);
               cont=1;
           }
           else if (cont==1){
                sema.setBackground(Color.GREEN);
                cont=2;
           }
           else if (cont==2){
                sema.setBackground(Color.YELLOW);
                cont=0;
           }
           
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }        
    
    }
    
}
