package panels.mac;

import scripts.ScriptsApps;
import utils.Constants;
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

        JButton intellijButton = buttonBuilder(Constants.app_intellij);
        JButton spotifyButton = buttonBuilder(Constants.app_spotify);
        JButton braveButton = buttonBuilder(Constants.app_brave);

        JButton previousTrackButton = buttonBuilder(Constants.previousTrack);
        JButton playPauseButton = buttonBuilder(Constants.playPause);
        JButton nextTrackButton = buttonBuilder(Constants.nextTrack);

        JButton muteUnmuteButton = buttonBuilder(Constants.muteUnmute);
        JButton decreaseVolumeButton = buttonBuilder(Constants.decreaseVolume);
        JButton increaseVolumeButton = buttonBuilder(Constants.increaseVolume);
        JButton backButton = buttonBuilder(Constants.back);

        //first row: apps
        add(intellijButton);
        add(spotifyButton);
        add(braveButton);
        add(buttonBuilder(""));
        add(buttonBuilder(""));

        // second row: music controls
        add(previousTrackButton);
        add(playPauseButton);
        add(nextTrackButton);
        add(buttonBuilder(""));
        add(buttonBuilder(""));

        // third row: system
        add(decreaseVolumeButton);
        add(increaseVolumeButton);
        add(muteUnmuteButton);
        add(buttonBuilder(""));
        add(backButton);



        intellijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(getParent(),Constants.app_intellij);
            }
        });

        spotifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.launchScript(ScriptsApps.activate_spotify);
            }
        });
        braveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.launchScript(ScriptsApps.activate_brave);
            }
        });
        muteUnmuteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.launchScript(Scripts.mute_unmute);
            }
        });

        previousTrackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.launchScript(ScriptsSpotify.spotify_previousTrack);
            }
        });

        playPauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.launchScript(ScriptsSpotify.spotify_play_pause);
            }
        });

        nextTrackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.launchScript(ScriptsSpotify.spotify_nextTrack);
            }
        });

        decreaseVolumeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.launchScript(Scripts.decrease_volume_by_5);
            }
        });

        increaseVolumeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.launchScript(Scripts.increase_volume_by_5);
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
