package com.loca.service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.loca.dao.LocataireDao;

import com.loca.modal.Locataire;


@Transactional
@Component
public class LocataireServicesImp implements LocataireService {

	

	@Autowired
	private LocataireDao LocataireDao;

	

	

	@Override
	public Locataire loginLocataire(Locataire Locataire) {
		List<Locataire> Locataires = LocataireDao.findAll();
		if (Locataires.size() == 0) {
			Locataire.setLocataire(true);
		}

		for (Locataire Locataire2 : Locataires) {
			if (Locataire.getLocatairename().equals(Locataire2.getLocatairename())) {
				Locataire2.setLocatairename(Locataire2.getLocatairename());
				return LocataireDao.save(Locataire2);
			}
		}
		return LocataireDao.save(Locataire);
	}

	

	@Override
	public List<Locataire> findLocataires() {
		return LocataireDao.findAll();
	}

	@Override
	public Locataire findLocataire(long id) {
		return LocataireDao.findById(id).orElse(null);
	}

	@Override
	public Locataire updateLocataire(Locataire Locataire, long id) {
		Locataire Locataire2 = LocataireDao.findById(id).orElse(null);
		Locataire2.setPassword(Locataire.getPassword());
		Locataire2.setLocatairename(Locataire.getLocatairename());
		Locataire2.setEmail(Locataire.getEmail());
		Locataire2.setName(Locataire.getName());
		return LocataireDao.save(Locataire2);
	}

	
}
