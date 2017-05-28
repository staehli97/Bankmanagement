package javaapplication.person;

import javaapplication.konto.Bankkonto;
import javaapplication.konto.ValiantKonto;
import javaapplication.person.base.Person;

/**
 * Created by vmadmin on 24.02.2017.
 */
public class Putzfrau extends Person {

    private Bankkonto konto;
    private double vermoegen;

    public Putzfrau(Bankkonto konto, double vermögen, String name, String vorname, double lohn) {
        super(name, vorname, lohn);
        this.konto = konto;
        this.vermoegen = vermögen;
    }
    
    

    /*public Putzfrau() {
        super(bankkonto);
    }*/

    public Bankkonto getKonto() {
        return konto;
    }

    public void setKonto(Bankkonto konto) {
        this.konto = konto;
    }

    public double getVermoegen() {
        return vermoegen;
    }

    public void setVermoegen(double vermoegen) {
        this.vermoegen = vermoegen;
    }
}
