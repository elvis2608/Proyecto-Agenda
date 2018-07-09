package com.agenda.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.agenda.spring.model.Departamentos;
import com.agenda.spring.services.IAgendaServices;





@Controller
public class HomeController {

	
	@RequestMapping("/Hola")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
	
	
	
	
	/*
	
	@Autowired
	private IAgendaServices services;
	
	
	
	
	@RequestMapping("/")
	public ModelAndView handleRequest () throws Exception {
		
		List<Departamentos> listDep = services.listarDepartamentos();
		ModelAndView model = new ModelAndView("Principal");
		model.addObject("deplist", listDep);
		return model;
			
	}
	
	*/
}


