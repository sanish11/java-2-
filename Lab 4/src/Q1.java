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
public class Q1 implements ActionListener{
    JFrame f;
    JTextField t1,t2;
    JLabel l1,l2;
    JButton b1;
    JPanel p1,p2;
    Q1(){
        f=new JFrame("Prime Number Test");
        l1=new JLabel("Number");
        l2=new JLabel("Prime");
        t1=new JTextField();
        t2=new JTextField();
        t2.setEditable(false);
        b1=new JButton("Check");
        p1=new JPanel();
        p2=new JPanel();
        
        b1.addActionListener(this);
        
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p2.add(b1);
                
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p2.setLayout(new GridLayout(1,0));
        p1.setLayout(new GridLayout(2,2));
        f.add(p1);
        f.add(p2);
        f.setLayout(new GridLayout(2,1));
        f.setSize(300,300);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        int prime=Integer.parseInt(t1.getText());
        int flag=0;
        for(int i=2;i<(prime/2);i++){
            if(prime%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            t2.setText("No");
        }
        else{
            t2.setText("Yes");
        }
    }
    public static void main(String args[]){
        new Q1();
    }
}
