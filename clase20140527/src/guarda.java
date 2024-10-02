
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class guarda implements Runnable{
   private JProgressBar barra;
   private JLabel hora;

    public guarda(JProgressBar barra, JLabel hora) {
        this.barra = barra;
        this.hora = hora;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JLabel getHora() {
        return hora;
    }

    public void setHora(JLabel hora) {
        this.hora = hora;
    }
   
    
    @Override
    public void run() {         
        while(true){            
            try {
                File f=new File("./bitacora.txt");
                FileWriter fw=new FileWriter(f,true);
                BufferedWriter bw=new BufferedWriter(fw);
                bw.write(hora.getText()+"  "+barra.getValue());
                bw.newLine();
                bw.flush();
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
    guardar
    
    
}
