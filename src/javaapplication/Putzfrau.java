package javaapplication;

/**
 * Created by vmadmin on 24.02.2017.
 */
public class Putzfrau extends Person {
    
    private Valiant_Konto vk1;
    private double vermögen;

    public Putzfrau(Valiant_Konto vk1, double vermögen, String name, String vorname, double lohn) {
        super(name, vorname, lohn);
        this.vk1 = vk1;
        this.vermögen = vermögen;
    }
    
   
    /*public Putzfrau() {
        super(bankkonto);
    }*/
}