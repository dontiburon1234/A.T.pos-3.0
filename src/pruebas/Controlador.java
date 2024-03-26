package pruebas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.getBoton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = vista.getTextField().getText();
                
                // Validar el mensaje contra palabras prohibidas
                if (esMensajeValido(mensaje)) {
                    modelo.setMensaje(mensaje);
                    vista.getEtiqueta().setText("Mensaje: " + modelo.getMensaje());
                } else {
                    JOptionPane.showMessageDialog(vista, "El mensaje contiene palabras prohibidas. Por favor, cambie su mensaje.");
                }
            }
        });
    }

    private boolean esMensajeValido(String mensaje) {
        for (String palabra : modelo.getPalabrasProhibidas()) {
            if (mensaje.toLowerCase().contains(palabra.toLowerCase())) {
                return false;
            }
        }
        return true;
    }

    public void iniciar() {
        vista.setVisible(true);
    }
}
