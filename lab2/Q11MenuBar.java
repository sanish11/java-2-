/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author student
 */
import java.awt.*;
import java.awt.event.*;

public class Q11MenuBar {
    public Q11MenuBar(){
    Frame f=new Frame("Menu Demo");
    f.setSize(400,400);
     f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    MenuBar m=new MenuBar();
    Menu file= new Menu("File");
    Menu edit= new Menu("Edit");
    Menu run= new Menu("Run");
    Menu source= new Menu("Source");
    Menu refactor= new Menu("Refactor");
    Menu navigate= new Menu("Navigate");
    Menu search= new Menu("Search");
    Menu project= new Menu("Project");
    Menu window= new Menu("Window");
    Menu help= new Menu("Help");
    
    m.add(file);
    m.add(edit);
    m.add(run);
    m.add(source);
    m.add(refactor);
    m.add(navigate);
    m.add(search);
    m.add(project);
    m.add(window);
    m.add(help);
    
    f.setMenuBar(m);
    
    MenuItem openProject= new MenuItem("Open Project");
    MenuItem closeProject= new MenuItem("Close Project");
    MenuItem buildAll= new MenuItem("Build All");
    MenuItem buildProject= new MenuItem("Build Project");
   
   project.add(openProject);   
   project.add(closeProject);   
   project.add(buildAll);   
   project.add(buildProject);   

   f.setLocationRelativeTo(null);
   f.setVisible(true);
    
    }
    public static void main(String[] args) {
        new Q11MenuBar();
    }
}
