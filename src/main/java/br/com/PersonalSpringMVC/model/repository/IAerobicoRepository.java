package br.com.PersonalSpringMVC.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.PersonalSpringMVC.negocio.Aerobico;
import br.com.PersonalSpringMVC.negocio.Contato;

@Repository
public interface IAerobicoRepository extends CrudRepository<Aerobico, Integer> {
}