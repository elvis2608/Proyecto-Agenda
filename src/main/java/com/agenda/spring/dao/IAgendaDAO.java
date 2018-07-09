package com.agenda.spring.dao;

import java.util.List;

import com.agenda.spring.model.Categorias;
import com.agenda.spring.model.Departamentos;
import com.agenda.spring.model.Personas;

public interface IAgendaDAO {

	public List<Departamentos> listarDepartamentos ();
	
	public void listarEmpleados ();
	
	public void listarCategoria ();
	
	public void listarDetalles (Personas idPersona);
	
	public void listarEmpleadosCat (Categorias idcategoria);
	
	public void listarEmpleadosDep (Departamentos iddepartamento);
	
	
}
