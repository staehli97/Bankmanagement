package javaapplication.konto;

import javaapplication.konto.base.DefaultBankkonto;
import javaapplication.konto.Bankkonto;

/**
 * Created by vmadmin on 24.02.2017.
 */
public class UbsKonto extends DefaultBankkonto {

    public UbsKonto(String kontoBezeichnung, int kontoNr, int maxAusz) {
        super(kontoBezeichnung, kontoNr, maxAusz);
    }
}
