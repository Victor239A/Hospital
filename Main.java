import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import vistas.LoginView;


// Clase principal que contiene el método main
public class Main {

    // Método principal, punto de entrada de la aplicación
    public static void main(String[] args) {


        //Ventana
        
        // Crea una instancia de JFrame (ventana gráfica)
        JFrame miVentana = new JFrame();
        
        // Establece el título que aparecerá en la barra superior de la ventana
        miVentana.setTitle("Hospital SCL");
        
       
        miVentana.setSize(1000,800);
        miVentana.setLayout(new BorderLayout());

        JPanel panelBanner= new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,400));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
    
        miVentana.add(panelBanner,BorderLayout.WEST);
      
        LoginView panelLogin =new LoginView();

        miVentana.add(panelLogin.getJPanel());

        miVentana.add(panelLogin.getJPanel(), BorderLayout.CENTER);

        miVentana.setVisible(true);
    }
}