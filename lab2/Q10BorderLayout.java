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
public class Q10BorderLayout {
    public Q10BorderLayout(){
    Frame f = new Frame("BorderLayout Example");

f.setLayout(new BorderLayout());

Button b1 = new Button("One");

Button b2 = new Button("Two");

Button b3 = new Button("Three");

Button b4 = new Button("Four");

Button b5 = new Button("Five");

f.add(b1, BorderLayout.CENTER);

f.add(b2, BorderLayout.EAST);

f.add(b3, BorderLayout.WEST);

f.add(b4, BorderLayout.NORTH);

f.add(b5, BorderLayout.SOUTH);

f.setSize(400, 400);

f.setVisible(true);

f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }});


}

public static void main(String[] args) {

new Q10BorderLayout();

    }
}
