
package ventanaz;
import java.awt.*;
import javax.swing.*;
import paneles.MenuLateralPanel;
import tabla.TablaEjemplo;

public class DashBoard extends JFrame {
    
    public DashBoard(){
      
        this.setTitle("Dashboard");
        this.setSize(1900, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        
        this.add(new MenuLateralPanel().getPanel());
        TablaEjemplo panelTabla = new TablaEjemplo();
        this.add(panelTabla, BorderLayout.WEST);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DashBoard();
        });
    }
}
