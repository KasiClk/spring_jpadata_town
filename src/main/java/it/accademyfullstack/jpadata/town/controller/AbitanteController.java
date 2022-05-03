package it.accademyfullstack.jpadata.town.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.accademyfullstack.jpadata.town.model.Abitante;
import it.accademyfullstack.jpadata.town.service.AbitanteService;

@RestController
@RequestMapping("/api")
public class AbitanteController {

	@Autowired
	AbitanteService abitanteService;

	static final Logger logger = LoggerFactory.getLogger(AbitanteController.class);

	@GetMapping("/abitanti")
	public List<Abitante> getAllAbitanti() {
		logger.info("Chiamata Get All Abitanti");

		return abitanteService.getAllAbitanti();
	}

	@PostMapping("/abitanti/inserisci")
	public Abitante inserisciAbitante(@RequestBody Abitante abitante) {
		logger.info("Chiamata POST Abitante: " + abitante.toString());

		return abitanteService.inserisciAbitante(abitante);

	}

	@PutMapping("/abitanti/aggiorna")
	public Abitante aggiornaAbitante(@RequestBody Abitante abitante) {
		logger.info("Chiamata PUT Abitante: " + abitante.toString());

		return abitanteService.aggiornaAbitante(abitante);

	}

	@DeleteMapping("/abitanti/elimina")
	public HttpStatus cancellaAbitante(@RequestParam Long idAbitante) {
		logger.info("Chiamata DELETE Abitante: " + idAbitante);

		abitanteService.eliminaAbitante(idAbitante);

		return HttpStatus.OK;
	}

}
