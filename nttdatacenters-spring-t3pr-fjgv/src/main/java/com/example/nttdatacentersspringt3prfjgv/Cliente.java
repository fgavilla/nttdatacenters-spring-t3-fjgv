package com.example.nttdatacentersspringt3prfjgv;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spring_customer")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long ID;
	private String nombre, apellido1, apellido2, dni;
	private Date fechaNacimiento;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getID() {
		return ID;
	}
	
	public void setID(Long ID) {
		this.ID = ID;
	}
	
	@Column(name = "NOMBRE", nullable = false)
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "PRIMER APELLIDO", nullable = false)
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	@Column(name = "SEGUNDO APELLIDO", nullable = false)
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	@Column(name = "DNI", nullable = false, unique = true, length = 9)
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Column(name = "FECHA NACIMIENTO", nullable = false)
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Cliente [ID=" + ID + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", dni=" + dni + ", fecha nacimiento=" + fechaNacimiento + "]";
	}
}