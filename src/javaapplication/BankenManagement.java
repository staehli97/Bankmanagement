package javaapplication;

/**
 * Created by vmadmin on 24.02.2017.
 */
public class BankenManagement {

    public static void main(String[] args) {

        GUI_Main b1 = new GUI_Main();
        b1.setSize(600, 600);
        b1.setVisible(true);

        Panel_Beispiel b2 = new Panel_Beispiel();
        b1.add(b2);
    }
}
