import panels.HomepagePanel;
import panels.mac.MacPanel;
import panels.mac.IntellijPanel;
import panels.windows.WindowsPanel;
import utils.Constants;

import javax.swing.*;
import java.awt.*;

public class Application {

    public static void main(String[] args){

        /*
        Structure:
            - Jframe framne
                - JPanel cardPanel
                    - JPanel homepage
                        - JPanel macOS
                        - JPanel windowsOS
         */

        JFrame frame = new JFrame("Dashboard");

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // All panels created
        HomepagePanel homepagePanel = new HomepagePanel(cardLayout);
        MacPanel macPanel = new MacPanel(cardLayout);
        WindowsPanel windowsPanel = new WindowsPanel(cardLayout);
        IntellijPanel intellijPanel = new IntellijPanel(cardLayout);

        cardPanel.add(homepagePanel,Constants.homepage);
        cardPanel.add(macPanel,Constants.macOS);
        cardPanel.add(windowsPanel,Constants.windowsOS);
        cardPanel.add(intellijPanel,Constants.app_intellij);

        frame.add(cardPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Constants.pixel_width, Constants.pixel_height);
        frame.setVisible(true);

        cardLayout.show(cardPanel,Constants.homepage);
    }
}
