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
public class Q11 extends JFrame implements ActionListener{
    String fruits[] = {"apple", "orange", "banana", "grapes", "guava","pineapple","lemon"};      
    JList<String> l1;
    JButton b1;
    JTextArea t1;
    JScrollPane jsp;
    Q11(){
        l1=new JList<>();
        jsp=new JScrollPane(l1);
        jsp.setPreferredSize(new Dimension(120,90));
        b1=new JButton("copy>>>");
        t1=new JTextArea(5,9);
        
        l1.setFixedCellHeight(15);
        l1.setFixedCellWidth(100);
        l1.setListData(fruits);
        
        b1.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(jsp);
        add(b1);
        add(t1);
        
        setTitle("Choose Fruits");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        int i=l1.getSelectedIndex();
        t1.setText(fruits[i]);
    }
    
    public static void main(String[] args) {
        new Q11();
    }
}
