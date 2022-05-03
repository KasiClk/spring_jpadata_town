package it.accademyfullstack.jpadata.town.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sceriffo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	@OneToOne
	private Villaggio villaggio;

	public long getId() {
		return id;
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

	public Villaggio getVillaggio() {
		return villaggio;
	}

	public void setVillaggio(Villaggio villaggio) {
		this.villaggio = villaggio;
	}

}
