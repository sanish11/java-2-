package Lab2;

/**
 *
 * @author khadg
 */
import java.awt.*;
import java.awt.event.*;
public class Q5ListDemo {
    public Q5ListDemo(){
    Frame f=new Frame("List Demo");

    f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
     Label l= new Label("Choose the planet:", Label.RIGHT);
     Panel p=new Panel();
     List lst=new List(4,false);

     lst.add("Mercury");
     lst.add("Venus");
     lst.add("Earth");
     lst.add("Mars");
     lst.add("Jupiter");
     lst.add("Saturn");
     lst.add("Neptune");
     lst.add("Uranus");
     lst.add("Pluto");
     
    p.add(lst);
    f.add(l);
    f.add(p);
    
    f.setSize(450,150);
    f.setLayout(new GridLayout(1,2));
    f.setVisible(true);
}

public static void main(String[] args) {
        new Q5ListDemo();
    }

}