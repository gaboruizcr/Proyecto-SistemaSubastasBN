/**
 * 
 */
package com.ucreativa;

/**
 * 
 *
 */
public class Propiedad implements Bien {
	private int codigo;
	private String provincia;
	private String canton;
	private String distrito;
	private double precio;
	private double descuento;
	private String tipoVenta;
	private double tamaño;
	private String estaEnCosta;
	private String reciente;
	private String aceptaOfertas;
	private String destacado;
	private String estado;
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}
	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	/**
	 * @return the canton
	 */
	public String getCanton() {
		return canton;
	}
	/**
	 * @param canton the canton to set
	 */
	public void setCanton(String canton) {
		this.canton = canton;
	}
	/**
	 * @return the distrito
	 */
	public String getDistrito() {
		return distrito;
	}
	/**
	 * @param distrito the distrito to set
	 */
	public void setDistrito(String distrito) {
		this.distrito = distrito;
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
	 * @return the descuento
	 */
	public double getDescuento() {
		return descuento;
	}
	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	/**
	 * @return the tipoVenta
	 */
	public String getTipoVenta() {
		return tipoVenta;
	}
	/**
	 * @param tipoVenta the tipoVenta to set
	 */
	public void setTipoVenta(String tipoVenta) {
		this.tipoVenta = tipoVenta;
	}
	/**
	 * @return the tamaño
	 */
	public double getTamaño() {
		return tamaño;
	}
	/**
	 * @param tamaño the tamaño to set
	 */
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	/**
	 * @return the estaEnCosta
	 */
	public String getEstaEnCosta() {
		return estaEnCosta;
	}
	/**
	 * @param estaEnCosta the estaEnCosta to set
	 */
	public void setEstaEnCosta(String estaEnCosta) {
		this.estaEnCosta = estaEnCosta;
	}
	/**
	 * @return the reciente
	 */
	public String getReciente() {
		return reciente;
	}
	/**
	 * @param reciente the reciente to set
	 */
	public void setReciente(String reciente) {
		this.reciente = reciente;
	}
	/**
	 * @return the aceptaOfertas
	 */
	public String getAceptaOfertas() {
		return aceptaOfertas;
	}
	/**
	 * @param aceptaOfertas the aceptaOfertas to set
	 */
	public void setAceptaOfertas(String aceptaOfertas) {
		this.aceptaOfertas = aceptaOfertas;
	}
	/**
	 * @return the destacado
	 */
	public String getDestacado() {
		return destacado;
	}
	/**
	 * @param destacado the destacado to set
	 */
	public void setDestacado(String destacado) {
		this.destacado = destacado;
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
	 * @param codigo
	 * @param provincia
	 * @param canton
	 * @param distrito
	 * @param precio
	 * @param descuento
	 * @param tipoVenta
	 * @param tamaño
	 * @param estaEnCosta
	 * @param reciente
	 * @param aceptaOfertas
	 * @param destacado
	 * @param estado
	 */
	public Propiedad(String id, int codigo, String provincia, String canton, String distrito, double precio,
			double descuento, String tipoVenta, double tamaño, String estaEnCosta, String reciente,
			String aceptaOfertas, String destacado, String estado) {
		super();
		this.codigo = codigo;
		this.provincia = provincia;
		this.canton = canton;
		this.distrito = distrito;
		this.precio = precio;
		this.descuento = descuento;
		this.tipoVenta = tipoVenta;
		this.tamaño = tamaño;
		this.estaEnCosta = estaEnCosta;
		this.reciente = reciente;
		this.aceptaOfertas = aceptaOfertas;
		this.destacado = destacado;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Propiedad [codigo=" + codigo + ", provincia=" + provincia + ", canton=" + canton + ", distrito="
				+ distrito + ", precio=" + precio + ", descuento=" + descuento + ", tipoVenta=" + tipoVenta
				+ ", tamaño=" + tamaño + ", estaEnCosta=" + estaEnCosta + ", reciente=" + reciente + ", aceptaOfertas="
				+ aceptaOfertas + ", destacado=" + destacado + ", estado=" + estado + "]";
	}
	
	
}
