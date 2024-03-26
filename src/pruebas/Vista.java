package pruebas;

import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
    private JButton boton;
    private JLabel etiqueta;

    public Vista() {
        setTitle("MVC Ejemplo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        etiqueta = new JLabel("Mensaje:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(etiqueta, gbc);

        textField = new JTextField(15);
        gbc.gridx = 1;
        panel.add(textField, gbc);

        boton = new JButton("Mostrar");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(boton, gbc);

        add(panel);
    }

    public JTextField getTextField() {
        return textField;
    }

    public JButton getBoton() {
        return boton;
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }
}
