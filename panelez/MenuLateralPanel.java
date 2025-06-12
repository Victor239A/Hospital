package panelez;
import java.awt.*;
import javax.swing.*;

public class MenuLateralPanel extends JPanel {
    
    public MenuLateralPanel() {
        this.setSize(318, 1000);
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
        JButton historialBtn = new JButton("Consultas");
        JButton pacientesBtn = new JButton("Pacientes");
        JButton DiagnósticosBtn = new JButton("Agendar");
        JButton NotasClinicasBtn = new JButton("Farmacia");
        JButton RecetarBtn = new JButton("Examenes");
        JButton AgendarCitaBtn = new JButton("Residencia");
        
        // Estilo opcional para los botones
        historialBtn.setPreferredSize(new Dimension(100, 40));
        pacientesBtn.setPreferredSize(new Dimension(100, 40));
        DiagnósticosBtn.setPreferredSize(new Dimension(100, 40));
        NotasClinicasBtn.setPreferredSize(new Dimension(100, 40));
        RecetarBtn.setPreferredSize(new Dimension(100, 40));
        AgendarCitaBtn.setPreferredSize(new Dimension(100, 40));
        
        // Agregar botones al panel
        this.add(historialBtn, gbc);
        this.add(pacientesBtn, gbc);
        this.add(DiagnósticosBtn, gbc);
        this.add(NotasClinicasBtn, gbc);
        this.add(RecetarBtn, gbc);
        this.add(AgendarCitaBtn, gbc);    
    }

    public JPanel getPanel() {
        return this;
    }
}