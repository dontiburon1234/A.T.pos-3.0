package vista;

import java.awt.Font;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
//import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import controlador.ConFactura;

public class IntFactura extends JPanel {

	private static final long serialVersionUID = 1L;
	private ConFactura conFactura;
	private JButton btnAutorizo;

	/**
	 * Create the panel.
	 */
	public IntFactura() {
		
		btnAutorizo = new JButton("Factura");
		btnAutorizo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAutorizo.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(null, 1),
	               BorderFactory.createEmptyBorder(5, 5, 10, 20)));
		add(btnAutorizo);
	}

	/**
	 * @return the btnAutorizo
	 */
	public JButton getBtnAutorizo() {
		return btnAutorizo;
	}

	/**
	 * @param btnAutorizo the btnAutorizo to set
	 */
	public void setBtnAutorizo(JButton btnAutorizo) {
		this.btnAutorizo = btnAutorizo;
	}

	/**
	 * @return the conFactura
	 */
	public ConFactura getConFactura() {
		return conFactura;
	}

	/**
	 * @param conFactura the conFactura to set
	 */
	public void setConFactura(ConFactura conFactura) {
		this.conFactura = conFactura;
	}

}
