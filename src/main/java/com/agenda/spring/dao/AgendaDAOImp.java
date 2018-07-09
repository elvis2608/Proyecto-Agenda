package com.agenda.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.agenda.spring.config.ApplicationContextConfig;
import com.agenda.spring.model.Categorias;
import com.agenda.spring.model.Departamentos;
import com.agenda.spring.model.Personas;


import com.agenda.spring.utilities.*;

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
	public List<Personas> listarEmpleados() {
		// TODO Auto-generated method stub

        SessionFactory sessions = HibernateUtils.getSessionFactory();
        Session session = sessions.openSession();
        Query query;
        query = session.getNamedQuery("Personas.findAll");
        List<Personas> addressList = query.list();
        return addressList;
		
	}

	@Override
	public List<Categorias> listarCategoria() {
		// TODO Auto-generated method stub
		 SessionFactory sessions = HibernateUtils.getSessionFactory();
	        Session session = sessions.openSession();
	        Query query;
	        query = session.getNamedQuery("Categorias.findAll");
	        List<Categorias> addressList = query.list();	       
		return addressList;
	}

	@Override
	public List<Personas> listarDetalles(int idPersona) {
		// TODO Auto-generated method stub
		 SessionFactory sessions = HibernateUtils.getSessionFactory();
	        Session session = sessions.openSession();
	        Query query;
	        query = session.getNamedQuery("Personas.findByIdpersonas");
	        query.setInteger("idpersonas", idPersona);
	        List<Personas> addressList = query.list();	
		return addressList;
	}

	@Override
	public List<Personas> listarEmpleadosCat(int idcategoria) {
		 SessionFactory sessions = HibernateUtils.getSessionFactory();
	        Session session = sessions.openSession();
	        Query query;
	        query = session.getNamedQuery("Categorias.findByIdcategorias");
	        query.setInteger("idcategorias", idcategoria);
	        List<Personas> addressList = query.list();	
		return addressList;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Personas> listarEmpleadosDep(int iddepartamento) {
		 SessionFactory sessions = HibernateUtils.getSessionFactory();
	        Session session = sessions.openSession();
	        Query query;
	        query = session.getNamedQuery("Departamentos.findByIddepartamento");
	        query.setInteger("idcategorias", iddepartamento);
	        List<Personas> addressList = query.list();	
		return addressList;
		// TODO Auto-generated method stub
		
	}

}
