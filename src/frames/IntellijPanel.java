package frames;

import utils.Constants;
import utils.KeyboardShortcuts;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntellijPanel extends JPanel {
    private CardLayout cardLayout;
    private int buttonSize = Constants.rows * Constants.columns;
    JButton runButton = buttonBuilder(Constants.intellij_run);

    public IntellijPanel(CardLayout cardLayout){

        this.cardLayout = cardLayout;
        setLayout(new GridLayout(Constants.rows,Constants.columns));

        setBackground(Color.BLACK);

        add(runButton);


        for(int i = 0;i<buttonSize;i++){
            add(buttonBuilder(""));
        }

        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    KeyboardShortcuts.intellijRun();
                } catch (AWTException ex) {
//                    throw new RuntimeException(ex);
                }
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
        if(icon.getIconHeight()>0 && icon.getIconWidth()>0){
            button.setText("");
        }
        if(!name.equalsIgnoreCase(""))
            buttonSize--;

        return button;
    }

}
