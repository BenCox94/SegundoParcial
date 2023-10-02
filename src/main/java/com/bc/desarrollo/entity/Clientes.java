package com.bc.desarrollo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClientes")
    private Long idClientes;

    @Column(name = "primerNombre")
    private String primerNombre;
    
    @Column(name = "segundoNombre")
    private String segundoNombre;
    
    @Column(name = "otroNombre")
    private String otroNombre;

    @Column(name = "primerApellido")
    private String primerApellido;
    
    @Column(name = "segundoApellido")
    private String segundoApellido;
    
    @Column(name = "otroApellido")
    private String otroApellido;

    @Column(name = "genero")
    private String genero;

    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;

    @Column(name = "segmento")
    private String segmento;
    
    @Column(name = "sueldo")
    private Double sueldo;
    
    @Column(name = "dpi")
    private String dpi;
    
    public Long getIdClientes() {
		return idClientes;
	}

	public void setIdClientes(Long idClientes) {
		this.idClientes = idClientes;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getOtroNombre() {
		return otroNombre;
	}

	public void setOtroNombre(String otroNombre) {
		this.otroNombre = otroNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getOtroApellido() {
		return otroApellido;
	}

	public void setOtroApellido(String otroApellido) {
		this.otroApellido = otroApellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public String getDpi() {
		return dpi;
	}

	public void setDpi(String dpi) {
		this.dpi = dpi;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Column(name = "correo")
    private String correo;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "fechaCreacion")
    private Date fechaCreacion;
}
