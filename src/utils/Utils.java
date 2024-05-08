package utils;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Utils {

    private static URL getPath(String pngName){
        try{
            return Utils.class.getResource("/png/"+ pngName+".png");

        }catch (Exception e){
            return null;
        }
    }
    public static JButton buttonBuilder(String name){
        JButton button = new JButton(name);
        button.setOpaque(true);
        button.setBorder(BorderFactory.createEtchedBorder(Color.BLACK,Color.GRAY));
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.LIGHT_GRAY);

        button.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
        //Icon icon = new ImageIcon("src/png/"+ button.getText()+".png");
        URL url = getPath(button.getText());
        if (url != null) {
            Icon icon = new ImageIcon(url);
            button.setIcon(icon);
            if(icon.getIconHeight()>0 && icon.getIconWidth()>0)
                button.setText("");
        }

        return button;
    }

    public static int matrixIndex(int row,int column){
        return Constants.columns_standard*(row-1)+column-1;
    }
}
