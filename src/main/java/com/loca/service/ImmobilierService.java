package com.loca.service;

import java.util.List;

import com.loca.modal.Immobilier;


public interface ImmobilierService {

	

	Immobilier loginImmobilier(Immobilier Immobilier);
	
	Immobilier updateImmobilier(Immobilier Immobilier, long id);



	
	
	List<Immobilier> findImmobiliers();
	
	Immobilier findImmobilier(long id);
	
	

}
