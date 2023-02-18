package Lab3;
import java.awt.*;
import java.awt.event.*;

public class Q1Counter implements ActionListener{
    Frame f;
    Label l;
    TextField t;
    Button b;
    public Q1Counter(){
        f = new Frame("AWT Counter");
        
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        l = new Label("Enter an integer");
        t = new TextField(15);
        b = new Button("Count Down");
        
        b.addActionListener(this);
        
        f.add(l);
        f.add(t);
        f.add(b);
        
        f.setSize(400,100);
        f.setLayout(new FlowLayout());
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        int n = Integer.parseInt(t.getText());
        
        t.setText(""+(n-1));
    }
    public static void main(String[] args) {
        new Q1Counter();
    }
}
