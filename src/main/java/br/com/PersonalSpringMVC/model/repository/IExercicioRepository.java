package br.com.PersonalSpringMVC.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.PersonalSpringMVC.negocio.Exercicio;

@Repository
public interface IExercicioRepository extends CrudRepository<Exercicio, Integer> {
}