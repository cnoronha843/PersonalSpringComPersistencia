package br.com.PersonalSpringMVC.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name= "TAerobico")
@PrimaryKeyJoinColumn(name = "idExercicio")
public class Aerobico extends Exercicio {
	

	private int tempo;
	private boolean inclinado;
	private int velocidadeMedia;
	
	
	
	public Aerobico(String nomeDoExercicio, int tempoRecuperacao, int quantidadeBlocos, int tempo, boolean inclinado,
			int velocidadeMedia) {
		super(nomeDoExercicio, tempoRecuperacao, quantidadeBlocos);
		this.tempo = tempo;
		this.inclinado = inclinado;
		this.velocidadeMedia = velocidadeMedia;
	}
	public boolean isInclinado() {
		return inclinado;
	}
	public void setInclinado(boolean inclinado) {
		this.inclinado = inclinado;
	}
	public int getVelocidadeMedia() {
		return velocidadeMedia;
	}
	public void setVelocidadeMedia(int velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {


		this.tempo = tempo;
	}	
	public void exibir() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return String.format("Exercicio: %s%d", super.toString(),this.getTempo());
	}
	
}
