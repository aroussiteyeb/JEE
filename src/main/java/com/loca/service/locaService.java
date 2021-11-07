package com.loca.service;

import java.util.List;

import com.loca.modal.User;


public interface locaService {

	

	User loginUser(User User);
	
	User updateUser(User User, long id);



	
	
	List<User> findUsers();
	
	User findUser(long id);
	
	

}
