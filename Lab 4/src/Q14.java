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
public class Q14 extends JFrame{
    JMenuBar mb;
    JMenu nm,rm,cm;
    JMenuItem newMenu,openMenu;
    JRadioButtonMenuItem firstRadio,secondRadio;
    JCheckBoxMenuItem firstCheck,secondCheck;
    ButtonGroup bg;
    Q14(){
        mb=new JMenuBar();
        nm=new JMenu("New Menu");
        rm=new JMenu("Radio Menu");
        cm=new JMenu("Check Menu");
        
        newMenu=new JMenuItem("New Project");
        openMenu=new JMenuItem("Open Project");
        nm.add(newMenu);
        nm.add(openMenu);
        
        firstRadio=new JRadioButtonMenuItem("First Radio Option");
        secondRadio=new JRadioButtonMenuItem("Second Radio Option");
        bg=new ButtonGroup();
        bg.add(firstRadio);
        bg.add(secondRadio);
        rm.add(firstRadio);
        rm.add(secondRadio);
        
        firstCheck=new JCheckBoxMenuItem("First Check Option");
        secondCheck=new JCheckBoxMenuItem("Second Check Option");
        cm.add(firstCheck);
        cm.add(secondCheck);
        
        mb.add(nm);
        mb.add(rm);
        mb.add(cm);
        
        setJMenuBar(mb);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new Q14();
    }
}
