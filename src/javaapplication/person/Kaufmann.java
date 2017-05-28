package javaapplication.person;

import javaapplication.konto.Bankkonto;
import javaapplication.konto.UbsKonto;
import javaapplication.person.base.Person;

/**
 * Created by vmadmin on 24.02.2017.
 */
public class Kaufmann extends Person {

    private Bankkonto konto;
    private double vermoegen;

    /*public Kaufmann() {
        super(bankkonto);
    }*/
    public Kaufmann(Bankkonto konto, double vermögen, String name, String vorname, double lohn) {
        super(name, vorname, lohn);
        this.konto = konto;
        this.vermoegen = vermögen;
    }

    public Bankkonto getKonto() {
        return konto;
    }

    public void setKonto(Bankkonto konto) {
        this.konto = konto;
    }

    public double getVermögen() {
        return vermoegen;
    }

    public void setVermögen(double vermögen) {
        this.vermoegen = vermögen;
    }
}
