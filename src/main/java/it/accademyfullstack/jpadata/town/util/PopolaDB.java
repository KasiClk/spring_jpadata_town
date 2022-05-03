package it.accademyfullstack.jpadata.town.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.accademyfullstack.jpadata.town.model.Abitante;
import it.accademyfullstack.jpadata.town.model.Abitazione;
import it.accademyfullstack.jpadata.town.model.Professione;
import it.accademyfullstack.jpadata.town.model.Sceriffo;
import it.accademyfullstack.jpadata.town.model.Villaggio;
import it.accademyfullstack.jpadata.town.repository.AbitanteRepository;
import it.accademyfullstack.jpadata.town.repository.AbitazioneRepository;
import it.accademyfullstack.jpadata.town.repository.ProfessioneRepository;
import it.accademyfullstack.jpadata.town.repository.SceriffoRepository;
import it.accademyfullstack.jpadata.town.repository.VillaggioRepository;

@Component
public class PopolaDB implements CommandLineRunner {

	@Autowired
	VillaggioRepository villaggioRepository;

	@Autowired
	AbitanteRepository abitanteRepository;

	@Autowired
	AbitazioneRepository abitazioneRepository;

	@Autowired
	ProfessioneRepository professioneRepository;

	@Autowired
	SceriffoRepository sceriffoRepository;

	@Override
	public void run(String... args) throws Exception {

		Villaggio villaggio = new Villaggio();
		villaggio.setNomeVillaggio("West Town");
		villaggioRepository.save(villaggio);

		Abitazione abitazione = new Abitazione();
		abitazione.setIndirizzo("Wine Road");
		abitazione.setVillaggio(villaggio);
		abitazioneRepository.save(abitazione);

		Professione professione = new Professione();
		professione.setTitolo("Cantante");
		professioneRepository.save(professione);

		Professione professione2 = new Professione();
		professione2.setTitolo("Dottore");
		professioneRepository.save(professione2);

		Professione professione3 = new Professione();
		professione3.setTitolo("Fattorino");
		professioneRepository.save(professione3);

		List<Professione> professioni = new ArrayList<>();
		professioni.add(professione2);
		professioni.add(professione3);
		professioni.add(professione);

		Abitante abitante = new Abitante();
		abitante.setNome("Lucky Luke");
		abitante.setProfessioni(professioni);
		abitante.setAbitazione(abitazione);
		abitanteRepository.save(abitante);

		Sceriffo sceriffo = new Sceriffo();
		sceriffo.setNome("James");
		sceriffo.setVillaggio(villaggio);
		sceriffoRepository.save(sceriffo);

	}
}
