package Lab3;
import java.awt.*;
import java.awt.event.*;

public class Q2CounterUpDown implements ActionListener{
    Frame f;
    Label l;
    TextField t;
    Button b1,b2,b3;
    
    public Q2CounterUpDown(){
        f = new Frame("Counter");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        l = new Label("Counter");
        t = new TextField("5", 15);
        b1 = new Button("Up");
        b2 = new Button("Down");
        b3 = new Button("Reset");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        f.add(l);
        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setSize(400,100);
        f.setLayout(new FlowLayout());
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        int n = Integer.parseInt(t.getText());
        
        String count = ae.getActionCommand();
        
        switch(count){
            case "Up":
                n++;
                break;
            case "Down":
                n--;
                break;
            case "Reset":
                n=0;
                break;
        }
        t.setText(""+n);
        
    }
    public static void main(String[] args) {
        new Q2CounterUpDown();
    }
}
