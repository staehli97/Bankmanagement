package javaapplication.person;

import javaapplication.konto.Bankkonto;
import javaapplication.konto.RaiffeisenKonto;
import javaapplication.person.base.Person;

/**
 * Created by vmadmin on 24.02.2017.
 */
public class Manager extends Person {

    private Bankkonto konto;
    private double vermoegen;

    public Manager(Bankkonto konto, double kontostand, String name, String vorname, double lohn) {
        super(name, vorname, lohn);
        this.konto = konto;
        this.vermoegen = kontostand;
    }

    public Bankkonto getKonto() {
        return konto;
    }

    public void setKonto(Bankkonto konto) {
        this.konto = konto;
    }

    public double getKontostand() {
        return vermoegen;
    }

    public void setKontostand(double kontostand) {
        this.vermoegen = kontostand;
    }

    
}
