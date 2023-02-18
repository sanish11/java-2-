package Lab3;
import java.awt.*;
import java.awt.event.*;

public class Q4DisplayText implements ActionListener{
    Frame f;
    Panel p1,p2;
    TextField t;
    Label l;
    Button b;
    
    public Q4DisplayText(){
        f = new Frame();
        f.addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent e){
               System.exit(0);
           } 
        });
        
        p1 = new Panel();
        p2 = new Panel();
        
        t = new TextField(15);
        b = new Button("Submit");
        l = new Label();
        
        b.addActionListener(this);
        
        p1.add(t);
        p1.add(b);
        p2.add(l);
        
        f.add(p1);
        f.add(p2);
        
        f.setSize(500,200);
        f.setLayout(new FlowLayout());
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String text = t.getText();
        l.setText(text);
    }
    public static void main(String[] args) {
        new Q4DisplayText();
    }
}
