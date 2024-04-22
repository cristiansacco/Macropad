package frames;

import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameApplication extends JFrame {


    Homepage homepage = new Homepage();

    public JFrameApplication(){
        super("Dashboard");
        //        frameSetup();
        Container c = this.getContentPane();
        setSize(800, 480);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addPanels();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void addPanels(){
        add(homepage);

        homepage.intellij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                ScriptLauncher.scriptLauncher(IntellijScripts.activate_intelliJ);
                Intellij intellijFrame = new Intellij();

                setVisible(false);
            }
        });
    }
}
