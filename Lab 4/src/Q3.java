import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Q3 implements ActionListener{
    JFrame f;
    JTextField t1;
    JLabel l1,l2;
    JButton b1;

    Q3(){
        f=new JFrame("Reverse Number");
        l1=new JLabel("Number");
        l2=new JLabel();
        t1=new JTextField(10);
        
        b1=new JButton("Check");
        
        
        b1.addActionListener(this);
        
        
                
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.add(l2);
        f.setLayout(new FlowLayout());
        f.setSize(500,150);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        int num=Integer.parseInt(t1.getText());
        int n=num;
        int arm=0;
        while(num!=0){
            int rem=num%10;
            arm=arm+(rem*rem*rem);
            num=num/10;
        }
        if(arm==n){
            l2.setText("It is Armstong");
        }else{
            l2.setText("It is not Armstong");
        }
    }
    public static void main(String args[]){
        new Q3();
    }
}
