import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage extends JFrame {


    private JPanel panelMain;
    private JButton btnMac;
    private JButton btnWindows;

    public Homepage() {
        btnMac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args){
        Homepage homepage = new Homepage();
        homepage.setContentPane(homepage.panelMain);
        homepage.setTitle("Homepage");
        homepage.setSize(300,400);
        homepage.setVisible(true);
        homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
