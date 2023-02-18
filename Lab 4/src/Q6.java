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
public class Q6 implements ActionListener{
    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;
    JPanel p1,p2,p3;
    Q6(){
        f=new JFrame("Correct Answer");
        l1=new JLabel("Who is the founder of JAVA",JLabel.CENTER);
        l2=new JLabel("",JLabel.CENTER);
        b1=new JButton("Dennis Ritchie");
        b2=new JButton("James Gosling");
        b3=new JButton("Guido Ban Rossum");
        b4=new JButton("Patrick Naughton");
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p1.setLayout(new BorderLayout());
        p3.setLayout(new BorderLayout());
        p2.setLayout(new GridLayout(2,2));
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        p1.add(l1,BorderLayout.CENTER);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        
        p3.add(l2,BorderLayout.CENTER);
                
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.setLayout(new GridLayout(3,1));
        f.setSize(300,300);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand()== "James Gosling"){
            l2.setText("You are Correct");
        }
        else{
            l2.setText("You are Incorrect");
        }
    }
    
    public static void main(String args[]){
        new Q6();
    }
}
