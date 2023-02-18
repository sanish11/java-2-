/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/**
 *
 * @author hp
 */
public class Calculator extends Applet implements ActionListener {
    Panel numbers,actions;
    Label firstNum,secondNum,result;
    TextField first,second,answer;
    Button sum,mul,sub,div;
    
    public void init(){
        numbers=new Panel(new GridLayout(3,2));
        actions= new Panel(new FlowLayout());
        
        firstNum= new Label("Num 1");
        secondNum= new Label("Num 2");
        result= new Label("Result");
        
        first = new TextField();
        second= new TextField();
        answer= new TextField();
        answer.setEditable(false);
        
        sum= new Button("add");
        mul = new Button("mul");
        sub= new Button("sub");
        div = new Button("div");
        
        numbers.add(firstNum);
        numbers.add(first);
        numbers.add(secondNum);
        numbers.add(second);
        numbers.add(result);
        numbers.add(answer);
        
        actions.add(sum);
        actions.add(mul);
        actions.add(sub);
        actions.add(div);
        
        setLayout(new GridLayout(2,1));
        add(numbers);
        add(actions);
        sum.addActionListener(this);    
        mul.addActionListener(this);  
        sub.addActionListener(this);  
        div.addActionListener(this);  
        
    }
    public void actionPerformed(ActionEvent a){
        int firstno=Integer.parseInt(first.getText());
        int secondno=Integer.parseInt(second.getText());
        int value;
        
        switch(a.getActionCommand()){
            case "add" :{
                value=firstno+secondno;
                answer.setText(""+value);
                break;
            }
            case "mul" :{
                value=firstno*secondno;
                answer.setText(""+value);
                break;
            }
            case "sub" :{
                value=firstno-secondno;
                answer.setText(""+value);
                break;
            }
            case "div" :{
                value=firstno/secondno;
                answer.setText(""+value);
                break;
            }
        }
    }
}
