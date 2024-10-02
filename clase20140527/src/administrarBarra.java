
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;


public class administrarBarra extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;

    public administrarBarra(JProgressBar barra) {
        this.barra = barra;
        avanzar=true;
        vive=true;
    }
    
    
    

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }


    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }


    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100000000){
                    vive=false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }

    
}
