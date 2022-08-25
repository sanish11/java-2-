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
public class Q1LabelDemo {
    public Q1LabelDemo(){
    Frame f = new Frame("Label Demo");
    
    f.addWindowListener(new WindowAdapter(){ 
    public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
    }
    });
    
    Label l1= new Label("Name");
    l1.setAlignment(Label.LEFT);
    Label l2= new Label("Address");
    l2.setAlignment(Label.LEFT);
    
    TextField txt1= new TextField(10);
    TextField txt2= new TextField(10);
    
    Button b1= new Button("OK");
    Button b2= new Button("Cancel");
    
    f.add(l1);
    f.add(txt1);
  
    
    f.add(l2);
    f.add(txt2);
    
    f.add(b1);
    f.add(b2);
    
    l1.setText("Full Name");
    f.setSize(450,250);
    f.setLayout(new GridLayout(3,2));
    f.setVisible(true);
     }
    public static void main(String[] args) {
        new Q1LabelDemo();
    }
}
