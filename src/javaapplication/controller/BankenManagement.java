package javaapplication.controller;

import javaapplication.gui.panel.MainMenuPanel;
import javaapplication.gui.frame.MainMenuFrame;

/**
 * Created by vmadmin on 24.02.2017.
 */
public class BankenManagement {

    public static void main(String[] args) {

        MainMenuFrame menuFrame = new MainMenuFrame();
        menuFrame.setSize(600, 600);

        MainMenuPanel mainMenuPanel = new MainMenuPanel();
        menuFrame.add(mainMenuPanel);
        menuFrame.setVisible(true);

    }
}
