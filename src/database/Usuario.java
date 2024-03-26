package database;

import java.sql.Date;
import java.sql.Timestamp;

public class Usuario {
	
	private String id; // character varying(30) NOT NULL,
	private String id_tipo_documento; // character varying(10) NOT NULL,
	private double documento; // numeric(20,0) NOT NULL,
	private String nombre; // character varying(100) NOT NULL,
	private String apellido; // character varying(100) NOT NULL,
	private String password; // character varying(100),
	private Date fecha_nacimiento; // date,
	private String direccion; // character varying(200),
	private int id_ciudad; // integer NOT NULL DEFAULT 0,
	private String telefono; // character varying(100),
	private String email; // character varying(200),
	private Date fecha_ingreso; // date,
	private int id_almacen; // integer NOT NULL DEFAULT 0,
	private String estado; // character varying(30),
	private Timestamp dg_fecha_accion; // timestamp without time zone,
	private String dg_accion; // character varying(30),
	
	public Usuario(String id, String id_tipo_documento, double documento, String nombre, String apellido,
			String password, Date fecha_nacimiento, String direccion, int id_ciudad, String telefono, String email,
			Date fecha_ingreso, int id_almacen, String estado, Timestamp dg_fecha_accion, String dg_accion) {
		super();
		this.id = id;
		this.id_tipo_documento = id_tipo_documento;
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion = direccion;
		this.id_ciudad = id_ciudad;
		this.telefono = telefono;
		this.email = email;
		this.fecha_ingreso = fecha_ingreso;
		this.id_almacen = id_almacen;
		this.estado = estado;
		this.dg_fecha_accion = dg_fecha_accion;
		this.dg_accion = dg_accion;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the id_tipo_documento
	 */
	public String getId_tipo_documento() {
		return id_tipo_documento;
	}
	/**
	 * @param id_tipo_documento the id_tipo_documento to set
	 */
	public void setId_tipo_documento(String id_tipo_documento) {
		this.id_tipo_documento = id_tipo_documento;
	}
	/**
	 * @return the documento
	 */
	public double getDocumento() {
		return documento;
	}
	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(double documento) {
		this.documento = documento;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the fecha_nacimiento
	 */
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	/**
	 * @param fecha_nacimiento the fecha_nacimiento to set
	 */
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the id_ciudad
	 */
	public int getId_ciudad() {
		return id_ciudad;
	}
	/**
	 * @param id_ciudad the id_ciudad to set
	 */
	public void setId_ciudad(int id_ciudad) {
		this.id_ciudad = id_ciudad;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the fecha_ingreso
	 */
	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}
	/**
	 * @param fecha_ingreso the fecha_ingreso to set
	 */
	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	/**
	 * @return the id_almacen
	 */
	public int getId_almacen() {
		return id_almacen;
	}
	/**
	 * @param id_almacen the id_almacen to set
	 */
	public void setId_almacen(int id_almacen) {
		this.id_almacen = id_almacen;
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
	 * @return the dg_fecha_accion
	 */
	public Timestamp getDg_fecha_accion() {
		return dg_fecha_accion;
	}
	/**
	 * @param dg_fecha_accion the dg_fecha_accion to set
	 */
	public void setDg_fecha_accion(Timestamp dg_fecha_accion) {
		this.dg_fecha_accion = dg_fecha_accion;
	}
	/**
	 * @return the dg_accion
	 */
	public String getDg_accion() {
		return dg_accion;
	}
	/**
	 * @param dg_accion the dg_accion to set
	 */
	public void setDg_accion(String dg_accion) {
		this.dg_accion = dg_accion;
	}

}
