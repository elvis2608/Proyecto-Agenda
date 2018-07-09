package com.agenda.spring.model;

import java.io.Serializable;
import java.util.List;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.*;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
*
* @author Elvis-Gamero and Ruben
*/
@Entity
@Table(name = "personas", catalog = "agenda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p")
    , @NamedQuery(name = "Personas.findByIdpersonas", query = "SELECT p FROM Personas p WHERE p.idpersonas = :idpersonas")
    , @NamedQuery(name = "Personas.findByNombre", query = "SELECT p FROM Personas p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Personas.findByApellido1", query = "SELECT p FROM Personas p WHERE p.apellido1 = :apellido1")
    , @NamedQuery(name = "Personas.findByApellido2", query = "SELECT p FROM Personas p WHERE p.apellido2 = :apellido2")
    , @NamedQuery(name = "Personas.findByDni", query = "SELECT p FROM Personas p WHERE p.dni = :dni")
    , @NamedQuery(name = "Personas.findByFechaNacimiento", query = "SELECT p FROM Personas p WHERE p.fechaNacimiento = :fechaNacimiento")})
public class Personas implements Serializable {
	
	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpersonas")
    private Integer idpersonas;
    
	@Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    
	@Basic(optional = false)
    @Column(name = "apellido1")
    private String apellido1;
    
	@Column(name = "apellido2")
    private String apellido2;
    
	@Column(name = "dni")
    private String dni;
    
	@Column(name = "fechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    
	@OneToMany(mappedBy = "idPersona")
    private List<Direcciones> direccionesList;
    
	@OneToMany(mappedBy = "idPersona")
    private List<Telefonos> telefonosList;
    
	@JoinColumn(name = "idEmpleado", referencedColumnName = "idempleados")
    @ManyToOne
    private Empleados idEmpleado;

	public Personas() {
    }

    public Personas(Integer idpersonas) {
        this.idpersonas = idpersonas;
    }

    public Personas(Integer idpersonas, String nombre, String apellido1) {
        this.idpersonas = idpersonas;
        this.nombre = nombre;
        this.apellido1 = apellido1;
    }

    public Integer getIdpersonas() {
        return idpersonas;
    }

    public void setIdpersonas(Integer idpersonas) {
        this.idpersonas = idpersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Direcciones> getDireccionesList() {
        return direccionesList;
    }

    public void setDireccionesList(List<Direcciones> direccionesList) {
        this.direccionesList = direccionesList;
    }

    public List<Telefonos> getTelefonosList() {
        return telefonosList;
    }

    public void setTelefonosList(List<Telefonos> telefonosList) {
        this.telefonosList = telefonosList;
    }

    public Empleados getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleados idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersonas != null ? idpersonas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
    	// Para comprobar que los cast se hacen correctamente.
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.idpersonas == null && other.idpersonas != null) || (this.idpersonas != null && !this.idpersonas.equals(other.idpersonas))) {
            return false;
        }
        return true;
    }
}
