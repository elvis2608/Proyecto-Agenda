package com.agenda.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.agenda.spring.model.Categorias;
import com.agenda.spring.model.Departamentos;
import com.agenda.spring.model.Personas;

public class AgendaDAOImp implements IAgendaDAO{

	// Inyectamos el sessionFactory 
	@Autowired
	private SessionFactory sessionFactory;
	
	public AgendaDAOImp () {
		
		
	}
	
	public AgendaDAOImp (SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	
	
	@Override
	@Transactional	
	public List<Departamentos> listarDepartamentos() {
		
		@SuppressWarnings("unchecked")
		List<Departamentos> listaDep = (List<Departamentos>) sessionFactory.getCurrentSession()
				.createCriteria(Departamentos.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		
		return listaDep;
		
		
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
