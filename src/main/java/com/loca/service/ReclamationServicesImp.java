package com.loca.service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.loca.dao.ReclamationDao;

import com.loca.modal.Reclamation;


@Transactional
@Component
public class ReclamationServicesImp implements ReclamationService {

	

	@Autowired
	private ReclamationDao ReclamationDao;

	

	

	@Override
	public Reclamation loginReclamation(Reclamation Reclamation) {
		List<Reclamation> Reclamations = ReclamationDao.findAll();
		if (Reclamations.size() == 0) {
			Reclamation.setReclamation(true);
		}

		for (Reclamation Reclamation2 : Reclamations) {
			if (Reclamation.getReclamationname().equals(Reclamation2.getReclamationname())) {
				Reclamation2.setReclamationname(Reclamation2.getReclamationname());
				return ReclamationDao.save(Reclamation2);
			}
		}
		return ReclamationDao.save(Reclamation);
	}

	

	@Override
	public List<Reclamation> findReclamations() {
		return ReclamationDao.findAll();
	}

	@Override
	public Reclamation findReclamation(long id) {
		return ReclamationDao.findById(id).orElse(null);
	}

	@Override
	public Reclamation updateReclamation(Reclamation Reclamation, long id) {
		Reclamation Reclamation2 = ReclamationDao.findById(id).orElse(null);
		Reclamation2.setPassword(Reclamation.getPassword());
		Reclamation2.setReclamationname(Reclamation.getReclamationname());
		Reclamation2.setEmail(Reclamation.getEmail());
		Reclamation2.setName(Reclamation.getName());
		return ReclamationDao.save(Reclamation2);
	}

	
}
