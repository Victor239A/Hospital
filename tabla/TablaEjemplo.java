package tabla;
import data.Pacientes;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TablaEjemplo extends JPanel {
    
    public TablaEjemplo() {

        setLayout(new BorderLayout());

        String[] columnas = { "ID", "Nombre", "Edad" };
        
      Object[][] datos = new Pacientes().getDatos();
        
      DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        
        JScrollPane scrollPane = new JScrollPane(tabla);
        
        add(scrollPane, BorderLayout.CENTER);
        
    }
}