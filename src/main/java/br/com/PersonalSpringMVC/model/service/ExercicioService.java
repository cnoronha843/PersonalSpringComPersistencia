package br.com.PersonalSpringMVC.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.PersonalSpringMVC.model.repository.IExercicioRepository;
import br.com.PersonalSpringMVC.negocio.Exercicio;

@Service
public class ExercicioService {
	
	@Autowired
	private IExercicioRepository repository;


	public Exercicio obterExercicio(Integer id){
		return repository.findById(id).get();
	}
	
	public List<Exercicio> obterLista(){
		return (List<Exercicio>)repository.findAll();
	}

	public void incluir(Exercicio exercicio) {
		repository.save(exercicio);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IExercicioRepository getRepository() {
		return repository;
	}
	public void setRepository(IExercicioRepository repository) {
		this.repository = repository;
	}
}