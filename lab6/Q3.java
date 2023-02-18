/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Q3 implements ActionListener {

    JFrame f;
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4, t5;
    JButton b1;

    Q3() {
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1 = new JLabel("id");
        l2 = new JLabel("name");
        l3 = new JLabel("age");
        l4 = new JLabel("phone_number");
        l5 = new JLabel("address");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        b1 = new JButton("Submit");
        b1.addActionListener(this);
        f.setLayout(new GridLayout(6, 2));
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
        f.add(t5);
        f.add(b1);
        f.setSize(300, 250);
        f.setVisible(true);

    }

    public static void main(String[] args) throws Exception {
        new Q3();
    }

    @Override
    public void actionPerformed(ActionEvent ae){

        int id = Integer.parseInt(t1.getText());
        String name = t2.getText();
        int age = Integer.parseInt(t3.getText());
        String phone_number = t4.getText();
        String address = t5.getText();
        try {
            insertData(id,name,age,phone_number,address);
        } catch (Exception e) {
            System.out.println("Error in inserting");
        }
    }
    public void insertData(int id,String name,int age,String phone_number,String address) throws Exception{
        String sql="INSERT INTO user VALUES ("+id+",'"+name+"',"+age+
                ",'"+phone_number+"','"+address+"')";
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/db_test";
        Connection con=DriverManager.getConnection(url, "root","");
        if(con!=null){
            Statement stmt=con.createStatement();
            int result=stmt.executeUpdate(sql);
            if(result!=-1){
               System.out.println("Data inserted successfully");
                    
            }else{
                System.out.println("Data not inserted");
            }
            stmt.close();
            con.close();
        }else{
            System.out.println("Unabale to get connection");
        }
    }
}
