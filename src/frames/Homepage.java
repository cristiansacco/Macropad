package frames;

import javax.swing.*;
import java.awt.*;

public class Homepage extends JFrame {

    // Buttons inseriti nella schermata homepage
    JButton intellij = new JButton("Intellij");
    JButton prova = new JButton("Prova");

    public Homepage() {
        super("Homepage");
        Container c = this.getContentPane();
        int rows = 3;
        int columns = 4;
        c.setLayout(new GridLayout(rows,columns));
        c.add(intellij);
        c.add(prova);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);
    }

}
