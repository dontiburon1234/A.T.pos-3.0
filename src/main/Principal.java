package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

import controlador.ConPrincipal;
import modelo.ModPrincipal;
import vista.IntPrincipal;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Create the frame.
	 * TODO definir diferentes tamaños y resoluciones de pantalla
	 * setBounds(0, 0, 1366, 768);
	 * pantalla distribell setBounds(0, 0, 1366, 768);
	 * pantalla carlos setBounds(1366, 0, 1024, 768);
	 * pantalla televisor SONY setBounds(1366, 0, 1280, 720);
	 * pantalla Android Lenovo Pantalla: 7.0 INCH 1024*600
	 */	
	public Principal(String usuario) {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Obtener el tamaño de la pantalla
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		// Definir el tamaño de la ventana
		int ancho = screenWidth;
		if (screenWidth > 1037) { ancho = 1037; }
		int alto = screenHeight;
		if (screenHeight > 600) { alto = 600; }
		// Definir la ubicación de la ventana
		int posX = screenWidth;
		if (screenWidth > 1037) {posX = (screenWidth-1037)/2; }
		int posY = screenHeight;
		if (screenHeight > 600) {posY = (screenHeight-600)/2; }

		setBounds(posX, posY, ancho, alto);
		
//		setBounds(1366, 0, 500, 500);
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		ImageIcon icono = new ImageIcon(getClass().getResource("/resources/Logo-ATpos-200px.png"));
        setIconImage(icono.getImage());
		setTitle("Principal - A.T.pos - Administraci\u00F3n Total del punto de venta");
		
		// Declaramos las clases
		ModPrincipal modPrincipal;
		IntPrincipal intPrincipal;
		ConPrincipal conPrincipal;

		// Instanciamos las clases (crear los objetos de las clases)
		modPrincipal = new ModPrincipal();
		intPrincipal = new IntPrincipal();
		conPrincipal = new ConPrincipal(intPrincipal,modPrincipal,this);

		// Establecemos las relaciones entre clases
		modPrincipal.setConPrincipal(conPrincipal);
		intPrincipal.setConPrincipal(conPrincipal);

		// Enviarle una instancia de cada clases al coordinador
		conPrincipal.setModPrincipal(modPrincipal);
		conPrincipal.setIntPrincipal(intPrincipal);
				
//		getContentPane().setLayout(new BorderLayout(0, 0));
//		getContentPane().add(intPrincipal, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(intPrincipal);
		setJMenuBar(menuBar);

		// Crear etiqueta para mostrar las dimensiones
        JLabel labelDimensiones = new JLabel();
        labelDimensiones.setText("Dimensiones: ");
        this.add(labelDimensiones, BorderLayout.SOUTH);
        this.addComponentListener(new ComponentAdapter() {
        	@Override
        	public void componentResized(ComponentEvent e) {
        		labelDimensiones.setText("Dimensiones: " + e.getComponent().getWidth() + "x" + e.getComponent().getHeight());
    		}
        });
	}
	
//    private void solicitarAutorizacion() {
//        Login login = new Login();
//        
//        boolean tipoUsuario = true; // modLogin.administradorAutorizado(null, login, null, "autorizado");
//        
//        if(tipoUsuario) {
//        	System.out.println("Principal.solicitarAutorizacion() ->"+tipoUsuario);
//        }else {
//        	System.out.println("Principal.solicitarAutorizacion() ->"+tipoUsuario);
//        	JOptionPane.showMessageDialog(null, "Usuario y/o password erroneos.");
//        }
//        login.setVisible(true);
//        setVisible(false); // Ocultar la ventana actual durante el proceso de autorización
//    }
}
