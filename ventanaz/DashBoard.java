package ventanaz;

import java.awt.Color;
import javax.swing.JFrame;

public class DashBoard extends JFrame {

    public DashBoard() {
        this.setTitle("DashBoard");
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.GREEN); 
    }
}