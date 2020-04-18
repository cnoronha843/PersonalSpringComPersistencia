package br.com.PersonalSpringMVC.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;





@Entity
@Table(name = "TExercicio")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipoExercicio")
@JsonSubTypes({
    @Type(value=Aerobico.class, name = "Aerobico"),
    @Type(value=Anaerobico.class, name = "Anaerobico")
    
})
public abstract class Exercicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeDoExercicio;
	private int tempoRecuperacao;
	private int quantidadeBlocos;
	private String tipoExercicio;

	

	public Exercicio() {
	
	}


	public Exercicio(String nomeDoExercicio, int tempoRecuperacao, int quantidadeBlocos) {
		super();
		this.nomeDoExercicio = nomeDoExercicio;
		this.tempoRecuperacao = tempoRecuperacao;
		this.quantidadeBlocos = quantidadeBlocos;
	}
	
	
	public String getTipoExercicio() {
		return tipoExercicio;
	}


	public void setTipoExercicio(String tipoExercicio) {
		this.tipoExercicio = tipoExercicio;
	}


	public String getNomeDoExercicio() {
		return nomeDoExercicio;
	}

	public void setNomeDoExercicio(String nomeDoExercicio) {
		this.nomeDoExercicio = nomeDoExercicio;
	}

	public int getTempoRecuperacao() {
		return tempoRecuperacao;
	}

	public void setTempoRecuperacao(int tempoRecuperacao) {
		this.tempoRecuperacao = tempoRecuperacao;
	}

	public int getQuantidadeBlocos() {
		return quantidadeBlocos;
	}

	public void setQuantidadeBlocos(int quantidadeBlocos) {
		this.quantidadeBlocos = quantidadeBlocos;
	}


	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Exercicio: %s",
				this.getNomeDoExercicio());
	}

	
}
