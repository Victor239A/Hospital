package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

public class LoginView {

    private JPanel panelLogin;

    public LoginView() {
        panelLogin = new JPanel();
        panelLogin.setPreferredSize(new Dimension(500, 800));
        panelLogin.setOpaque(true);
        panelLogin.setBackground(Color.WHITE);
        panelLogin.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 40, 10, 40);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Título
        JLabel titulo = new JLabel("Login", SwingConstants.CENTER);
        titulo.setPreferredSize(new Dimension(500, 50));
        titulo.setOpaque(true);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelLogin.add(titulo, gbc);

        // Entrada de correo
        JTextField entradaCorreo = new JTextField();
        gbc.gridy = 1;
        panelLogin.add(entradaCorreo, gbc);

        // Entrada de contraseña
        JPasswordField entradaContra = new JPasswordField();
        gbc.gridy = 2;
        panelLogin.add(entradaContra, gbc);

        // Botón alineado a la derecha en la línea 3
        JButton entradaBoton = new JButton("Ingresar");
        entradaBoton.setPreferredSize(new Dimension(100, 30)); // Botón más pequeño
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE; // Para que no se expanda
        gbc.gridx = 1; // Columna derecha
        panelLogin.add(entradaBoton, gbc);
    }

    public JPanel getJPanel() {
        return panelLogin;
    }
}