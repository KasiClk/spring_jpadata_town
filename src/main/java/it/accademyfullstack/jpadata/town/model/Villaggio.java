package it.accademyfullstack.jpadata.town.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Villaggio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomeVillaggio;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Abitante [id=" + id + ", nomeVillaggio=" + nomeVillaggio + "]";
	}

	public String getNomeVillaggio() {
		return nomeVillaggio;
	}

	public void setNomeVillaggio(String nomeVillaggio) {
		this.nomeVillaggio = nomeVillaggio;
	}

}
