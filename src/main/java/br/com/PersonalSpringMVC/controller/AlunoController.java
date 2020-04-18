package br.com.PersonalSpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.PersonalSpringMVC.model.service.AlunoService;
import br.com.PersonalSpringMVC.model.service.ProfessorService;
import br.com.PersonalSpringMVC.negocio.Aluno;
import br.com.PersonalSpringMVC.negocio.Contato;
import br.com.PersonalSpringMVC.negocio.Usuario;

@Controller
@SessionAttributes("user")
public class AlunoController {

	@Autowired
	private AlunoService service;
	

	@RequestMapping(value = "/alunos", method = RequestMethod.GET)
	public String obterLista(
				Model model
			) {		
		model.addAttribute("alunosLista", service.obterLista());
		
		return "/aluno/listaAlunos";
	}
	@RequestMapping(value = "/cadastroAluno", method = RequestMethod.GET)
	public String cadastroAluno() {
		
		return "/aluno/cadastroAluno";	
	}
	
	@RequestMapping(value = "/aluno/detalhes/{id}", method = RequestMethod.GET)
	public String detalheAluno(Model model, @PathVariable Integer id) {		
		
		model.addAttribute("aluno", service.obterAluno(id));		
		
		return "/aluno/detalheAluno";
	}
	
	@RequestMapping(value = "/cadastroAluno", method = RequestMethod.POST) 
	public String incluirAluno(
			Model model,
			Aluno aluno
			) {
		
		
		service.incluir(aluno);

		return "home";
	}
	
	@RequestMapping(value = "/aluno/excluir/{id}", method = RequestMethod.GET)
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		service.excluir(id);
		
		return this.obterLista(model);
	}

	public AlunoService getService() {
		return service;
	}
	public void setService(AlunoService service) {
		this.service = service;
	}
}