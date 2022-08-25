package Lab1;
import java.awt.*;

public class Q3HelloWorld {
    public Q3HelloWorld(){
        Frame f = new Frame("Hello World");
        
        Button b = new Button("Hello");
        b.setBounds(30,60,80,30);
        
        f.add(b);
        f.setSize(500,150);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q3HelloWorld();
    }
}
