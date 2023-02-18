/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;
import java.awt.*;
import java.applet.*;
//import java.awt.event.*;

/**
 *
 * @author hp
 */
public class ColorChange extends Applet {
    
    public void init(){
        setBackground(Color.blue);
        setForeground(Color.white);
    }
    public void paint(Graphics g){
        g.drawLine(10,10,100,10);
        g.drawLine(10,50,100,50);
    }
}
