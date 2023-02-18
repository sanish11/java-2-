/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;
import java.awt.*;
import java.applet.*;

/**
 *
 * @author hp
 */
public class Shapes extends Applet{

    public void paint(Graphics g){
        g.drawLine(20,20,320,20);
        g.fillOval(100,25,20,20);
        g.drawString("Applet 101",130,40);
        g.fillOval(195,25,20,20);
        g.drawLine(20,50,320,50);
        
        g.drawString("Rectangle",10,90);
        g.drawRect(120,70,25,25);
        g.drawString("Filled Rectangle",10,130);
        g.fillRect(120,110,25,25);
        g.drawString("Arc",10,170);
        g.drawArc(120,145,25,25,50,260);
    }
}
