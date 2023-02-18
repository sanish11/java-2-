/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
/**
 *
 * @author hp
 */
public class Counter extends Applet implements ActionListener{
    JLabel name;
    JTextField text;
    Button countUp,countDown;
    JPanel items;
    public void init(){
        
        name= new JLabel("Counter",JLabel.LEFT);
        text= new JTextField(10);
        countUp= new Button("Count Up");
        countUp.addActionListener(this);
        countDown= new Button("Count Down");
        countDown.addActionListener(this);
        items =new JPanel(new FlowLayout());
        
        items.add(name);
        items.add(text);
        items.add(countUp);
        items.add(countDown);
        
        add(items);
    }
    public void actionPerformed(ActionEvent a){
        if(a.getActionCommand()=="Count Up"){
            int value= Integer.parseInt(text.getText());
            value++;
            text.setText(""+value);
        }
        if(a.getActionCommand()=="Count Down"){
            int value= Integer.parseInt(text.getText());
            value--;
            text.setText(""+value);
        }
    }
}
