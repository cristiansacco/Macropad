import utils.MasterVolume;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MacOs extends JFrame {
    private JPanel panelMain;
    private JButton button1;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button2;
    private JButton button22;
    private JButton button10;
    private JSlider slider1;
    private MasterVolume masterVolume;

    public MacOs() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().open(new File("/System/Applications/TextEdit.app"));
                } catch (IOException ex) {

                }

            }
        });
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                slider1.setMinimum(1);
                slider1.setMaximum(100);
                masterVolume = new MasterVolume();
                masterVolume.setMasterVolume(slider1.getValue());
            }
        });
    }

    public static void main(String[] args) {

        MacOs homepage = new MacOs();
        homepage.setContentPane(homepage.panelMain);
        homepage.setTitle("Homepage");
        homepage.setSize(300,400);
        homepage.setVisible(true);
        homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
