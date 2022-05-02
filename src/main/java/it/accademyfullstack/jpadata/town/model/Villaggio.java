package it.accademyfullstack.jpadata.town.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Villaggio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomeVillaggio;
	
	@OneToOne(mappedBy = "villaggio")
	private Sceriffo sceriffo;
	
	@OneToMany(mappedBy = "villaggio")
	private List<Abitazione> abitazioni;
	
	
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
