package panelez;
import java.awt.*;
import javax.swing.*;

public class MenuLateralPanel extends JPanel {
    
    public MenuLateralPanel() {
        this.setSize(300, 1000);
        this.setOpaque(true);
        this.setBackground(Color.RED);
        
        // Configurar layout para centrar los componentes
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaciado entre botones
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        // Crear botones
        JButton historialBtn = new JButton("Historial");
        JButton pacientesBtn = new JButton("Pacientes");
        
        // Estilo opcional para los botones
        historialBtn.setPreferredSize(new Dimension(200, 50));
        pacientesBtn.setPreferredSize(new Dimension(200, 50));
        
        // Agregar botones al panel
        this.add(historialBtn, gbc);
        this.add(pacientesBtn, gbc);
    }

    public JPanel getPanel() {
        return this;
    }
}