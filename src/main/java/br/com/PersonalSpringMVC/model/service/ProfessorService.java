package br.com.PersonalSpringMVC.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.PersonalSpringMVC.model.repository.IProfessorRepository;
import br.com.PersonalSpringMVC.negocio.Professor;

@Service
public class ProfessorService {
	
	@Autowired
	private IProfessorRepository repository;
	
	public List<Professor> obterLista(){
		return (List<Professor>)repository.findAll();
	}
	
	public Professor obterProfessor(Integer id) {		
		return repository.findById(id).get();
	}

	public void incluir(Professor professor) {
		repository.save(professor);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IProfessorRepository getRepository() {
		return repository;
	}
	public void setRepository(IProfessorRepository repository) {
		this.repository = repository;
	}
}