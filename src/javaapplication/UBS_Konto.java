package javaapplication;

/**
 * Created by vmadmin on 24.02.2017.
 */
public class UBS_Konto extends Bankkonto implements IBankkonto {
    public UBS_Konto(String kontoBezeichnung, int kontoNr, int maxAusz) {
        super(kontoBezeichnung, kontoNr, maxAusz);
    }
}
