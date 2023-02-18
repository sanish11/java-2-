package Lab3;
import java.awt.*;
import java.awt.event.*;

public class Q7Factorial implements ActionListener {
    Frame f;
    Label l1,l2;
    TextField t1,t2;
    Button b;
    public Q7Factorial(){
        f = new Frame("Factorial");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        l1 = new Label("Number");
        l2 = new Label("Factorial");
        
        t1 = new TextField(10);
        t2 = new TextField(10);
        
        b = new Button("Calculate");
        b.addActionListener(this);
        
        f.add(l1);
        f.add(t1);
        f.add(b);
        f.add(l2);
        f.add(t2);
        
        f.setSize(500,100);
        f.setLayout(new FlowLayout());
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        int n, fact=1;
        n = Integer.parseInt(t1.getText());
        
        for(int i=2;i<=n;i++){
            fact = fact*i;
            
        }
        t2.setText(""+fact);
    }
    public static void main(String[] args) {
        new Q7Factorial();
    }
}
