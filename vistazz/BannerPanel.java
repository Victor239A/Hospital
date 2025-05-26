// BannerPanel.java
package vistazz;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class BannerPanel {
    
    private JPanel panelBanner;

    public BannerPanel() {
        panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500, 800));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.BLACK);
    }
    
    public JPanel getJPanel() {
        return panelBanner;
    }
}