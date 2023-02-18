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
import javax.swing.*;
import java.awt.event.*;
public class Q5 implements ActionListener{
    JFrame f;
    JTextField t1,t2;
    JLabel l1,l2,l3,l4;
    JButton b1;
    JPanel p1,p2,p3;
    Q5(){
        f=new JFrame("Largest Number");
        l1=new JLabel("Find the Largest One",JLabel.CENTER);
        l2=new JLabel("First Number");
        l3=new JLabel("Second Number");
        l4=new JLabel("",JLabel.CENTER);
        t1=new JTextField(15);
        t2=new JTextField(15);
        b1=new JButton("Check");
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p1.setLayout(new BorderLayout());
        p3.setLayout(new BorderLayout());
        p2.setLayout(new GridLayout(3,2));
        b1.addActionListener(this);
        p1.add(l1,BorderLayout.CENTER);
        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(t2);
        p2.add(b1);
        p3.add(l4,BorderLayout.CENTER);
                
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.setLayout(new GridLayout(3,1));
        f.setSize(300,300);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        int n;
        if(n1>n2){
            n=n1;
        }
        else if(n1<n2){
            n=n2;
        }
        else{
            n=n1;
        }
        l4.setText(n+" is largest");
    }
    
    public static void main(String args[]){
        new Q5();
    }
}
