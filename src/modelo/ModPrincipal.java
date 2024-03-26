package modelo;

import controlador.ConFactura;
import controlador.ConPrincipal;
import main.Principal;
import vista.IntFactura;

public class ModPrincipal {
	
	private ConPrincipal conPrincipal;

	public ModPrincipal() {
		super();
	}

	public void factura(Principal principal) {
		// Declaramos las clases
		IntFactura intFactura;
		ModFactura modFactura;
		ConFactura conFactura;
		
		// Instanciamos las clases
		intFactura = new IntFactura();
		modFactura = new ModFactura();
		conFactura = new ConFactura(intFactura, modFactura);
		
		// Establecemos las relaciones entre clases
		intFactura.setConFactura(conFactura);
		modFactura.setConFactura(conFactura);
		
		// Enviarle una instancia de cada clases al coordinador
		conFactura.setIntFactura(intFactura);
		conFactura.setModFactura(modFactura);
		
		principal.setContentPane(intFactura);
		principal.setVisible(true);
	}
	
	/**
	 * @return the conPrincipal
	 */
	public ConPrincipal getConPrincipal() {
		return conPrincipal;
	}

	/**
	 * @param conPrincipal the conPrincipal to set
	 */
	public void setConPrincipal(ConPrincipal conPrincipal) {
		this.conPrincipal = conPrincipal;
	}

}
