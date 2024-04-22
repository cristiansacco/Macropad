package frames;

import utils.Constants;
import utils.scripts.IntellijScripts;
import utils.scripts.ScriptLauncher;
import utils.scripts.Scripts;
import utils.scripts.SpotifyScripts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Homepage extends JFrame {

    // Lista di Buttons inseriti nella schermata homepage
    static List<JButton> buttonList = new ArrayList<>();
    static int buttonSize = Constants.rows * Constants.columns;

    JButton intellij = new JButton(Constants.app_intellij);
    JButton spotify = new JButton(Constants.app_spotify);
    JButton muteUnmute = new JButton(Constants.muteUnmute);
    JButton playPause = new JButton(Constants.playPause);
    JButton nextTrack = new JButton((Constants.nextTrack));

    public Homepage() {

        super("Homepage");

        // Create new buttons and add them in a list
        buttonSetup();

        // all frame settings, buttons' style
        frameSetup();
    }

    private void buttonSetup() {

        // Insert buttons in the buttonList;
        addButton(intellij);
        addButton(spotify);
        addButton(new JButton(""));
        addButton(new JButton(""));
        addButton(muteUnmute);
        addButton(playPause);
        addButton(nextTrack);

        intellij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(IntellijScripts.activate_intelliJ);
            }
        });

        spotify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(SpotifyScripts.activate_spotify);
            }
        });

        muteUnmute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(Scripts.mute_unmute);
            }
        });

        playPause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(SpotifyScripts.spotify_play_pause);
            }
        });

        nextTrack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(SpotifyScripts.spotify_nextTrack);
            }
        });

        for (int i = 0; i < buttonSize; i++) {
            buttonList.add(new JButton(""));
        }

    }

    private void frameSetup() {

        Container c = this.getContentPane();
        c.setLayout(new GridLayout(Constants.rows, Constants.columns));

        for (JButton temp : buttonList) {
            temp.setOpaque(true);

            temp.setBorder(BorderFactory.createEtchedBorder(Color.BLACK,Color.WHITE));
            temp.setBackground(Color.DARK_GRAY);
            temp.setForeground(Color.LIGHT_GRAY);

//            temp.setBorder(BorderFactory.createBevelBorder(2,Color.WHITE,Color.LIGHT_GRAY));
            temp.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
            Icon icon = new ImageIcon("src/png/"+ temp.getText()+".png");
            temp.setIcon(icon);
            // temp.setText("");
            c.add(temp);
        }

        c.setBackground(Color.DARK_GRAY);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setUndecorated(true);

        setSize(800, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private static void addButton(JButton temp) {
        buttonList.add(temp);
        buttonSize--;
    }



}
