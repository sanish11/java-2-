/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir
 */
import javax.swing.*;
public class Q13 extends JFrame{
    String colhead[]={"ID","Name","Product","Price in $"};
    String data[][]={{"100","John","pencil","5"},
    {"101","Mirian","handkerchief","50"},
    {"102","Katy","pen","10"},
    {"103","Agnes","ink pot","15"},
    {"104","Stanley","chair","100"},
    {"105","Robert","geometry box","120"},
    {"106","Cooper","flower","45"},
    {"107","Phil","copy","9"}};
    JTable t1;
    JScrollPane p1;
    Q13(){
        t1=new JTable(data,colhead);
        p1=new JScrollPane(t1);
        
        add(p1);
        setTitle("My Window");
        setSize(350,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Q13();
    }
}
