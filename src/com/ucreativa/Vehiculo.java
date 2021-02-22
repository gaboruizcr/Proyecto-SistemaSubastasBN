/**
 * 
 */
package com.ucreativa;

/**
 * 
 *
 */
public class Vehiculo implements Bien{
	private int año;
	private double precio;
	private String estado;
			
	/**
	 * @return the año
	 */
	public int getAño() {
		return año;
	}

	/**
	 * @param año the año to set
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * constructor
	 * @param id
	 * @param año
	 * @param precio
	 * @param estado
	 */
	public Vehiculo(String id, int año, double precio, String estado) {
		super();
		this.año = año;
		this.precio = precio;
		this.estado = estado;
	}

}
