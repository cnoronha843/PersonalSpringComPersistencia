package br.com.PersonalSpringMVC.controller;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.PersonalSpringMVC.model.service.ExercicioService;
import br.com.PersonalSpringMVC.negocio.Aluno;
import br.com.PersonalSpringMVC.negocio.Anaerobico;
import br.com.PersonalSpringMVC.negocio.Exercicio;

@Controller
public class ExercicioController {

	@Autowired
	private ExercicioService service;
	
	
	@RequestMapping(value = "/exercicios", method = RequestMethod.GET)
	public String obterLista(
				Model model
			) {		
		model.addAttribute("exerciciosLista", service.obterLista());
		
		return "exercicio/listaExercicios";
	}
		
	
	
	@RequestMapping(value = "/exercicio/incluir/", method = RequestMethod.GET)
	public String cadastroExercicio(Model model) {		
		return "exercicio/cadastroExercicio";		
	}
	

	
	@RequestMapping(value = "/exercicio/excluir/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.obterLista(model);
	}

	public ExercicioService getService() {
		return service;
	}
	public void setService(ExercicioService service) {
		this.service = service;
	}
}