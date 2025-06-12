
package ventanaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import panelez.HeaderPanel;
import panelez.MenuLateralPanel;

public class DashBoard extends JFrame {
    
    public DashBoard() {
        setTitle("Hospital");
        setSize(2000, 1100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());

             this.add(new HeaderPanel().getPanel(),BorderLayout.NORTH);

        this.add(new MenuLateralPanel().getPanel(),BorderLayout.EAST);
        
        // Crear e integrar la tabla
        Tabla tabla = new Tabla();
        this.add(tabla, BorderLayout.EAST); // Agregar directamente al JFrame
        
    
        setVisible(true);
    }
}
