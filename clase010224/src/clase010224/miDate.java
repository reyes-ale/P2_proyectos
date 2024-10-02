
package clase010224;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author aleja
 */
public class miDate extends Date{
    private Color color;

    public miDate(Color color, int year, int month, int date) {
        super(year, month, date);
        this.color = color;
    }

    public miDate() {
        super();
    }

    public miDate(Color color, String s) {
        super(s);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "miDate{" + "color=" + color + '}';
    }
    
    
    
    
    
    
}
