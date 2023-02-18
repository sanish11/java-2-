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
public class Q9 extends JFrame implements ActionListener{
    JPanel p1;
    JButton b1;
    JLabel l1,l2;
    JRadioButton rb1,rb2,rb3,rb4;
    Q9(){
        b1=new JButton("Submit");
        l1=new JLabel("Choose your Payment",JLabel.CENTER);
        l2=new JLabel("",JLabel.CENTER);
        rb1=new JRadioButton("Credit Card");
        rb2=new JRadioButton("Wallet");
        rb3=new JRadioButton("Bank Transfer");
        rb4=new JRadioButton("Cash in Delivery");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);
        p1=new JPanel();
        p1.setLayout(new GridLayout(3,2));
        p1.add(rb1);
        p1.add(rb3);
        p1.add(rb2);
        p1.add(rb4);
        p1.add(b1);
        
        b1.addActionListener(this);

        
        setTitle("Choose your Payment");
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
        if(rb1.isSelected()){
            val=rb1.getText();
        }
        if(rb2.isSelected()){
            val=rb2.getText();
        }
        if(rb3.isSelected()){
            val=rb3.getText();
        }
        if(rb4.isSelected()){
            val=rb4.getText();
        }
        l2.setText("You have selected "+val);
    }
    public static void main(String[] args) {
        new Q9();
    }
}
