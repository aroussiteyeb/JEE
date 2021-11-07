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


import com.loca.modal.User;

import com.loca.service.locaService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class locaController {

	@Autowired
	private locaService locaService;
	
	//Ajouter User
	
	@PostMapping("/saveUser")
	User loginUser(@RequestBody User User) {
		return locaService.loginUser(User);
	}

    //Afficher tous les users
	
	@GetMapping("/findUsers")
	List<User> findUsers() {
		return locaService.findUsers();
	}
	
	//Afficher user by id
	
	@GetMapping("/findUser/{id}")
	User findUser(@PathVariable long id) {
		return locaService.findUser(id);
	}
	
	//update user by id

	
	@PutMapping("/updateUser/{id}")
	User updateUser(@RequestBody User User, @PathVariable long id) {
		return locaService.updateUser(User, id);
	}
	
	
	
	
	
}
