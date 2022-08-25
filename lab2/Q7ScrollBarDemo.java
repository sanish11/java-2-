/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author khadg
 */
import java.awt.*;
import java.awt.event.*;
public class Q7ScrollBarDemo{
    public Q7ScrollBarDemo() {

Frame f = new Frame("Scrollbar Example");
 f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

final Label l = new Label();

l.setAlignment(Label.CENTER);

l.setSize(400, 100);
Scrollbar vs = new Scrollbar(Scrollbar.VERTICAL,1,5,50,100);
Scrollbar hs = new Scrollbar(Scrollbar.HORIZONTAL,1,5,100,100);

vs.setBounds(100, 100, 50, 150);
hs.setBounds(200,100,150,50);

f.add(vs);
f.add(hs);

f.add(l);

f.setSize(400, 400);

f.setLayout(null);

f.setVisible(true);


}
public static void main(String[] args) {

new Q7ScrollBarDemo();

}
}
