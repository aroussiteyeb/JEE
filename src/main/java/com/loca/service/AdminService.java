package com.loca.service;

import java.util.List;

import com.loca.modal.Admin;


public interface AdminService {

	

	Admin loginAdmin(Admin Admin);
	
	Admin updateAdmin(Admin Admin, long id);



	
	
	List<Admin> findAdmins();
	
	Admin findAdmin(long id);
	
	

}
