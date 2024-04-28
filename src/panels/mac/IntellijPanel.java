package panels.mac;

import scripts.ScriptsApps;
import utils.Constants;
import utils.KeyboardShortcuts;
import scripts.ScriptLauncher;
import scripts.ScriptsIntellij;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static utils.Utils.buttonBuilder;

public class IntellijPanel extends JPanel {
    private CardLayout cardLayout;
    private int buttonSize = Constants.rows_standard * Constants.columns_standard;

    public IntellijPanel(CardLayout cardLayout){

        this.cardLayout = cardLayout;
        setLayout(new GridLayout(Constants.rows_standard,Constants.columns_standard));
        setBackground(Color.BLACK);

        JButton runButton = buttonBuilder(Constants.intellij_run);
        buttonSize--;
        JButton altTabButton = buttonBuilder(Constants.altTab);
        buttonSize--;
        JButton backButton = buttonBuilder(Constants.back);
        buttonSize--;

        add(runButton);
        add(altTabButton);

        for(int i = 0;i<buttonSize;i++){
            add(buttonBuilder(""));
        }

        add(backButton);

        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    ScriptLauncher.launchScript(ScriptsApps.activate_intelliJ);
                    KeyboardShortcuts.intellijRun();
            }
        });

        altTabButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KeyboardShortcuts.altTab();
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(getParent(),Constants.macOS);
            }
        });

    }

}
