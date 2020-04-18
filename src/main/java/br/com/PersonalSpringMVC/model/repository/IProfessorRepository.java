package br.com.PersonalSpringMVC.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.PersonalSpringMVC.negocio.Professor;

@Repository
public interface IProfessorRepository extends CrudRepository<Professor, Integer> {
}