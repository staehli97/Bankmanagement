package javaapplication;

import javaapplication.konto.base.DefaultBankkonto;

/**
 * Created by vmadmin on 24.03.2017.
 */
public interface Login {

    void CheckLogin(DefaultBankkonto bankKonto, int passwort);
}
