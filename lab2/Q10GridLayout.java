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
public class Q10GridLayout {
    public Q10GridLayout(){
    Frame f = new Frame("GridLayout Example");

f.setLayout(new GridLayout(2,2));

Button b1 = new Button("One");

Button b2 = new Button("2");

Button b3 = new Button("Three");

Button b4 = new Button("4");

f.add(b1);

f.add(b2);

f.add(b3);

f.add(b4);

f.setSize(400, 400);

f.setLocationRelativeTo(null);

f.setVisible(true);

f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }});

}

public static void main(String[] args) {

new Q10GridLayout();

}

}
    
    

