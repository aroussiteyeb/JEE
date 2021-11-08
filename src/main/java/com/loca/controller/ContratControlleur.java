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


import com.loca.modal.Contrat;
import com.loca.service.ContratService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class ContratControlleur {

	@Autowired
	private ContratService ContratService;
	
	//Ajouter Contrat
	
	@PostMapping("/saveContrat")
	Contrat loginContrat(@RequestBody Contrat Contrat) {
		return ContratService.loginContrat(Contrat);
	}

    //Afficher tous les Contrats
	
	@GetMapping("/findContrats")
	List<Contrat> findContrats() {
		return ContratService.findContrats();
	}
	
	//Afficher Contrat by id
	
	@GetMapping("/findContrat/{id}")
	Contrat findContrat(@PathVariable long id) {
		return ContratService.findContrat(id);
	}
	
	//update Contrat by id

	
	@PutMapping("/updateContrat/{id}")
	Contrat updateContrat(@RequestBody Contrat Contrat, @PathVariable long id) {
		return ContratService.updateContrat(Contrat, id);
	}
	
	
	
	
	
}
