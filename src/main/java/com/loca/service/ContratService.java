package com.loca.service;

import java.util.List;

import com.loca.modal.Contrat;


public interface ContratService {

	

	Contrat loginContrat(Contrat Contrat);
	
	Contrat updateContrat(Contrat Contrat, long id);



	
	
	List<Contrat> findContrats();
	
	Contrat findContrat(long id);
	
	

}
