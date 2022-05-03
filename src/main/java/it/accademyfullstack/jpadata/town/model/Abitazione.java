package it.accademyfullstack.jpadata.town.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Abitazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	private Villaggio villaggio;

	@OneToMany(mappedBy = "abitazione")
	private List<Abitante> abitanti;

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

	public Villaggio getVillaggio() {
		return villaggio;
	}

	public void setVillaggio(Villaggio villaggio) {
		this.villaggio = villaggio;
	}

}