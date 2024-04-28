package panels.mac;

import utils.Constants;
import utils.KeyboardShortcuts;
import scripts.ScriptLauncher;
import scripts.Scripts;
import scripts.ScriptsSpotify;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static utils.Utils.buttonBuilder;

public class MacPanel extends JPanel {

    private CardLayout cardLayout;
    private int buttonSize = Constants.rows_standard * Constants.columns_standard;

    public MacPanel(CardLayout cardLayout){

        this.cardLayout = cardLayout;
        setLayout(new GridLayout(Constants.rows_standard,Constants.columns_standard));
        setBackground(Color.BLACK);

        JButton intellij = buttonBuilder(Constants.app_intellij);
        buttonSize--;
        JButton spotify = buttonBuilder(Constants.app_spotify);
        buttonSize--;
        JButton muteUnmuteButton = buttonBuilder(Constants.muteUnmute);
        buttonSize--;
        JButton playPauseButton = buttonBuilder(Constants.playPause);
        buttonSize--;
        JButton nextTrackButton = buttonBuilder(Constants.nextTrack);
        buttonSize--;
        JButton backButton = buttonBuilder(Constants.back);
        buttonSize--;
        JButton copyButton = buttonBuilder(Constants.copy);
        buttonSize--;

        //add apps
        add(intellij);
        add(spotify);

        // empty buttons
        for(int i = 0;i<buttonSize;i++){
            add(buttonBuilder(""));
        }
        add(copyButton);
        add(muteUnmuteButton);
        add(playPauseButton);
        add(nextTrackButton);
        add(backButton);

        intellij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(getParent(),Constants.app_intellij);
            }
        });

        spotify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(ScriptsSpotify.activate_spotify);
            }
        });

        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(Scripts.copy);
            }
        });
        muteUnmuteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(Scripts.mute_unmute);
            }
        });

        playPauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(ScriptsSpotify.spotify_play_pause);
            }
        });

        nextTrackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(ScriptsSpotify.spotify_nextTrack);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(getParent(),Constants.homepage);
            }
        });

    }

}
