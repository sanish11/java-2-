/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author khadg
 */
public class Q6List {
     public Q6List(){
        Frame f = new Frame("List");
        
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        Label l =  new Label("Select your favorite sport from the list:",Label.RIGHT);
        Panel p= new Panel();
         List lst=new List(7,true);

     lst.add("Badminton");
     lst.add("Hockey");
     lst.add("Tennis");
     lst.add("Football");
     lst.add("Cricket");
     lst.add("Formula one");
     lst.add("Rugby");
        f.add(l);
        p.add(lst);
        f.add(p);
        
        f.setSize(500,200);
        f.setLayout(new GridLayout(1,2));
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q6List();
    }
}
