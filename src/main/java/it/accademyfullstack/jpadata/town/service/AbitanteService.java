package it.accademyfullstack.jpadata.town.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.accademyfullstack.jpadata.town.model.Abitante;
import it.accademyfullstack.jpadata.town.repository.AbitanteRepository;

@Service
public class AbitanteService {

	@Autowired
	AbitanteRepository abitanteRepository;

	public List<Abitante> getAllAbitanti() {
		return abitanteRepository.findAll();
	}

	public Abitante inserisciAbitante(Abitante abitante) {
		return abitanteRepository.save(abitante);
	}

	public Abitante aggiornaAbitante(Abitante abitante) {
		return abitanteRepository.save(abitante);
	}

	public void eliminaAbitante(Long idAbitante) {
		abitanteRepository.deleteById(idAbitante);
	}
}
