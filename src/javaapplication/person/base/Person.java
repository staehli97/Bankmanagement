package javaapplication.person.base;

/**
 * Created by vmadmin on 24.02.2017.
 */
public class Person {

    /*public final Bankkonto bankkonto;

    public Person(Bankkonto bankkonto) {
        this.bankkonto = bankkonto;
    }*/
    private String name;
    private String vorname;
    private double lohn;

    public double getLohn() {
        return lohn;
    }

    public void setLohn(double lohn) {
        this.lohn = lohn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public Person(String name, String vorname, double lohn) {
        this.name = name;
        this.vorname = vorname;
        this.lohn = lohn;
    }
}
