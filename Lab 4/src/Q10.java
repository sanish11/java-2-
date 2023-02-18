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
public class Q10 extends JFrame{
    JButton b1;
    JPanel p1,p2,p3;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextArea t1;
    JTabbedPane tab;
    JCheckBox cb1,cb2,cb3,cb4;
    Q10(){
        tab = new JTabbedPane();
        l1 = new JLabel("Welcome to IOC",JLabel.CENTER);
        l2 = new JLabel("Select the course",JLabel.CENTER);
        l3 = new JLabel("Leave your Comment",JLabel.CENTER);
        l4=new JLabel("   ");
        l5=new JLabel("   ");
        l6=new JLabel("   ");
        t1=new JTextArea();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        cb1=new JCheckBox("C");
        cb2=new JCheckBox("C++");
        cb3=new JCheckBox("Java");
        cb4=new JCheckBox("PHP"); 
        b1=new JButton("Submit");
        
        p1.add(l1);
        
        p2.setLayout(new GridLayout(6,1));
        p2.add(l2);
        p2.add(cb1);
        p2.add(cb2);
        p2.add(cb3);
        p2.add(cb4);
        p2.add(b1);
        
        p3.setLayout(new BorderLayout());
        p3.add(l3,BorderLayout.NORTH);
        p3.add(l4,BorderLayout.EAST);
        p3.add(l5,BorderLayout.WEST);
        p3.add(l6,BorderLayout.SOUTH);
        p3.add(t1,BorderLayout.CENTER);
        
        tab = new JTabbedPane();
        tab.addTab("Dashboard",p1);
        tab.addTab("Courses",p2);
        tab.addTab("Command",p3);
    
        add(tab);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Q10();
    }
    
}
