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
public class Q10CardLayout extends Frame implements ActionListener{

CardLayout card;

Button b1,b2,b3;

Q10CardLayout(){

card=new CardLayout(40,30);

//create CardLayout object with 40 hor space and 30 ver space
addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }});
setLayout(card);

b1=new Button("Apple");

b2=new Button("Boy");

b3=new Button("Cat");

b1.addActionListener(this);

b2.addActionListener(this);

b3.addActionListener(this);

Panel p=new Panel();

Panel p1=new Panel();

Panel p2=new Panel();

p.add(b1);

p1.add(b2);

p2.add(b3);

add(p);

add(p1);

add(p2);

setSize(300,300);

setVisible(true);

}

public void actionPerformed(ActionEvent e) {

card.next(this);

}

   public static void main(String[] args) {

Q10CardLayout cl=new Q10CardLayout();

}

}
