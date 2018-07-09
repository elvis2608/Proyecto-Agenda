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
* @author Elvis-Gamero and Ruben fndnfndffnfnfdfffffdf
*/
@Entity
@Table(name = "empleados", catalog = "agenda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e")
    , @NamedQuery(name = "Empleados.findByIdempleados", query = "SELECT e FROM Empleados e WHERE e.idempleados = :idempleados")
    , @NamedQuery(name = "Empleados.findByCodEmpleado", query = "SELECT e FROM Empleados e WHERE e.codEmpleado = :codEmpleado")
    , @NamedQuery(name = "Empleados.findBySalario", query = "SELECT e FROM Empleados e WHERE e.salario = :salario")
    , @NamedQuery(name = "Empleados.findByFechaAlta", query = "SELECT e FROM Empleados e WHERE e.fechaAlta = :fechaAlta")})
public class Empleados implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempleados")
    private Integer idempleados;
    
    @Basic(optional = false)
    @Column(name = "codEmpleado")
    private String codEmpleado;
    
    @Column(name = "salario")
    private String salario;
    
    @Column(name = "fechaAlta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    
    @JoinColumn(name = "idCategoria", referencedColumnName = "idcategorias")
    @ManyToOne
    private Categorias idCategoria;
    
    @JoinColumn(name = "idDepartamento", referencedColumnName = "iddepartamento")
    @ManyToOne
    private Departamentos idDepartamento;
    
    @OneToMany(mappedBy = "idEmpleado")
    
    private List<Personas> personasList;
    
    public Empleados() {
    }

    public Empleados(Integer idempleados) {
        this.idempleados = idempleados;
    }

    public Empleados(Integer idempleados, String codEmpleado) {
        this.idempleados = idempleados;
        this.codEmpleado = codEmpleado;
    }

    public Integer getIdempleados() {
        return idempleados;
    }

    public void setIdempleados(Integer idempleados) {
        this.idempleados = idempleados;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Categorias getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categorias idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Departamentos getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamentos idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public List<Personas> getPersonasList() {
        return personasList;
    }

    public void setPersonasList(List<Personas> personasList) {
        this.personasList = personasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempleados != null ? idempleados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
    	// Para comprobar que los cast se hacen correctamente.
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.idempleados == null && other.idempleados != null) || (this.idempleados != null && !this.idempleados.equals(other.idempleados))) {
            return false;
        }
        return true;
    }


}
