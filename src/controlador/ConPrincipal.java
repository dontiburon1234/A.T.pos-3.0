package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import login.Login;
import main.Principal;
import modelo.ModPrincipal;
import vista.IntPrincipal;

public class ConPrincipal implements ActionListener,FocusListener,KeyListener {
	
	private IntPrincipal intPrincipal;
	private ModPrincipal modPrincipal;
	private Principal principal;
	

	public ConPrincipal(IntPrincipal intPrincipal, ModPrincipal modPrincipal, Principal principal) {
		super();
		this.intPrincipal = intPrincipal;
		this.modPrincipal = modPrincipal;
		this.principal = principal;

		this.intPrincipal.getBtnFactura().addActionListener(this);
		this.intPrincipal.getBtnPagos().addActionListener(this);
		this.intPrincipal.getBtnReporte().addActionListener(this);
		this.intPrincipal.getBtnClave().addActionListener(this);
		this.intPrincipal.getBtnConfiguracion().addActionListener(this);
		this.intPrincipal.getBtnDevolucion().addActionListener(this);
		this.intPrincipal.getBtnRetiro().addActionListener(this);
		this.intPrincipal.getBtnSalida().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==intPrincipal.getBtnFactura()){
			System.out.println("ConPrincipal.actionPerformed()-------------------------- Factura");
			modPrincipal.factura(principal);
						
		} else if(e.getSource()==intPrincipal.getBtnPagos()) {
			System.out.println("ConPrincipal.actionPerformed()-------------------------- Pagos");
		} else if(e.getSource()==intPrincipal.getBtnReporte()) {
			System.out.println("ConPrincipal.actionPerformed()-------------------------- Reporte");
		} else if(e.getSource()==intPrincipal.getBtnClave()) {
			System.out.println("ConPrincipal.actionPerformed()-------------------------- Clave");
		} else if(e.getSource()==intPrincipal.getBtnConfiguracion()) {
			System.out.println("ConPrincipal.actionPerformed()-------------------------- Configuración");
			Login login = new Login("inicio");
			login.setVisible(true);
			
		} else if(e.getSource()==intPrincipal.getBtnDevolucion()) {
			System.out.println("ConPrincipal.actionPerformed()-------------------------- Devolución");
		} else if(e.getSource()==intPrincipal.getBtnRetiro()) {
			System.out.println("ConPrincipal.actionPerformed()-------------------------- Retiro");
		} else if(e.getSource()==intPrincipal.getBtnSalida()) {
			System.out.println("ConPrincipal.actionPerformed()-------------------------- Salida");
			System.exit(0);
		}
		
	}

	/**
	 * @return the intPrincipal
	 */
	public IntPrincipal getIntPrincipal() {
		return intPrincipal;
	}

	/**
	 * @param intPrincipal the intPrincipal to set
	 */
	public void setIntPrincipal(IntPrincipal intPrincipal) {
		this.intPrincipal = intPrincipal;
	}

	/**
	 * @return the modPrincipal
	 */
	public ModPrincipal getModPrincipal() {
		return modPrincipal;
	}

	/**
	 * @param modPrincipal the modPrincipal to set
	 */
	public void setModPrincipal(ModPrincipal modPrincipal) {
		this.modPrincipal = modPrincipal;
	}

	/**
	 * @return the principal
	 */
	public Principal getPrincipal() {
		return principal;
	}

	/**
	 * @param principal the principal to set
	 */
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
}
