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
public class Q7 implements ActionListener{
    JFrame f;
    JButton b1;
    JLabel l1;
    JPanel p1,p2;
    ImageIcon bulb=new ImageIcon("D:\\College l Work\\BIM 5th\\JAVA\\Labsheet\\Lab 4\\src\\bulb.jpg");
    ImageIcon unbulb=new ImageIcon("D:\\College l Work\\BIM 5th\\JAVA\\Labsheet\\Lab 4\\src\\unbulb.jpg");
    Q7(){
        f=new JFrame("ImageIcon");
        b1=new JButton("Off");
        
        
        l1=new JLabel(unbulb,JLabel.CENTER);
        
        p1=new JPanel();
        p2=new JPanel();
        p2.add(b1);
        b1.addActionListener(this);
        p1.setLayout(new BorderLayout());
        p1.add(l1,BorderLayout.CENTER);
        f.setLayout(new BorderLayout());
        f.add(p2,BorderLayout.NORTH);
        f.add(p1,BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand()=="Off"){
            b1.setText("On");
            l1.setIcon(bulb);
        }
        else{
            b1.setText("Off");
            l1.setIcon(unbulb);
        }
    }
    public static void main(String[] args) {
        new Q7();
    }
}
