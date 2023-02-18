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
public class Draw extends Applet implements MouseMotionListener{
        Panel area;
        
        public void init(){
            addMouseMotionListener(this);
           
        }
        public void mouseDragged(MouseEvent e) {
            Graphics g=getGraphics();
            g.setColor(Color.BLACK);
            g.fillOval(e.getX(), e.getY(), 5, 5);
        }
        public void mouseMoved(MouseEvent e){}
}
