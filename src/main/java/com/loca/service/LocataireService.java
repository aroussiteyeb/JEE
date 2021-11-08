package com.loca.service;

import java.util.List;

import com.loca.modal.Locataire;


public interface LocataireService {

	

	Locataire loginLocataire(Locataire Locataire);
	
	Locataire updateLocataire(Locataire Locataire, long id);



	
	
	List<Locataire> findLocataires();
	
	Locataire findLocataire(long id);
	
	

}
