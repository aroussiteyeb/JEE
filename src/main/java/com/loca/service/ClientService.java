package com.loca.service;

import java.util.List;

import com.loca.modal.Client;


public interface ClientService {

	

	Client loginClient(Client Client);
	
	Client updateClient(Client Client, long id);



	
	
	List<Client> findClients();
	
	Client findClient(long id);
	
	

}
