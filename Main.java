// Importa la clase JFrame del paquete javax.swing (para crear la ventana)
import java.awt.BorderLayout;
import javax.swing.*;
import paneles.BannerPanel;
import paneles.LoginView;

public class Main {

    public static void main(String[] args) {
        // Título y tamaño de la ventana
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");
        miVentana.setSize(1000, 800);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        miVentana.setLayout(new BorderLayout());
        miVentana.setLocationRelativeTo(null);
        
        // BannerPanel
        BannerPanel panelBanner = new BannerPanel();
        miVentana.add(panelBanner.getJPanel(), BorderLayout.WEST);

        LoginView panelLogin = new LoginView(miVentana); 
        miVentana.add(panelLogin.getJPanel(), BorderLayout.CENTER);

        miVentana.setVisible(true);
    }
}