package it.accademyfullstack.jpadata.town.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Abitante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;

	@ManyToOne
	private Abitazione abitazione;

	@ManyToMany
	private List<Professione> professioni;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Abitante [id=" + id + ", nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Abitazione getAbitazione() {
		return abitazione;
	}

	public void setAbitazione(Abitazione abitazione) {
		this.abitazione = abitazione;
	}

	public List<Professione> getProfessioni() {
		return professioni;
	}

	public void setProfessioni(List<Professione> professioni) {
		this.professioni = professioni;
	}

	
}
