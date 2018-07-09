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
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.*;

/**
*
* @author Elvis- Ruben - Gamero
*/

@Entity
@Table(name = "telefonos", catalog = "agenda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefonos.findAll", query = "SELECT t FROM Telefonos t")
    , @NamedQuery(name = "Telefonos.findByIdtelefonos", query = "SELECT t FROM Telefonos t WHERE t.idtelefonos = :idtelefonos")
    , @NamedQuery(name = "Telefonos.findByTelefono", query = "SELECT t FROM Telefonos t WHERE t.telefono = :telefono")})
public class Telefonos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtelefonos")
    private Integer idtelefonos;
	
	@Column(name = "telefono")
    private String telefono;
	
	@JoinColumn(name = "idPersona", referencedColumnName = "idpersonas")
    @ManyToOne
    private Personas idPersona;
	
	
	public Telefonos() {
    }

    public Telefonos(Integer idtelefonos) {
        this.idtelefonos = idtelefonos;
    }

    public Integer getIdtelefonos() {
        return idtelefonos;
    }

    public void setIdtelefonos(Integer idtelefonos) {
        this.idtelefonos = idtelefonos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        hash += (idtelefonos != null ? idtelefonos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
    	// Para comprobar que los cast se hacen correctamente.
        if (!(object instanceof Telefonos)) {
            return false;
        }
        Telefonos other = (Telefonos) object;
        if ((this.idtelefonos == null && other.idtelefonos != null) || (this.idtelefonos != null && !this.idtelefonos.equals(other.idtelefonos))) {
            return false;
        }
        return true;
    }
	
	
}
