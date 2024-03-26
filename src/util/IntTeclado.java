package util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntTeclado extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final int pady = 5; //Specifies the internal padding: how much to add to the size of the component.
	private static final int padx = 10;
	private Color colorLetras = Color.decode("#FFCB00");
	private Color colorNumeros = new Color(94,194,67); //Color.decode("#FFA200");
	private Color colorBorrar = new Color(255,0,0);
	private JTextField textField;
    private boolean shiftActivo = false;
    private String[] letras = {"!\"#$%&/()=?¡¿+","qwertyuiop789-", "asdfghjklñ456*", "zxcvbnm,._123/"};

    public IntTeclado() {
//        setTitle("Teclado Virtual");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1050, 300);
//        setLocationRelativeTo(null);

        textField = new JTextField(30);
        textField.setEditable(false); // El campo de texto es solo para visualización
        textField.setFont(new Font("Tahoma", Font.BOLD, 20));

        JPanel panelTeclado = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1.0;
		gbc.weighty = 0.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(1, 1, 1, 1);
        gbc.ipadx = padx;
		gbc.ipady = pady;
        gbc.gridx = 0;
        gbc.gridy = 0;
        for (String fila : letras) {
            for (char c : fila.toCharArray()) {
                JButton boton = crearBoton(Character.toString(c));
                panelTeclado.add(boton, gbc);
                gbc.gridx++;
            }
            gbc.gridy++;
            gbc.gridx = 0;
        }

        // Barra espaciadora
        JButton barraEspaciadora = new JButton("Espacio");
        barraEspaciadora.setFont(new Font("Tahoma", Font.BOLD, 20));
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 9;
        panelTeclado.add(barraEspaciadora, gbc);
        
        // Botón @
        JButton botonArroba = new JButton("@");
        botonArroba.setFont(new Font("Tahoma", Font.BOLD, 20));
        gbc.gridx = 11;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panelTeclado.add(botonArroba, gbc);
        
        // Botón Shift
        JButton botonShift = new JButton("Shift");
        botonShift.setFont(new Font("Tahoma", Font.BOLD, 20));
		gbc.gridx = 0; // j
		gbc.gridy = 4; // i
        gbc.gridwidth = 2;
		gbc.gridheight = 1;
        panelTeclado.add(botonShift, gbc);

        // Botón borrar
        JButton botonBorrar = new JButton("Borrar");
        botonBorrar.setBackground(colorBorrar);
        botonBorrar.setFont(new Font("Tahoma", Font.BOLD, 20));
        gbc.gridx = 13; // j
		gbc.gridy = 4; // i
        gbc.gridwidth = 2;
		gbc.gridheight = 1;
        panelTeclado.add(botonBorrar, gbc);

        // Botón aceptar
        JButton botonAceptar = new JButton("Aceptar");
        botonAceptar.setFont(new Font("Tahoma", Font.BOLD, 20));
		gbc.gridx = 14; // j
		gbc.gridy = 0; // i
		gbc.gridwidth = 1;
		gbc.gridheight = 4;
		gbc.fill = GridBagConstraints.BOTH;
        panelTeclado.add(botonAceptar, gbc);

        setLayout(new BorderLayout());
        add(textField, BorderLayout.NORTH);
        add(panelTeclado, BorderLayout.CENTER);

        // ActionListener para el botón barraEspaciadora
        barraEspaciadora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	    textField.setText(textField.getText()+" ");
            }
        });
        
        // ActionListener para el botón Shift
        botonShift.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shiftActivo = !shiftActivo;
                actualizarBotonesShift();
            }
        });
        
     // ActionListener para el botón Borrar
        botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if (textField.getText().length() > 0) {
            	    String nuevoTexto = textField.getText().substring(0, textField.getText().length() - 1);
            	    textField.setText(nuevoTexto);
            	}
            }
        });

     // ActionListener para el botón botonArroba
        botonArroba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	textField.setText(textField.getText()+"@");
            }
        });
        
        botonAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	accionAceptar();
            }
        });
    }

    private JButton crearBoton(String texto) {
    	String[] numeros = {"1234567890"}; // +-*/
        JButton boton = new JButton(texto);
		boton.setFont(new Font("Tahoma", Font.BOLD, 20));

		for (String numero : numeros) {
            if (numero.contains(texto)) {
            	boton.setBackground(colorNumeros);
			} else {
				boton.setBackground(colorLetras);
			}
		}
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	textField.setText(textField.getText()+boton.getText());
            }
        });
        return boton;
    }

    private void actualizarBotonesShift() {
        Component[] componentes = getComponents();
        for (Component componente : componentes) {
            if (componente instanceof JPanel) {
                Component[] botones = ((JPanel) componente).getComponents();
                int control = 0;
                for (Component boton : botones) {
                    if (boton instanceof JButton && !((JButton) boton).getText().equals("Shift")) {
                        JButton btn = (JButton) boton;
                        if(btn.getText()!="Aceptar" && btn.getText()!="Borrar" && btn.getText()!="Espacio") {
                        	String caracter = btn.getText();
	                        if (shiftActivo) {
	                        	if (Character.isLowerCase(caracter.charAt(0))) {
	                        		btn.setText(btn.getText().toUpperCase());
	                        	} else {
	                        		if(caracter.equals("!")) {btn.setText("<");}
	                        		if(caracter.equals("\"")) {btn.setText("~");}
	                        		if(caracter.equals("#")) {btn.setText("'");}
	                        		if(caracter.equals("$")) {btn.setText(">");}
	                        		if(caracter.equals("%")) {btn.setText("|");}
	                        		if(caracter.equals("&")) {btn.setText("{");}
	                        		if(caracter.equals("/")) {
	                        			if(control==0) {
		                        			btn.setText("}");	                        				
	                        			}
	                        			control++;
	                        		}
	                        		if(caracter.equals("(")) {btn.setText("\\");}
	                        		if(caracter.equals(")")) {btn.setText("°");}
	                        		if(caracter.equals("=")) {btn.setText("[");}
	                        		if(caracter.equals("?")) {btn.setText("]");}
	                        		if(caracter.equals("¡")) {btn.setText("¬");}
	                        		if(caracter.equals("¿")) {btn.setText("¨");}
	                        		
	                        		if(caracter.equals(".")) {btn.setText(":");}
	                        		if(caracter.equals(",")) {btn.setText(";");}
	                        	}
	                        } else {
	                        	if (Character.isUpperCase(caracter.charAt(0))) {
	                        		btn.setText(btn.getText().toLowerCase());
	                        	} else {
	                        		if(caracter.equals("<")) {btn.setText("!");}
	                        		if(caracter.equals("~")) {btn.setText("\"");}
	                        		if(caracter.equals("'")) {btn.setText("#");}
	                        		if(caracter.equals(">")) {btn.setText("$");}
	                        		if(caracter.equals("|")) {btn.setText("%");}
	                        		if(caracter.equals("{")) {btn.setText("&");}
	                        		if(caracter.equals("}")) {btn.setText("/");}
	                        		if(caracter.equals("\\")) {btn.setText("(");}
	                        		if(caracter.equals("°")) {btn.setText(")");}
	                        		if(caracter.equals("[")) {btn.setText("=");}
	                        		if(caracter.equals("]")) {btn.setText("?");}
	                        		if(caracter.equals("¬")) {btn.setText("¡");}
	                        		if(caracter.equals("¨")) {btn.setText("¿");}
	                        		
	                        		if(caracter.equals(":")) {btn.setText(".");}
	                        		if(caracter.equals(";")) {btn.setText(",");}
	                        	}
	                        }
                        }
                    }
                }
            }
        }
    }

    private void accionAceptar() {
        // Lacción que se realizará al presionar el botón "Aceptar"
    	System.out.println("IntTeclado.accionAceptar()" + textField.getText());
    }
    
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            IntTeclado tecladoVirtual = new IntTeclado();
//            tecladoVirtual.setVisible(true);
//        });
//    }
}
