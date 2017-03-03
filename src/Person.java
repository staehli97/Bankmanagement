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


    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;

    }
}
