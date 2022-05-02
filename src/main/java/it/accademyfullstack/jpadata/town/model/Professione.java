package it.accademyfullstack.jpadata.town.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String titolo;

	@Override
	public String toString() {
		return "Professione [titolo=" + titolo + ", id=" + id + "]";
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}