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
public class Q2ButtonDemo {
    public Q2ButtonDemo(){
     Frame f = new Frame("Button Demo");
    
    f.addWindowListener(new WindowAdapter(){ 
    public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
    }
    });
    
    Button b1= new Button("1");
    Button b2= new Button("2");  
    Button b3= new Button("3");
    Button b4= new Button("4");
    
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    
    b2.setEnabled(false);
    b4.setEnabled(false);
    
    b1.setLabel("One");
    b3.setLabel("Three");
    f.setLayout(new GridLayout(2,2));
    f.setSize(400,200);
    f.setVisible(true);
   }
    
    public static void main(String[] args) {
        new Q2ButtonDemo();
    }
    
}
