
import javaapplication.Raiffeisen_Konto;

/**
 * Created by vmadmin on 24.02.2017.
 */
public class Manager extends Person {
    
    private Raiffeisen_Konto rk;
    private double kontostand;

    public Manager(Raiffeisen_Konto rk, double kontostand, String name, String vorname, double lohn) {
        super(name, vorname, lohn);
        this.rk = rk;
        this.kontostand = kontostand;
    }

    

}
