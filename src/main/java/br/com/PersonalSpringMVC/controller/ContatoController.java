package br.com.PersonalSpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.PersonalSpringMVC.model.service.ContatoService;
import br.com.PersonalSpringMVC.negocio.Contato;

@Controller
@SessionAttributes("user")
public class ContatoController {

	@Autowired
	private ContatoService service;

	@RequestMapping(value = "/contato", method = RequestMethod.POST) 
	public String incluir(
			Model model,
			Contato contato
			) {
		
		service.incluir(contato);

		return "home";
	}
	
	@RequestMapping(value = "/contato/excluir/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return "home";
	}

	public ContatoService getService() {
		return service;
	}
	public void setService(ContatoService service) {
		this.service = service;
	}
}