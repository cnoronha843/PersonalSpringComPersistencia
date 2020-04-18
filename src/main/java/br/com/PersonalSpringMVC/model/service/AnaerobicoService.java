package br.com.PersonalSpringMVC.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.PersonalSpringMVC.model.repository.IAnaerobicoRepository;
import br.com.PersonalSpringMVC.negocio.Anaerobico;
import br.com.PersonalSpringMVC.negocio.Professor;

@Service
public class AnaerobicoService {
	
	@Autowired
	private IAnaerobicoRepository repository;
	
	public List<Anaerobico> obterLista(){
		return (List<Anaerobico>)repository.findAll();
	}
	

	public void incluir(Anaerobico anaerobico) {
		repository.save(anaerobico);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IAnaerobicoRepository getRepository() {
		return repository;
	}
	public void setRepository(IAnaerobicoRepository repository) {
		this.repository = repository;
	}
}