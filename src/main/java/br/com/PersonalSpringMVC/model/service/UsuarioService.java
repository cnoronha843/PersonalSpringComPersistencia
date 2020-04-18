package br.com.PersonalSpringMVC.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.PersonalSpringMVC.model.repository.IUsuarioRepository;
import br.com.PersonalSpringMVC.negocio.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository repository;

	public boolean isValid(Usuario usuario,String login, String senha) {
		return usuario.getLogin().equalsIgnoreCase(login) && usuario.getSenha().equals(login);
	}
	
	public List<Usuario> obterLista(){
		return (List<Usuario>)repository.findAll();
	}

	public void incluir(Usuario usuario) {
		repository.save(usuario);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IUsuarioRepository getRepository() {
		return repository;
	}
	public void setRepository(IUsuarioRepository repository) {
		this.repository = repository;
	}
}