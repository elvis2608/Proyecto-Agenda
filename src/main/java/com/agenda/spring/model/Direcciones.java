package com.agenda.spring.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Elvis Gamero and Ruben
 */
@Entity
@Table(name = "direcciones", catalog = "agenda")
public class Direcciones implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddirecciones")
    
    private Integer iddirecciones;
    @Basic(optional = false)
    @Column(name = "direccion")
    
    private String direccion;
    @Basic(optional = false)
    @Column(name = "codPostal")
    
    private String codPostal;
    @Basic(optional = false)
    @Column(name = "localidad")
    
    private String localidad;
    @Basic(optional = false)
    @Column(name = "provincia")
    
    private String provincia;
    
    
    
    @JoinColumn(name = "idPersona", referencedColumnName = "idpersonas")
    @ManyToOne
    private Personas idPersona;
    
    
    public Direcciones() {
    }

    public Direcciones(Integer iddirecciones) {
        this.iddirecciones = iddirecciones;
    }

    public Direcciones(Integer iddirecciones, String direccion, String codPostal, String localidad, String provincia) {
        this.iddirecciones = iddirecciones;
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public Integer getIddirecciones() {
        return iddirecciones;
    }

    public void setIddirecciones(Integer iddirecciones) {
        this.iddirecciones = iddirecciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Personas getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Personas idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddirecciones != null ? iddirecciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // Para comprobar que los cast se hacen correctamente. 
        if (!(object instanceof Direcciones)) {
            return false;
        }
        Direcciones other = (Direcciones) object;
        if ((this.iddirecciones == null && other.iddirecciones != null) || (this.iddirecciones != null && !this.iddirecciones.equals(other.iddirecciones))) {
            return false;
        }
        return true;
    }

    

}
