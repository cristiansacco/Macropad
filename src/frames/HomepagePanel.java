package frames;

import utils.Constants;
import utils.scripts.ScriptLauncher;
import utils.scripts.Scripts;
import utils.scripts.ScriptsSpotify;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomepagePanel extends JPanel {

    private CardLayout cardLayout;
    private int buttonSize = Constants.rows * Constants.columns;
    JButton intellij = buttonBuilder(Constants.app_intellij);
    JButton spotify = buttonBuilder(Constants.app_spotify);
    JButton muteUnmute = buttonBuilder(Constants.muteUnmute);
    JButton playPause = buttonBuilder(Constants.playPause);
    JButton nextTrack = buttonBuilder(Constants.nextTrack);

    public HomepagePanel(CardLayout cardLayout){

        this.cardLayout = cardLayout;
        setLayout(new GridLayout(Constants.rows,Constants.columns));

        setBackground(Color.BLACK);

        add(intellij);
        add(spotify);
        add(muteUnmute);
        add(playPause);
        add(nextTrack);

        for(int i = 0;i<buttonSize;i++){
            add(buttonBuilder(""));
        }

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

        muteUnmute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(Scripts.mute_unmute);
            }
        });

        playPause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(ScriptsSpotify.spotify_play_pause);
            }
        });

        nextTrack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptLauncher.scriptLauncher(ScriptsSpotify.spotify_nextTrack);
            }
        });


    }


    private JButton buttonBuilder(String name){
        JButton button = new JButton(name);
        button.setOpaque(true);

        button.setBorder(BorderFactory.createEtchedBorder(Color.BLACK,Color.GRAY));
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.LIGHT_GRAY);

        button.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
        Icon icon = new ImageIcon("src/png/"+ button.getText()+".png");
        button.setIcon(icon);
        button.setText("");
        if(!name.equalsIgnoreCase(""))
            buttonSize--;

        return button;
    }

}
