package Lab3;
import java.awt.*;
import java.awt.event.*;

public class Q3ColorChange implements ActionListener {
    Frame f;
    Button red, green, blue, close;
    public Q3ColorChange(){
        f = new Frame("Choose a color");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");
        close = new Button("Close");
        
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        close.addActionListener(this);
        
        f.add(red);
        f.add(green);
        f.add(blue);
        f.add(close);

        
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String action = ae.getActionCommand();
        
        switch(action){
            case "Red":
                f.setBackground(Color.RED);
                break;
            case "Green":
                f.setBackground(Color.GREEN);
                break;
            case "Blue":
                f.setBackground(Color.BLUE);
                break;
            case "Close":
                System.exit(0);
                break;
        }
        
    }
    public static void main(String[] args) {
        new Q3ColorChange();
    }
}
