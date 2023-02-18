/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class ButtonPress extends Applet implements ActionListener{
    JTextField text;
    JButton click;
    //Panel item;
    public void init(){
        text= new JTextField();
        text.setBounds(20,10,80,25);
        click= new JButton("Click");
        click.setBounds(100,10,80,25);
        click.addActionListener(this);
        add(text);
        add(click);
        setLayout(null);
        setBackground(Color.lightGray);
        
    }
    public void actionPerformed(ActionEvent a){
        text.setText("Pressed");
    }
}
