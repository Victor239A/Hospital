
package ventanaz;
import java.awt.*;
import javax.swing.*;
import tabla.TablaEjemplo;

public class DashBoard extends JFrame {
    
    public DashBoard(){
      
        this.setTitle("Dashboard");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        

        TablaEjemplo panelTabla = new TablaEjemplo();
        this.add(panelTabla, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DashBoard();
        });
    }
}
