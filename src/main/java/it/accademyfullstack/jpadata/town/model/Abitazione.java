package it.accademyfullstack.jpadata.town.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Abitazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String indirizzo;

	@Override
	public String toString() {
		return "Professione [indirizzo=" + indirizzo + ", id=" + id + "]";
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}