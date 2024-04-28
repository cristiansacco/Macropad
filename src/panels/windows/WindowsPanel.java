package panels.windows;

import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static utils.Utils.buttonBuilder;

public class WindowsPanel extends JPanel {

    private CardLayout cardLayout;
    private int buttonSize = Constants.rows_standard * Constants.columns_standard;

    public WindowsPanel(CardLayout cardLayout){

        this.cardLayout = cardLayout;
        setLayout(new GridLayout(Constants.rows_standard,Constants.columns_standard));
        setBackground(Color.BLACK);

        JButton backButton = buttonBuilder(Constants.back);
        buttonSize--;

        for(int i = 0;i<buttonSize;i++){
            add(buttonBuilder(""));
        }

        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(getParent(),Constants.homepage);
            }
        });
    }

}
