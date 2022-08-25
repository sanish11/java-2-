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
public class Q8Calculator {
    public Q8Calculator(){
    Frame f= new Frame();
    f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }});
    Label l1= new Label("Num1",Label.LEFT);
    Label l2= new Label("Num2",Label.LEFT);
    Label l3= new Label("Result",Label.LEFT);
    TextField txt1 = new TextField();
    TextField txt2 = new TextField();
    TextField txt3 = new TextField();
    
    Panel p1= new Panel(new GridLayout(3,2));
    Panel p2= new Panel(new GridLayout(1,2));
    p1.add(l1);
    p1.add(txt1);
    p1.add(l2);
    p1.add(txt2);
    p1.add(l3);
    p1.add(txt3);
    txt3.setEditable(false);
   // p1.setSize(600,300);
   /// p2.setSize(5,5);
    
    
    Button b1= new Button("+");
    Button b2= new Button("-");  
    
    
    p2.add(b1);
    p2.add(b2);
    
  
    //p2.setLayout(new GridLayout(1,2));
    
    f.add(p1);
    f.add(p2);
    
    
    f.setSize(600,300);
    f.setLayout(new GridLayout(2,1));
    f.setLocationRelativeTo(null);
    f.setVisible(true);;   
    }
    public static void main(String[] args){
        new Q8Calculator();
    }
    
}
