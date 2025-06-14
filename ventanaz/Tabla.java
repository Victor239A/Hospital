package ventanaz;

import data.Pacientes;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabla extends JScrollPane {  // Ahora es un componente JScrollPane

    public Tabla() {
        // Columnas y datos
        String[] columnas = {"ID ", "Nombre del paciente", "Edad", "Tipos de Consulta", "Hora"};
        Object[][] datos = new Pacientes().getDatos();

        // Crear modelo y tabla
        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        JTable table = new JTable(model);
        
        // Configurar este JScrollPane para contener la tabla
        this.setViewportView(table);
        this.setPreferredSize(new Dimension(1600,1000));
        
    }
}