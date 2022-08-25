package Lab1;
import java.awt.*;

public class Q4HelloWorldGui {
    public Q4HelloWorldGui(){
        Frame f = new Frame("Hello World");
        
        Button b1 = new Button("Apple");
        Button b2 = new Button("Orange");
        Button b3 = new Button("Guava");
        
        b1.setBounds(90,80,80,30);
        b2.setBounds(190,80,80,30);
        b3.setBounds(290,80,80,30);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setSize(450,150);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q4HelloWorldGui();
    }
}
