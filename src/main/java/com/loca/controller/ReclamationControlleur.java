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


import com.loca.modal.Reclamation;
import com.loca.service.ReclamationService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class ReclamationControlleur {

	@Autowired
	private ReclamationService ReclamationService;
	
	//Ajouter Reclamation
	
	@PostMapping("/saveReclamation")
	Reclamation loginReclamation(@RequestBody Reclamation Reclamation) {
		return ReclamationService.loginReclamation(Reclamation);
	}

    //Afficher tous les Reclamations
	
	@GetMapping("/findReclamations")
	List<Reclamation> findReclamations() {
		return ReclamationService.findReclamations();
	}
	
	//Afficher Reclamation by id
	
	@GetMapping("/findReclamation/{id}")
	Reclamation findReclamation(@PathVariable long id) {
		return ReclamationService.findReclamation(id);
	}
	
	//update Reclamation by id

	
	@PutMapping("/updateReclamation/{id}")
	Reclamation updateReclamation(@RequestBody Reclamation Reclamation, @PathVariable long id) {
		return ReclamationService.updateReclamation(Reclamation, id);
	}
	
	
	
	
	
}
