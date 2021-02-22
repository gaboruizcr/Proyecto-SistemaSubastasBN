/**
 * 
 */
package com.ucreativa;

/**
 * 
 *
 */
public class Vehiculo implements Bien{
	private int a�o;
	private double precio;
	private String estado;
			
	/**
	 * @return the a�o
	 */
	public int getA�o() {
		return a�o;
	}

	/**
	 * @param a�o the a�o to set
	 */
	public void setA�o(int a�o) {
		this.a�o = a�o;
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
	 * @param a�o
	 * @param precio
	 * @param estado
	 */
	public Vehiculo(String id, int a�o, double precio, String estado) {
		super();
		this.a�o = a�o;
		this.precio = precio;
		this.estado = estado;
	}

}
