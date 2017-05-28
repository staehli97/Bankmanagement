/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.controller;

import javaapplication.konto.RaiffeisenKonto;
import javaapplication.konto.ValiantKonto;
import javaapplication.konto.UbsKonto;
import javaapplication.gui.panel.BeispielPanel;
import javaapplication.gui.panel.MainMenuPanel;
import javaapplication.person.Kaufmann;
import javaapplication.person.Manager;
import javaapplication.person.Putzfrau;
import javaapplication.gui.frame.MainMenuFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author vmadmin
 */
public class MyKeyListener extends KeyAdapter {

    private MainMenuFrame menuFrame;
    private MainMenuPanel mainMenuPanel;
    private BeispielPanel beispielPanel;

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);

        System.out.println(e);

        int keyCode = e.getKeyCode();

        if (keyCode == 112) {
            System.out.println("F1");

            RaiffeisenKonto r1 = new RaiffeisenKonto("Sparkonto", 1, 10000);
            Manager m1 = new Manager(r1, 100000, "Stähli", "Lars", 25000);

            
        } else if (keyCode == 113) {
            System.out.println("F2");

            //b1.removeAll();
            //m2 = new BeispielPanel();
            //b1.add(m2,BorderLayout.CENTER);
            //m2.setVisible(true);
            UbsKonto ubk1 = new UbsKonto("Sparkonto", 2, 5000);
            Kaufmann k1 = new Kaufmann(ubk1, 50000, "Maurer", "Sebastian", 7000);

        } else if (keyCode == 114) {
            System.out.println("F3");
            ValiantKonto v1 = new ValiantKonto("Lohnkonto", 3, 3000);
            Putzfrau p1 = new Putzfrau(v1, 2000, "Keller", "Anuraly", 800);

        } else {
            System.out.println("Nothing");
        }
    }

    //public MyKeyListener(GUI_Bank b1) {
    //  super();
    //this.b1 = b1;
    //System.out.println("instance");
    //}
    public MyKeyListener(MainMenuFrame b1) {
        super();
        this.menuFrame = b1;
        System.out.println("instance");
    }

}
