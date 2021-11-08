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


import com.loca.modal.Responsable;
import com.loca.service.ResponsableService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class ResponsableControlleur {

	@Autowired
	private ResponsableService ResponsableService;
	
	//Ajouter Responsable
	
	@PostMapping("/saveResponsable")
	Responsable loginResponsable(@RequestBody Responsable Responsable) {
		return ResponsableService.loginResponsable(Responsable);
	}

    //Afficher tous les Responsables
	
	@GetMapping("/findResponsables")
	List<Responsable> findResponsables() {
		return ResponsableService.findResponsables();
	}
	
	//Afficher Responsable by id
	
	@GetMapping("/findResponsable/{id}")
	Responsable findResponsable(@PathVariable long id) {
		return ResponsableService.findResponsable(id);
	}
	
	//update Responsable by id

	
	@PutMapping("/updateResponsable/{id}")
	Responsable updateResponsable(@RequestBody Responsable Responsable, @PathVariable long id) {
		return ResponsableService.updateResponsable(Responsable, id);
	}
	
	
	
	
	
}
