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

public class Q3CheckBoxDemo {
    public Q3CheckBoxDemo(){
        Frame f = new Frame("CheckBox Demo");
        
        f.addWindowListener(new WindowAdapter(){
            @Override 
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        Label l =  new Label("Choose program to enroll");
        Checkbox c1 = new Checkbox("C");
        Checkbox c2 = new Checkbox("Java");
        Checkbox c3 = new Checkbox("HTML");
        Checkbox c4 = new Checkbox("PHP");
        CheckboxGroup cg = new CheckboxGroup();
        Label l2 =  new Label("Payment");
        
        Checkbox c5 = new Checkbox("Now",cg,false);
        Checkbox c6 = new Checkbox("Later",cg,true);
        
        f.add(l);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(l2);
        f.add(c5);
        f.add(c6);
        
        f.setSize(400,600);
        f.setLayout(new GridLayout(8,1));
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q3CheckBoxDemo();
    }
}
 

