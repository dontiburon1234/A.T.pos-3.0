package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ModFactura;
import vista.IntFactura;

public class ConFactura  implements ActionListener {
	
	private IntFactura intFactura;
	private ModFactura modFactura;
	
	public ConFactura(IntFactura intFactura, ModFactura modFactura) {
		super();
		this.intFactura = intFactura;
		this.modFactura = modFactura;
		
		this.intFactura.getBtnAutorizo().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==intFactura.getBtnAutorizo() ) {
			System.out.println("ConFactura.actionPerformed()************************** Autorizo");
			
		}
	}

	
	/**
	 * @return the intFactura
	 */
	public IntFactura getIntFactura() {
		return intFactura;
	}
	/**
	 * @param intFactura the intFactura to set
	 */
	public void setIntFactura(IntFactura intFactura) {
		this.intFactura = intFactura;
	}
	/**
	 * @return the modFactura
	 */
	public ModFactura getModFactura() {
		return modFactura;
	}
	/**
	 * @param modFactura the modFactura to set
	 */
	public void setModFactura(ModFactura modFactura) {
		this.modFactura = modFactura;
	}

}
