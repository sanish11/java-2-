/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author student
 */
import java.awt.*;
import java.awt.event.*;

public class Q4ChoiceDemo {
    public Q4ChoiceDemo(){
        Frame f = new Frame("Choice Demo");
        
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        Label l =  new Label("Which language you like most?");
        
        Choice c = new Choice();
        c.add("C");
        c.add("Java");
        c.add("Python");
        c.add("C++");
        c.add("Dot Net");
        
        f.add(l);
        f.add(c);
        
        f.setSize(400,400);
        f.setLayout(new GridLayout(1,2));
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q4ChoiceDemo();
    }
}

