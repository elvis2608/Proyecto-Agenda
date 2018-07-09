package com.agenda.spring.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorias", catalog = "agenda")



public class Categorias implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *
	 * @author Elvis GAMERO RUBEN
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcategorias")
    private Integer idcategorias;
	
	
	@Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
	
	
	@Column(name = "descripcion")
    private String descripcion;
	
	@OneToMany(mappedBy = "idCategoria")
    private List<Empleados> empleadosList;
	
	
	public Categorias() {
    }
	
	 public Categorias(Integer idcategorias) {
	        this.idcategorias = idcategorias;
	    }

	    public Categorias(Integer idcategorias, String nombre) {
	        this.idcategorias = idcategorias;
	        this.nombre = nombre;
	    }

	    public Integer getIdcategorias() {
	        return idcategorias;
	    }

	    public void setIdcategorias(Integer idcategorias) {
	        this.idcategorias = idcategorias;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    
	    public List<Empleados> getEmpleadosList() {
	        return empleadosList;
	    }

	    public void setEmpleadosList(List<Empleados> empleadosList) {
	        this.empleadosList = empleadosList;
	    }
	    
	    @Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (idcategorias != null ? idcategorias.hashCode() : 0);
	        return hash;
	    }
	    
	    
	    @Override
	    public boolean equals(Object object) {
	        // Para comprobar que los cast se hacen correctamente.
	        if (!(object instanceof Categorias)) {
	            return false;
	        }
	        Categorias other = (Categorias) object;
	        if ((this.idcategorias == null && other.idcategorias != null) || (this.idcategorias != null && !this.idcategorias.equals(other.idcategorias))) {
	            return false;
	        }
	        return true;
	    }
	    
	    
	
}
