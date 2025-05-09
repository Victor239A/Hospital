// Importa la clase JFrame del paquete javax.swing (para crear la ventana)
import javax.swing.JFrame;
// Importa la clase JLabel del paquete javax.swing (para crear etiquetas de texto)
import javax.swing.JLabel;

// Clase principal que contiene el método main
public class Main {

    // Método principal, punto de entrada de la aplicación
    public static void main(String[] args) {
        
        // Crea una instancia de JFrame (ventana gráfica)
        JFrame miVentana = new JFrame();
        
        // Establece el título que aparecerá en la barra superior de la ventana
        miVentana.setTitle("Hospital SCL");
        
        // Define el tamaño inicial de la ventana (ancho: 1000px, alto: 800px)
        miVentana.setSize(1000,800);
        
        // Crea una instancia de JLabel (etiqueta para mostrar texto)
        JLabel texto = new JLabel();
        
        // Establece el texto que mostrará la etiqueta
        texto.setText("Hola Mundo");
        
        // Añade la etiqueta (JLabel) a la ventana (JFrame)
        miVentana.add(texto);
        
        // Hace visible la ventana (sin esta línea la ventana no se mostraría)
        miVentana.setVisible(true);
    }
}