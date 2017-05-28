
import javaapplication.UBS_Konto;

/**
 * Created by vmadmin on 24.02.2017.
 */
public class Kaufmann extends Person {
    
    private UBS_Konto ubk1;
    private double vermögen;
    
    



    /*public Kaufmann() {
        super(bankkonto);
    }*/

    public Kaufmann(UBS_Konto ubk1, double vermögen, String name, String vorname, double lohn) {
        super(name, vorname, lohn);
        this.ubk1 = ubk1;
        this.vermögen = vermögen;
    }
}