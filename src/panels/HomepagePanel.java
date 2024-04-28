package panels;

import utils.Constants;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static utils.Utils.buttonBuilder;

public class HomepagePanel extends JPanel {
    private CardLayout cardLayout;
    public int buttonSize = Constants.rows_homepage * Constants.columns_homepage;


    public HomepagePanel(CardLayout cardLayout){

        // Setup
        this.cardLayout = cardLayout;
        setLayout(new GridLayout(Constants.rows_homepage,Constants.columns_homepage));
        setBackground(Color.BLACK);

        JButton windowsButton = buttonBuilder(Constants.windowsOS);
        JButton macButton = buttonBuilder(Constants.macOS);

        add(windowsButton);
        add(macButton);

        windowsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(getParent(),Constants.windowsOS);
            }
        });

        macButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(getParent(),Constants.macOS);
            }
        });

    }

}
