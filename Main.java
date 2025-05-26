import java.awt.BorderLayout;
import javax.swing.*;
import vistazz.BannerPanel;
import vistazz.LoginView;

public class Main {
    public static void main(String[] args) {
        // Título y tamaño de la ventana
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");
        miVentana.setSize(1000, 800);
        miVentana.setLayout(new BorderLayout());
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        // BannerPanel
        BannerPanel panelBanner = new BannerPanel();
        miVentana.add(panelBanner.getJPanel(), BorderLayout.WEST);

        // LoginView
        LoginView panelLogin = new LoginView(miVentana); 
        miVentana.add(panelLogin.getJPanel(), BorderLayout.CENTER);

        miVentana.setVisible(true);
    }
}