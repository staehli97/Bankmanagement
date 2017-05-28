/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;


import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javafx.scene.input.KeyCode;

/**
 *
 * @author vmadmin
 */
public class MyKeyListener extends KeyAdapter {

    private GUI_Main b1;
    private Panel_Beispiel m1;
    private Panel_Beispiel2 m2;
    
    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        
        
        System.out.println(e);

        int keyCode = e.getKeyCode();
     
        if(keyCode == 112){
            System.out.println("F1");
            
            Raiffeisen_Konto r1 = new Raiffeisen_Konto("Sparkonto", 1, 10000);
            Manager m1 = new Manager(r1, 100000, "Stähli", "Lars", 25000);
            
            

           // m2 = new Panel_Beispiel2();
            
            //b1.add(m2, BorderLayout.CENTER);
           
            
            //m2.setVisible(true);
            
            
        }
        else if(keyCode == 113){
            System.out.println("F2");
            
            //b1.removeAll();
            
            //m2 = new Panel_Beispiel2();
            
            //b1.add(m2,BorderLayout.CENTER);
            //m2.setVisible(true);
            
            UBS_Konto ubk1 = new UBS_Konto("Sparkonto", 2, 5000);
            Kaufmann k1 = new Kaufmann(ubk1, 50000, "Maurer", "Sebastian", 7000);
            
        }
        else if(keyCode == 114){
            System.out.println("F3");
            Valiant_Konto v1 = new Valiant_Konto("Lohnkonto", 3, 3000);
            Putzfrau p1 = new Putzfrau(v1, 2000, "Keller", "Anuraly", 800);

            
            
        }
        else{
            System.out.println("Nothing");
        }
    }

    //public MyKeyListener(GUI_Bank b1) {
      //  super();
        //this.b1 = b1;
        //System.out.println("instance");
    //}
    
    public MyKeyListener(GUI_Main b1) {
        super();
        this.b1 = b1;
        System.out.println("instance");
    }
    
    

   
    
    
}
