package br.com.PersonalSpringMVC.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.PersonalSpringMVC.negocio.Aluno;
import br.com.PersonalSpringMVC.negocio.Anaerobico;

@Repository
public interface IAlunoRepository extends CrudRepository<Aluno, Integer> {
}