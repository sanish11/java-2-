/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author khadg
 */
import java.awt.*;
import java.awt.event.*;
public class Q10GridBagLayout {
    public Q10GridBagLayout(){
    Frame f= new Frame("GridBag Demo");
    Panel p=new Panel();
    p.setLayout(new GridBagLayout());
    
    Button b1= new Button("This");
    Button b2= new Button("is");
    Button b3= new Button("GridBag");
    Button b4= new Button("Demo");
    
    GridBagConstraints gbc= new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=0;
    gbc.ipadx=15;
    gbc.ipady=50;
    p.add(b1,gbc);
    
    gbc.gridx=1;
    gbc.gridy=0;
    gbc.ipadx=60;
    gbc.ipady=40;
    p.add(b2,gbc);
    
    gbc.gridx=0;
    gbc.gridy=1;
    gbc.ipadx=60;
    gbc.ipady=40;
    p.add(b3,gbc);
    
    gbc.gridx=1;
    gbc.gridy=1;
    gbc.ipadx=80;
    gbc.ipady=60;
    p.add(b4,gbc);
    
    f.add(p);
    f.setSize(400,400);
    f.setVisible(true);
    f.setLocationRelativeTo(null);
    
    f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }});

    }
    public static void main(String[] args) {
        new Q10GridBagLayout();
    }
    
}
