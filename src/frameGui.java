import javax.swing.*;

/**
 * Created by vmadmin on 24.02.2017.
 */
public class frameGui {

    public static void main(String[] args) {
        JFrame guiFrame = new JFrame("Bankmanagement");
        guiFrame.setSize(500,500);

        guiFrame.add(new JLabel("Mein Beispiel JLABEL"));
        guiFrame.add(new JButton("einloggen"));
        guiFrame.setVisible(true);
    }
}
