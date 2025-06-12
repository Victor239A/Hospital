package panelez;

import java.awt.*;
import javax.swing.*;

public class HeaderPanel extends JPanel {
    
    public HeaderPanel() {
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(1000, 65));
        this.setLayout(new GridBagLayout());

        // Tamaño de la letra
        Font largeFont = new Font("Roboto", Font.BOLD, 25);
        

        GridBagConstraints gbc = new GridBagConstraints();
       
        
    
 JLabel vista = new JLabel("Hospital");
        vista.setFont(largeFont);
        vista.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        this.add(vista, gbc);
        
       
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        this.add(Box.createGlue(), gbc);
        
    }
    
    public JPanel getPanel() {
        return this;
    }
}