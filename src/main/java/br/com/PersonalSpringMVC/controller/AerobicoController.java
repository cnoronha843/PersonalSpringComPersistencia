package br.com.PersonalSpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.PersonalSpringMVC.model.service.AerobicoService;
import br.com.PersonalSpringMVC.negocio.Aerobico;

@Controller
public class AerobicoController {

	@Autowired
	private AerobicoService service;
	
	@RequestMapping(value = "/cadastroAerobico", method = RequestMethod.GET)
	public String empresaCadastro(Model model) {		
		
		return "exercicio/cadastroExerciciosAerobicos";
	}
	
	@RequestMapping(value = "/cadastroAerobico", method = RequestMethod.POST) 
	public String incluirAluno(
			Model model,
			Aerobico aerobico
			) {
		
		
		service.incluir(aerobico);

		return "alunos/detalheAlunos";
	}
	
	public AerobicoService getService() {
		return service;
	}
	public void setService(AerobicoService service) {
		this.service = service;
	}

	
}