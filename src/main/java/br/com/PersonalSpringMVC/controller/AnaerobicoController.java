package br.com.PersonalSpringMVC.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.PersonalSpringMVC.model.service.AnaerobicoService;
import br.com.PersonalSpringMVC.negocio.Anaerobico;

@Controller
public class AnaerobicoController {

	@Autowired
	private AnaerobicoService service;
	
	@RequestMapping(value = "/cadastroAnaerobico", method = RequestMethod.GET)
	public String empresaCadastro(Model model) {		
		
		return "exercicio/cadastroExerciciosAnaerobicos";
	}
	
	@RequestMapping(value = "/cadastroAnaerobico", method = RequestMethod.POST) 
	public String incluirAluno(
			Model model,
			Anaerobico anaerobico
			) {
		
		
		service.incluir(anaerobico);

		return "alunos/detalheAlunos";
	}
	
	public AnaerobicoService getService() {
		return service;
	}
	public void setService(AnaerobicoService service) {
		this.service = service;
	}

	
}