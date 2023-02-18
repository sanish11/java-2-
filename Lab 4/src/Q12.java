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
public class Q12 extends JFrame implements ActionListener{
    JPanel p1,p2,p3;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4;
    JRadioButton rb1,rb2,rb3;
    JButton b1,b2,b3;
    JComboBox<String> jcb;
    ButtonGroup bg;
    String program[]={"BIM","BBA","BCA","BHM","BBM"};
    Q12(){
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        
        b1=new JButton("Add");
        b2=new JButton("Reset");
        b3=new JButton("Cancel");
        
        l1=new JLabel("Name:");
        l2=new JLabel("Address:");
        l3=new JLabel("Gender:");
        l4=new JLabel("Program:");
        l5=new JLabel("Phone:");
        l6=new JLabel("Email:");
        
        t1=new JTextField(15);
        t2=new JTextField(15);
        t3=new JTextField(15);
        t4=new JTextField(15);
        
        rb1=new JRadioButton("male");
        rb2=new JRadioButton("female");
        rb3=new JRadioButton();
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        p3.setLayout(new FlowLayout());
        p3.add(rb1);
        p3.add(rb2);
        
        jcb=new JComboBox<>(program);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        p1.setLayout(new GridLayout(6,6));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(p3);
        p1.add(l4);
        p1.add(jcb);
        p1.add(l5);
        p1.add(t3);
        p1.add(l6);
        p1.add(t4);
        
        p2.setLayout(new FlowLayout());
        p2.add(b3,JLabel.CENTER);
        p2.add(b2,JLabel.CENTER);
        p2.add(b1,JLabel.CENTER);
        
        setSize(500,500);
        setLayout(new GridLayout(2,1));
        add(p1);
        add(p2);
        
        setTitle("Student Info Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String gend;
        if(rb1.isSelected()){
            gend=rb1.getText();
        }
        else if(rb2.isSelected()){
            gend=rb3.getText();
        }
        else{
            gend="null";
        }
        if(e.getActionCommand().equals("Cancel")){
            System.exit(0);
        }
        if(e.getActionCommand().equals("Reset")){
            rb3.setSelected(true);
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            jcb.setSelectedIndex(0);
        }
        if(e.getActionCommand().equals("Add")){
            JOptionPane.showConfirmDialog(null,""+l1.getText()+"="+t1.getText()+"\n"
            +l2.getText()+"="+t2.getText()+"\n"
            +l3.getText()+"="+gend+"\n"
            +l4.getText()+"="+jcb.getSelectedItem()+"\n"
            +l5.getText()+"="+t3.getText()+"\n"
            +l6.getText()+"="+t4.getText()+"\n");
        }
    }
    public static void main(String[] args) {
        new Q12();
    }
}
