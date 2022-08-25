package Lab1;
import java.awt.*;

public class Q1WindowFrame {
    public Q1WindowFrame(){
        Frame f = new Frame("My First GUI Program");
        
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q1WindowFrame();
    }
}

