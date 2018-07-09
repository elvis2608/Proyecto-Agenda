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
	public List<Personas> listarEmpleados() {
		return iagendaDAO.listarEmpleados();
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Categorias> listarCategoria() {
		return iagendaDAO.listarCategoria();
		// TODO Auto-generated method stub
		
	}

	@Override
	public Personas listarDetalles(Personas idPersona) {
		return iagendaDAO.listarDetalles(idPersona);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Personas> listarEmpleadosCat(Categorias idcategoria) {
		return iagendaDAO.listarEmpleadosCat(idcategoria);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Personas> listarEmpleadosDep(Departamentos iddepartamento) {
		return iagendaDAO.listarEmpleadosDep(iddepartamento);
		// TODO Auto-generated method stub
		
	}

}
