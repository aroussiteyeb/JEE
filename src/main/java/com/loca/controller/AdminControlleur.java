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


import com.loca.modal.Admin;
import com.loca.service.AdminService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class AdminControlleur {

	@Autowired
	private AdminService adminService;
	
	//Ajouter Admin
	
	@PostMapping("/saveAdmin")
	Admin loginAdmin(@RequestBody Admin Admin) {
		return adminService.loginAdmin(Admin);
	}

    //Afficher tous les Admins
	
	@GetMapping("/findAdmins")
	List<Admin> findAdmins() {
		return adminService.findAdmins();
	}
	
	//Afficher Admin by id
	
	@GetMapping("/findAdmin/{id}")
	Admin findAdmin(@PathVariable long id) {
		return adminService.findAdmin(id);
	}
	
	//update Admin by id

	
	@PutMapping("/updateAdmin/{id}")
	Admin updateAdmin(@RequestBody Admin Admin, @PathVariable long id) {
		return adminService.updateAdmin(Admin, id);
	}
	
	
	
	
	
}
