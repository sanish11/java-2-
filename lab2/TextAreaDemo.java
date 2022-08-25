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
public class TextAreaDemo {
    public TextAreaDemo(){
    Frame f= new Frame("Java TextArea%Demo");
    
    f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
  
   f.setSize(600,550);
   f.setLayout(new GridLayout(3, 2));

Label l1 = new Label("Control in action: TextArea");
    l1.setAlignment(Label.CENTER);

TextArea txt = new TextArea("We are demonstrating TextArea");


Panel p= new Panel();
p.setLayout(new FlowLayout());
Label l2 = new Label("Comments: ", Label.LEFT);
Button b=new Button("Show");

p.add(l2);
p.add(txt);
p.add(b);
f.add(l1);
f.add(p);

f.setVisible(true);
}
    public static void main(String[] args) {
        new TextAreaDemo();
    }
}
