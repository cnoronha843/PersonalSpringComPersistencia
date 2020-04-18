	package br.com.PersonalSpringMVC.negocio;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name= "TAluno")
public class Aluno extends Usuario{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int idade;
	private float peso;
	@OneToOne(
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL,
			orphanRemoval = true
			)
	@JoinColumn(name = "idProfessor")
	private  Professor professor;
	
	@OneToMany(
			fetch = FetchType.EAGER,
			cascade = CascadeType.DETACH,
			orphanRemoval = true
			)
	@JoinColumn(name = "idExercicio", referencedColumnName="id")
	@JsonManagedReference
	private List <Exercicio> exercicios;
	

	public Aluno() {
		super();
	}

	public Aluno(Integer id, int idade, float peso, Professor professor, List<Exercicio> exercicios) {
		super();
		this.id = id;
		this.idade = idade;
		this.peso = peso;
		this.professor = professor;
		this.exercicios = exercicios;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}

		
	
	
	
	

		
	


	
		
	

	
	

}
