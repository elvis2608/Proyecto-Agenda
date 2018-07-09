package com.agenda.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.agenda.spring.dao.IAgendaDAO;
import com.agenda.spring.model.Categorias;
import com.agenda.spring.model.Departamentos;
import com.agenda.spring.model.Personas;

public class AgendaServicesImp implements IAgendaServices {

	
	@Autowired
	private IAgendaDAO iagendaDAO;
	
	@Override
	public List<Departamentos> listarDepartamentos() {
			
		return iagendaDAO.listarDepartamentos();
		
		
	}

	@Override
	public void listarEmpleados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarCategoria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarDetalles(Personas idPersona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarEmpleadosCat(Categorias idcategoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarEmpleadosDep(Departamentos iddepartamento) {
		// TODO Auto-generated method stub
		
	}

}
