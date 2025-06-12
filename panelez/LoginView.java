package panelez;
import controol.LoginControler;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import javax.swing.*;
import ventanaz.*;

public class LoginView {
    private JPanel loginPanel;

    public LoginView() {
        loginPanel = new JPanel();
        loginPanel.setSize(500, 800);
        loginPanel.setOpaque(true);
        loginPanel.setLayout(new GridBagLayout());

        // ADMINISTRADOR DE DISEÑO
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 10, 80);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // TÍTULO
        JLabel titulo = new JLabel("Login");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setVerticalAlignment(SwingConstants.CENTER);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        loginPanel.add(titulo, gbc);

        // CAMPO DE USUARIO (CON PLACEHOLDER)
        JTextField entradaCorreo = new JTextField();
        entradaCorreo.setPreferredSize(new Dimension(50, 30));
        entradaCorreo.setText("Usuario");
        entradaCorreo.setForeground(Color.GRAY);
        entradaCorreo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (entradaCorreo.getText().equals("Usuario")) {
                    entradaCorreo.setText("");
                    entradaCorreo.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (entradaCorreo.getText().isEmpty()) {
                    entradaCorreo.setForeground(Color.GRAY);
                    entradaCorreo.setText("Usuario");
                }
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        loginPanel.add(entradaCorreo, gbc);

        // CAMPO DE CONTRASEÑA (CON PLACEHOLDER Y OCULTACIÓN)
        JPasswordField entradaContrasenna = new JPasswordField();
        entradaContrasenna.setPreferredSize(new Dimension(50, 30));
        entradaContrasenna.setEchoChar((char) 0); // Mostrar texto normal
        entradaContrasenna.setText("Contraseña");
        entradaContrasenna.setForeground(Color.GRAY);
        entradaContrasenna.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (new String(entradaContrasenna.getPassword()).equals("Contraseña")) {
                    entradaContrasenna.setText("");
                    entradaContrasenna.setEchoChar('*'); // Modo contraseña
                    entradaContrasenna.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (entradaContrasenna.getPassword().length == 0) {
                    entradaContrasenna.setEchoChar((char) 0);
                    entradaContrasenna.setForeground(Color.GRAY);
                    entradaContrasenna.setText("Contraseña");
                }
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 2;
        loginPanel.add(entradaContrasenna, gbc);

        // BOTÓN (MANTIENE LA LÓGICA ORIGINAL)
        JButton boton = new JButton("Ingresar");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        loginPanel.add(boton, gbc);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entradaUsuario = entradaCorreo.getText();
                String entradaContra = new String(entradaContrasenna.getPassword());
                
                // Validar que no sean los placeholders
                if (entradaUsuario.equals("Usuario") || entradaContra.equals("Contraseña")) {
                    JOptionPane.showMessageDialog(loginPanel, "Ingresa datos válidos", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (new LoginControler().validacionDatos(entradaUsuario, entradaContra)) {
                    new DashBoard();
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(loginPanel);
                    frame.dispose();
                }
            }
        });
    }

    public JPanel getPanel() {
        return loginPanel;
    }
}