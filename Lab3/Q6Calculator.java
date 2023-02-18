package Lab3;
import java.awt.*;
import java.awt.event.*;

public class Q6Calculator implements ActionListener {
    Frame f;
    Panel p1,p2;
    Label l1,l2,l3;
    TextField t1,t2,result;
    Button b1,b2,b3,b4;
    public Q6Calculator(){
        f = new Frame("Calculator");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        p1 = new Panel(new GridLayout(3,2));
        p2 = new Panel(new FlowLayout(FlowLayout.CENTER,10,20));
        
        l1 = new Label("Number 1",Label.CENTER);
        l2 = new Label("Number 2",Label.CENTER);
        l3 = new Label("Result",Label.CENTER);
        
        t1 = new TextField(15); 
        t2 = new TextField(15); 
        result = new TextField(15); 
        result.setEditable(false);
        
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(result);
        
        b1 = new Button(" + ");
        b2 = new Button(" - ");
        b3 = new Button(" * ");
        b4 = new Button(" / ");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        
        f.add(p1);
        f.add(p2);
        
        f.setSize(500,300);
        f.setLayout(new GridLayout(2,1));
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String operator = ae.getActionCommand();
        int n1, n2, res=0;
        n1 = Integer.parseInt(t1.getText());
        n2 = Integer.parseInt(t2.getText());
        
        switch(operator){
            case " + ":
                res = n1+n2;
                break;
            case " - ":
                res = n1-n2;
                break;
            case " * ":
                res = n1*n2;
                break;
            case " / ":
                res = n1/n2;
                break;
        }
        result.setText(""+res);
    }
    public static void main(String[] args) {
        new Q6Calculator();
    }
}
