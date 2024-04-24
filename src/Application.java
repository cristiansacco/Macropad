import frames.HomepagePanel;
import frames.IntellijPanel;
import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class Application {

    public static void main(String[] args){

        JFrame frame = new JFrame("Dashboard");

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        cardPanel.add(new HomepagePanel(cardLayout),Constants.homepage);
        cardPanel.add(new IntellijPanel(cardLayout),Constants.app_intellij);

        frame.add(cardPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Constants.pixelWidth, Constants.pixelHeight);
        frame.setVisible(true);

        cardLayout.show(cardPanel,Constants.homepage);
    }
}
