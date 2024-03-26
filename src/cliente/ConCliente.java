package cliente;

import util.IntKeyLetras;
import util.IntKeyNumeros;

public class ConCliente {
	
	private IntKeyLetras intKeyLetras;
	private IntKeyNumeros intKeyNumeros;
	private IntCliente intCliente;
	private ModCliente modCliente;
		
	public ConCliente(
			IntKeyLetras intKeyLetras, 
			IntKeyNumeros intKeyNumeros, 
			IntCliente intCliente,
			ModCliente modCliente) {
		super();
		this.intKeyLetras = intKeyLetras;
		this.intKeyNumeros = intKeyNumeros;
		this.intCliente = intCliente;
		this.modCliente = modCliente;
	}
	
	/**
	 * @return the intKeyLetras
	 */
	public IntKeyLetras getIntKeyLetras() {
		return intKeyLetras;
	}


	/**
	 * @param intKeyLetras the intKeyLetras to set
	 */
	public void setIntKeyLetras(IntKeyLetras intKeyLetras) {
		this.intKeyLetras = intKeyLetras;
	}


	/**
	 * @return the intKeyNumeros
	 */
	public IntKeyNumeros getIntKeyNumeros() {
		return intKeyNumeros;
	}


	/**
	 * @param intKeyNumeros the intKeyNumeros to set
	 */
	public void setIntKeyNumeros(IntKeyNumeros intKeyNumeros) {
		this.intKeyNumeros = intKeyNumeros;
	}


	/**
	 * @return the intCliente
	 */
	public IntCliente getIntCliente() {
		return intCliente;
	}
	/**
	 * @param intCliente the intCliente to set
	 */
	public void setIntCliente(IntCliente intCliente) {
		this.intCliente = intCliente;
	}
	/**
	 * @return the modCliente
	 */
	public ModCliente getModCliente() {
		return modCliente;
	}
	/**
	 * @param modCliente the modCliente to set
	 */
	public void setModCliente(ModCliente modCliente) {
		this.modCliente = modCliente;
	}

}
