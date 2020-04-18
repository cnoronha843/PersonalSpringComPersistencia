package br.com.PersonalSpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.PersonalSpringMVC.model.service.ProfessorService;
import br.com.PersonalSpringMVC.model.service.UsuarioService;
import br.com.PersonalSpringMVC.negocio.Professor;

@Controller
@SessionAttributes("user")
public class ProfessorController {

	@Autowired
	private ProfessorService service;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showInit() {
		return "home";
	}
	
	@RequestMapping(value = "/professores", method = RequestMethod.GET)
	public String obterLista(
				Model model
			) {		
		model.addAttribute("usuariosLista", service.obterLista());
		
		return "usuario/lista";
	}
	@RequestMapping(value = "/cadastroProfessor", method = RequestMethod.GET)
	public String cadastroProfessor() {
		
		return "/professor/cadastroProfessor";	
	}
	
	@RequestMapping(value = "/cadastroProfessor", method = RequestMethod.POST) 
	public String incluirProfessor(
			Model model,
			Professor professor
			) {
		
		
		service.incluir(professor);

		return "home";
	}
	
	@RequestMapping(value = "/professor/excluir/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		
		service.excluir(id);
		
		return this.obterLista(model);
	}

	public ProfessorService getService() {
		return service;
	}
	public void setService(ProfessorService service) {
		this.service = service;
	}
}