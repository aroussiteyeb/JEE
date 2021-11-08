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


import com.loca.modal.Client;
import com.loca.service.ClientService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class ClientControlleur {
	@Autowired
	private ClientService clientService;
	
	//Ajouter Client
	
	@PostMapping("/saveClient")
	Client loginClient(@RequestBody Client Client) {
		return clientService.loginClient(Client);
	}

    //Afficher tous les Clients
	
	@GetMapping("/findClients")
	List<Client> findClients() {
		return clientService.findClients();
	}
	
	//Afficher Client by id
	
	@GetMapping("/findClient/{id}")
	Client findClient(@PathVariable long id) {
		return clientService.findClient(id);
	}
	
	//update Client by id

	
	@PutMapping("/updateClient/{id}")
	Client updateClient(@RequestBody Client Client, @PathVariable long id) {
		return clientService.updateClient(Client, id);
	}
	
	
	
	
	
}
