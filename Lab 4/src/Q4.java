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
public class Q4 {
    JFrame f;
    JLabel l1,l2,l3;
    ImageIcon image;
    Q4(){
        f=new JFrame("ImageIcon");

        f.setSize(600,800);
        image=new ImageIcon("D:\\College l Work\\BIM 5th\\JAVA\\Labsheet\\Lab 4\\src\\images.jpg");
        l1=new JLabel(image,JLabel.CENTER);
        l2=new JLabel("Java Programming",JLabel.CENTER);
        l3=new JLabel("Try it",JLabel.CENTER);
        
        f.setLayout(new BorderLayout());

        
        f.add(l2,BorderLayout.SOUTH);
        f.add(l1,BorderLayout.CENTER);
        f.add(l3,BorderLayout.NORTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    public static void main(String args[]){
        new Q4();
    }
}
