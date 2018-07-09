package com.agenda.spring.services;

import java.util.List;

import com.agenda.spring.model.Categorias;
import com.agenda.spring.model.Departamentos;
import com.agenda.spring.model.Personas;

public interface IAgendaServices {

	
	public List<Departamentos> listarDepartamentos ();
	
	public List<Personas> listarEmpleados ();
	
	public List<Categorias> listarCategoria ();
	
	public Personas listarDetalles (Personas idPersona);
	
	public List<Personas> listarEmpleadosCat (Categorias idcategoria);
	
	public List<Personas> listarEmpleadosDep (Departamentos iddepartamento);
}
