package com.loca.service;

import java.util.List;

import com.loca.modal.Reclamation;


public interface ReclamationService {

	

	Reclamation loginReclamation(Reclamation Reclamation);
	
	Reclamation updateReclamation(Reclamation Reclamation, long id);



	
	
	List<Reclamation> findReclamations();
	
	Reclamation findReclamation(long id);
	
	

}
