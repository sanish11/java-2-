package Lab3;
import java.awt.*;
import java.awt.event.*;

public class Q5SwapNumbers implements ActionListener {
    Frame f;
    Panel p1,p2;
    Label l1,l2;
    TextField t1,t2;
    Button b;
    public Q5SwapNumbers(){
        f = new Frame("Swap");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        p1 = new Panel(new GridLayout(2,2));
        p2 = new Panel();
        
        l1 = new Label("Number 1");
        l2 = new Label("Number 2");
        
        t1 = new TextField(15);
        t2 = new TextField(15);
        
        b = new Button("Swap");
        
        b.addActionListener(this);
        
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        
        p2.add(b);
        
        f.add(p1);
        f.add(p2);
        f.setSize(400,200);
        f.setLayout(new GridLayout(2,1));
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        int n1,n2,temp;
        n1 = Integer.parseInt(t1.getText());
        n2 = Integer.parseInt(t2.getText());
        
        temp = n1;
        n1 = n2;
        n2 = temp;
        
        t1.setText(""+n1);
        t2.setText(""+n2);
        
    }
    public static void main(String[] args) {
        new Q5SwapNumbers();
    }
}
