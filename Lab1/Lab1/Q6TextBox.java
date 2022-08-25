package Lab1;
import java.awt.*;

public class Q6TextBox {
    public Q6TextBox(){
        Frame f = new Frame();
        
        Label l = new Label("User ID");
        
        TextField t = new TextField(10);
        
        f.add(l);
        f.add(t);
        
        f.setSize(250,150);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q6TextBox();
    }
}
