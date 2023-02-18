/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Q8 extends JFrame implements ActionListener{
    JPanel p1;
    JButton b1;
    JLabel l1,l2;
    JCheckBox cb1,cb2,cb3,cb4;
    Q8(){
        b1=new JButton("Submit");
        l1=new JLabel("Food Ordering System",JLabel.CENTER);
        l2=new JLabel("",JLabel.CENTER);
        cb1=new JCheckBox("Mo Mo");
        cb2=new JCheckBox("Chowmein");
        cb3=new JCheckBox("Pizza");
        cb4=new JCheckBox("Fry Rice");
        p1=new JPanel();
        p1.setLayout(new GridLayout(3,2));
        p1.add(cb1);
        p1.add(cb3);
        p1.add(cb2);
        p1.add(cb4);
        p1.add(b1);
        
        b1.addActionListener(this);

        
        setTitle("Food Ordering System");
        setLayout(new GridLayout(3,1));
        add(l1);
        add(p1);
        add(l2);
        
        
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String val="";
        int n=0;
        if(cb1.isSelected()){
            val=val+cb1.getText()+" ";
            n++;
        }
        if(cb2.isSelected()){
            val=val+cb2.getText()+" ";
            n++;
        }
        if(cb3.isSelected()){
            val=val+cb3.getText()+" ";
            n++;
        }
        if(cb4.isSelected()){
            val=val+cb4.getText()+" ";
            n++;
        }
        l2.setText("You have selected "+n+" items they are "+val);
    }
    public static void main(String[] args) {
        new Q8();
    }
}
