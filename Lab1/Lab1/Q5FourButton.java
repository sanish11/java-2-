package Lab1;
import java.awt.*;

public class Q5FourButton {
    public Q5FourButton(){
        Frame f = new Frame("Hello World");
        Button b1 = new Button("One");
        Button b2 = new Button("Two");
        Button b3 = new Button("Three");
        Button b4 = new Button("Four");
        
        b1.setBounds(200,100,80,30);
        b2.setBounds(320,100,80,30);
        b3.setBounds(200,180,80,30);
        b4.setBounds(320,180,80,30);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q5FourButton();
    }
}
