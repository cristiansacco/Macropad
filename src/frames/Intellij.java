package frames;

import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class Intellij extends JPanel {

    static int buttonSize = Constants.rows * Constants.columns;

    private JButton run;

    public Intellij(){
        frameSetup();
        add(run);
    }

    private void frameSetup() {

        setVisible(true);
    }
}
