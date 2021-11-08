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


import com.loca.modal.Immobilier;
import com.loca.service.ImmobilierService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class ImmobilierControlleur {

	@Autowired
	private ImmobilierService ImmobilierService;
	
	//Ajouter Immobilier
	
	@PostMapping("/saveImmobilier")
	Immobilier loginImmobilier(@RequestBody Immobilier Immobilier) {
		return ImmobilierService.loginImmobilier(Immobilier);
	}

    //Afficher tous les Immobiliers
	
	@GetMapping("/findImmobiliers")
	List<Immobilier> findImmobiliers() {
		return ImmobilierService.findImmobiliers();
	}
	
	//Afficher Immobilier by id
	
	@GetMapping("/findImmobilier/{id}")
	Immobilier findImmobilier(@PathVariable long id) {
		return ImmobilierService.findImmobilier(id);
	}
	
	//update Immobilier by id

	
	@PutMapping("/updateImmobilier/{id}")
	Immobilier updateImmobilier(@RequestBody Immobilier Immobilier, @PathVariable long id) {
		return ImmobilierService.updateImmobilier(Immobilier, id);
	}
	
	
	
	
	
}
