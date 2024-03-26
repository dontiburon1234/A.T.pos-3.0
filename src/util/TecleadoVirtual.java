package util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TecleadoVirtual extends JPanel {

    private JTextField textField;
    private JPanel panelTeclado;
    private boolean shiftActivado = false;

    private static final String[] espNumes = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    private static final String[] espMayus = {"<", "~", "'", ">", "|", "{", "}", "=", "~", "[", "]", "&", "_", "+"};
    private static final String[] espEspeciales = {"<", "~", "'", ">", "|", "{", "}", "=", "~", "[", "]", "&", "_", "+"};
    private static final String[] espEspeciales2 = {"!", "\"", "#", "$", "%", "&", "/", "(", ")", "=", "?", "¡", "¿","+"};

    public TecleadoVirtual() {
        setLayout(new BorderLayout());

        textField = new JTextField(30);
        textField.setEditable(true);

        panelTeclado = new JPanel(new GridLayout(4, 10, 5, 5));

        // Inicializar el teclado virtual
        inicializarTeclado();

        // Añadir el textField y el panelTeclado al JPanel principal
        add(textField, BorderLayout.NORTH);
        add(panelTeclado, BorderLayout.CENTER);
    }

    private void inicializarTeclado() {
        // Letras y números
        for (char c = 'A'; c <= 'Z'; c++) {
            JButton boton = crearBoton(Character.toString(c));
            panelTeclado.add(boton);
        }

        // Números
        for (int i = 0; i < espNumes.length; i++) {
            JButton boton = crearBoton(espNumes[i]);
            panelTeclado.add(boton);
        }

        // Caracteres especiales
        for (int i = 0; i < espEspeciales.length; i++) {
            JButton boton = crearBoton(espEspeciales[i]);
            panelTeclado.add(boton);
        }

        // Barra espaciadora
        JButton barraEspaciadora = new JButton("Espacio");
        barraEspaciadora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + " ");
            }
        });
        panelTeclado.add(barraEspaciadora);

        // Botón Shift
        JButton botonShift = new JButton("Shift");
        botonShift.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shiftActivado = !shiftActivado;
                actualizarBotonesShift();
            }
        });
        panelTeclado.add(botonShift);

        // Botón Aceptar
        JButton botonAceptar = new JButton("Aceptar");
        botonAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción al presionar Aceptar
                System.out.println("Texto del textField: " + textField.getText());
            }
        });
        panelTeclado.add(botonAceptar);
    }

    private JButton crearBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + texto);
            }
        });
        return boton;
    }

    private void actualizarBotonesShift() {
        for (Component componente : panelTeclado.getComponents()) {
            if (componente instanceof JButton) {
                JButton boton = (JButton) componente;
                String texto = boton.getText();

                if (isCaracterEspecial(texto)) {
                    if (shiftActivado) {
                        boton.setText(obtenerCaracterShift(texto));
                    } else {
                        boton.setText(texto.toLowerCase());
                    }
                }
            }
        }
    }

    private boolean isCaracterEspecial(String caracter) {
        for (String esp : espEspeciales) {
//        	System.out.println("TecleadoVirtual.isCaracterEspecial() caracter-> "+caracter);
            if (esp.equals(caracter)) {
                return true;
            }
        }
        return false;
    }

    private String obtenerCaracterShift(String caracter) {
    	 for (char c = 'A'; c <= 'z'; c++) {
    		 System.out.println("TecleadoVirtual.obtenerCaracterShift() c-> "+c+" caracter-> "+caracter+" String.valueOf(c)-> "+String.valueOf(c));
    		 if(String.valueOf(c)==caracter) {
    			 return caracter.toUpperCase();
    		 }else {
//    			 System.out.println("TecleadoVirtual.obtenerCaracterShift()");
    		 }
    	 }
    	
    	
//        for (int i = 0; i < espEspeciales.length; i++) {
//            if (espEspeciales[i].equals(caracter)) {
//                return espEspeciales2[i];
//            }else {
//            	return caracter.toUpperCase();
//            }
//        }
        return "XX";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tecleado Virtual");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panelPrincipal = new JPanel();
            panelPrincipal.setLayout(new BorderLayout());

            // Añadir el TecleadoVirtual al panel principal
            TecleadoVirtual tecladoVirtual = new TecleadoVirtual();
            panelPrincipal.add(tecladoVirtual, BorderLayout.CENTER);

            frame.getContentPane().add(panelPrincipal);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
