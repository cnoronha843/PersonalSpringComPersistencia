package br.com.PersonalSpringMVC.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TContato")
public class Contato  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String email;
	private String whatsapp;
	
	public Contato() {
	}
	public Contato(String email, String whatsapp) {
		this();
		this.email = email;
		this.whatsapp = whatsapp;
	}	
	public Contato(Integer id, String email, String whatsapp) {
		this(email, whatsapp);
		this.id = id;
	}	
	@Override
	public String toString() {
		return String.format("%d - %s - %s", 
					this.getId(),
					this.getEmail(),
					this.getWhatsapp()
				);
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
}