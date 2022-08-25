package Lab1;
import java.awt.*;

public class Q2Dimension {
    public Q2Dimension(){
        Frame f = new Frame("My First GUI Program");
        
        Dimension d = new Dimension(600,400);
        f.setSize(d);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q2Dimension();
    }
}
