package com.loca.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.loca.modal.Locataire;
import com.loca.service.LocataireService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class LocataireControlleur {

	@Autowired
	private LocataireService locataireService;
	
	//Ajouter Locataire
	
	@PostMapping("/saveLocataire")
	Locataire loginLocataire(@RequestBody Locataire Locataire) {
		return locataireService.loginLocataire(Locataire);
	}

    //Afficher tous les Locataires
	
	@GetMapping("/findLocataires")
	List<Locataire> findLocataires() {
		return locataireService.findLocataires();
	}
	
	//Afficher Locataire by id
	
	@GetMapping("/findLocataire/{id}")
	Locataire findLocataire(@PathVariable long id) {
		return locataireService.findLocataire(id);
	}
	
	//update Locataire by id

	
	@PutMapping("/updateLocataire/{id}")
	Locataire updateLocataire(@RequestBody Locataire Locataire, @PathVariable long id) {
		return locataireService.updateLocataire(Locataire, id);
	}
	
	
	
	
	
}
