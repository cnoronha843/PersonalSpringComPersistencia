package br.com.PersonalSpringMVC.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.PersonalSpringMVC.model.repository.IAerobicoRepository;
import br.com.PersonalSpringMVC.negocio.Aerobico;
@Service
public class AerobicoService {

		
		@Autowired
		private IAerobicoRepository repository;
		
		public List<Aerobico> obterLista(){
			return (List<Aerobico>)repository.findAll();
		}
		

		public void incluir(Aerobico aerobico) {
			repository.save(aerobico);
		}

		public void excluir(Integer id) {
			repository.deleteById(id);
		}

		public IAerobicoRepository getRepository() {
			return repository;
		}
		public void setRepository(IAerobicoRepository repository) {
			this.repository = repository;
		}
	
}
