package com.loca.service;

import java.util.List;

import com.loca.modal.Responsable;


public interface ResponsableService {

	

	Responsable loginResponsable(Responsable Responsable);
	
	Responsable updateResponsable(Responsable Responsable, long id);



	
	
	List<Responsable> findResponsables();
	
	Responsable findResponsable(long id);
	
	

}
