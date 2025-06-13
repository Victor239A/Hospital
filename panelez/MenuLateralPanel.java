package panelez;

import java.awt.*;
import javax.swing.*;

public class MenuLateralPanel extends JPanel {

    public MenuLateralPanel() {
        this.setSize(318, 1000);
        this.setOpaque(true);
        this.setBackground(new Color(240, 240, 240)); // Fondo claro para un diseño moderno
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15); // Espaciado uniforme entre botones
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        Font buttonFont = new Font("Roboto", Font.BOLD, 16);

        JButton historialBtn = new JButton("Consultas");
        JButton pacientesBtn = new JButton("Pacientes");
        JButton DiagnósticosBtn = new JButton("Agendar");
        JButton NotasClinicasBtn = new JButton("Farmacia");
        JButton RecetarBtn = new JButton("Examenes");
        JButton AgendarCitaBtn = new JButton("Residencia");

        JButton[] buttons = {historialBtn, pacientesBtn, DiagnósticosBtn, NotasClinicasBtn, RecetarBtn, AgendarCitaBtn};

        for (JButton button : buttons) {
            button.setPreferredSize(new Dimension(200, 50));
            button.setBackground(new Color(0, 123, 255)); // Azul moderno
            button.setForeground(Color.WHITE);
            button.setFocusPainted(false);
            button.setFont(buttonFont);
            button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Borde interno para un diseño limpio
            this.add(button, gbc);
        }
    }

    public JPanel getPanel() {
        return this;
    }
}
