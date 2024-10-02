
package clase_16_ene_24;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Clase_16_ene_24 {

    public static void main(String[] args) throws ParseException {
       Color c;
       c=Color.blue;
        System.out.println(c);
        c=JColorChooser.showDialog(null, "seleccione color", Color.yellow);
        System.out.println(c);
       
       Date fecha;
       //asignacion
       //momento actual
        fecha = new Date();
        fecha.setDate(17);
        fecha.setHours(10);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
       
        
       //punto en el tiempo
       String a,m,d;
       a=JOptionPane.showInputDialog("Año");
       m=JOptionPane.showInputDialog("mes");
       d=JOptionPane.showInputDialog("dia");
       
       
       
       Date fn = new Date(Integer.parseInt(a)-1900,Integer.parseInt(m)-1, Integer.parseInt(d));
        System.out.println(fn);
        
       //Date fn2 = new Date ("10,08,2006");
        //System.out.println(fn2);
        
         Date fn2 = new Date(JOptionPane.showInputDialog("fecha A en formato mm/dd/yyyy"));
         System.out.println(sdf.format(fn2));
        
        //calendar
        //Calendar c = new GregorianCalendar(2005, 9, 15);
        //fn2=c.getTime();
        
        
        //simpledateformat
        
        SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yy");
        fn2 = df2.parse("08/10/06");
        System.out.println(fn2);
        
        
        //parseo - dividir en elementos menores
        //casteo - cambiar tipo 
        //split
          String cadena = "Unitec;edif3;cuarto piso; aula 411";
          String []pars = cadena.split(";");
          System.out.println(pars[2]);
          
        //Stringtokenizer
        
        StringTokenizer st = new StringTokenizer(cadena,";");
        st.nextElement();
        st.nextElement();
        System.out.println(st.nextToken());
        
        while (st.hasMoreElements()) {
            Object nextElement = st.nextElement();
            System.out.println(st.nextElement());
            
        }
        //Scanner
        Scanner sc = new Scanner(cadena);
        sc.useDelimiter(";");
        System.out.println(sc.next());
        
        
       
    }
    
}
