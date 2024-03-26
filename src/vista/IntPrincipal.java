package vista;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import controlador.ConPrincipal;

public class IntPrincipal extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final int tLetra = 16;
	private ConPrincipal conPrincipal;
	
	private JButton btnFactura;
	private JButton btnPagos;
	private JButton btnReporte;
	private JButton btnClave;
	private JButton btnConfiguracion;
	private JButton btnDevolucion;
	private JButton btnRetiro;
	private JButton btnSalida;

	public IntPrincipal() {
		setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.weightx = 1.0;
		gbc.weighty = 0.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(0, 0, 5, 0);

		btnFactura = new JButton("Factura");
		btnFactura.setFont(new Font("Tahoma", Font.PLAIN, tLetra));
		btnFactura.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(null, 1),
	               BorderFactory.createEmptyBorder(5, 5, 10, 20)));
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(btnFactura, gbc);
		
		btnPagos = new JButton("Pagos");
		btnPagos.setFont(new Font("Tahoma", Font.PLAIN, tLetra));
		btnPagos.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(null, 1),
	               BorderFactory.createEmptyBorder(5, 5, 10, 20)));
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(btnPagos, gbc);
		
		btnReporte = new JButton("Reporte");
		btnReporte.setFont(new Font("Tahoma", Font.PLAIN, tLetra));
		btnReporte.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(null, 1),
	               BorderFactory.createEmptyBorder(5, 5, 10, 20)));
		gbc.gridx = 2;
		gbc.gridy = 0;
		add(btnReporte, gbc);
		
		btnClave = new JButton("Clave");
		btnClave.setFont(new Font("Tahoma", Font.PLAIN, tLetra));
		btnClave.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(null, 1),
	               BorderFactory.createEmptyBorder(5, 5, 10, 20)));
		gbc.gridx = 3;
		gbc.gridy = 0;
		add(btnClave, gbc);
		
		btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.setFont(new Font("Tahoma", Font.PLAIN, tLetra));
		btnConfiguracion.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(null, 1),
	               BorderFactory.createEmptyBorder(5, 5, 10, 20)));
		gbc.gridx = 4;
		gbc.gridy = 0;
		add(btnConfiguracion, gbc);
		
		btnDevolucion = new JButton("Devolución");
		btnDevolucion.setFont(new Font("Tahoma", Font.PLAIN, tLetra));
		btnDevolucion.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(null, 1),
	               BorderFactory.createEmptyBorder(5, 5, 10, 20)));
		gbc.gridx = 5;
		gbc.gridy = 0;
		add(btnDevolucion, gbc);
		
		btnRetiro = new JButton("Retiro");
		btnRetiro.setFont(new Font("Tahoma", Font.PLAIN, tLetra));
		btnRetiro.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(null, 1),
	               BorderFactory.createEmptyBorder(5, 5, 10, 20)));
		gbc.gridx = 6;
		gbc.gridy = 0;
		add(btnRetiro, gbc);
		
		btnSalida = new JButton("Salida");
		btnSalida.setFont(new Font("Tahoma", Font.PLAIN, tLetra));
		btnSalida.setBorder(BorderFactory.createCompoundBorder(
	               BorderFactory.createLineBorder(null, 1),
	               BorderFactory.createEmptyBorder(5, 5, 10, 20)));
		gbc.gridx = 7;
		gbc.gridy = 0;
		add(btnSalida, gbc);
		
	}
	
	public ConPrincipal getConPrincipal() {
		return conPrincipal;
	}

	public void setConPrincipal(ConPrincipal conPrincipal) {
		this.conPrincipal = conPrincipal;
	}

	public JButton getBtnFactura() {
		return btnFactura;
	}

	public void setBtnFactura(JButton btnFactura) {
		this.btnFactura = btnFactura;
	}

	public JButton getBtnPagos() {
		return btnPagos;
	}

	public void setBtnPagos(JButton btnPagos) {
		this.btnPagos = btnPagos;
	}

	public JButton getBtnReporte() {
		return btnReporte;
	}

	public void setBtnReporte(JButton btnReporte) {
		this.btnReporte = btnReporte;
	}

	public JButton getBtnClave() {
		return btnClave;
	}

	public void setBtnClave(JButton btnClave) {
		this.btnClave = btnClave;
	}

	public JButton getBtnConfiguracion() {
		return btnConfiguracion;
	}

	public void setBtnConfiguracion(JButton btnConfiguracion) {
		this.btnConfiguracion = btnConfiguracion;
	}

	public JButton getBtnDevolucion() {
		return btnDevolucion;
	}

	public void setBtnDevolucion(JButton btnDevolucion) {
		this.btnDevolucion = btnDevolucion;
	}

	public JButton getBtnRetiro() {
		return btnRetiro;
	}

	public void setBtnRetiro(JButton btnRetiro) {
		this.btnRetiro = btnRetiro;
	}

	public JButton getBtnSalida() {
		return btnSalida;
	}

	public void setBtnSalida(JButton btnSalida) {
		this.btnSalida = btnSalida;
	}
	
}
