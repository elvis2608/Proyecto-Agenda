package com.agenda.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.agenda.spring.model.Departamentos;
import com.agenda.spring.services.IAgendaServices;





@Controller
public class HomeController {

	@Autowired
	private IAgendaServices services;
	
	
	
	
	@RequestMapping("/")
	public ModelAndView handleRequest () throws Exception {
		
		List<Departamentos> listDep = services.listarDepartamentos();
		ModelAndView model = new ModelAndView("Principal");
		model.addObject("deplist", listDep);
		return model;
			
	}
}


