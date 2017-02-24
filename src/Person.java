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
    private String ibanNr;
    private int einkommen;
    private int pin;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
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

    public String getIbanNr() {
        return ibanNr;
    }

    public void setIbanNr(String ibanNr) {
        this.ibanNr = ibanNr;
    }

    public int getEinkommen() {
        return einkommen;
    }

    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }

    public Person(String name, String vorname, String ibanNr, int einkommen, int pin) {
        this.name = name;
        this.vorname = vorname;
        this.ibanNr = ibanNr;
        this.einkommen = einkommen;
        this.pin = pin;
    }
}
