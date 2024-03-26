package cliente;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import util.IntKeyLetras;
import util.IntKeyNumeros;

public class Cliente extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Cliente() {
		Toolkit tamano = Toolkit.getDefaultToolkit();
		int ancho = (int) ((tamano.getScreenSize().getWidth() - 718) / 2);
		int alto = (int) ((tamano.getScreenSize().getHeight() - 570) / 2);
		
        ImageIcon icono = new ImageIcon(getClass().getResource("/resources/Logo-ATpos-200px.png"));
        setIconImage(icono.getImage());
		setTitle("Clientes - A.T.pos");
		setBounds(ancho, alto, 718, 570);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Declaramos las clases y las instanciamos		
		IntKeyLetras intKeyLetras = new IntKeyLetras();
		IntKeyNumeros intKeyNumeros = new IntKeyNumeros();
		IntCliente intCliente = new IntCliente();
		ModCliente modCliente = new ModCliente();
		ConCliente conCliente = new ConCliente(intKeyLetras, intKeyNumeros, intCliente, modCliente);
		
		conCliente.setIntKeyLetras(intKeyLetras);
		conCliente.setIntKeyNumeros(intKeyNumeros);
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(intCliente, BorderLayout.CENTER);
		getContentPane().add(intKeyNumeros, BorderLayout.LINE_END);
		getContentPane().add(intKeyLetras, BorderLayout.PAGE_END);
		
//		setVisible(true);
	}

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setVisible(true);
	}

}
