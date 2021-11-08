package com.loca.service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.loca.dao.ImmobilierDao;

import com.loca.modal.Immobilier;


@Transactional
@Component
public class ImmobilierServicesImp implements ImmobilierService {

	

	@Autowired
	private ImmobilierDao ImmobilierDao;

	

	

	@Override
	public Immobilier loginImmobilier(Immobilier Immobilier) {
		List<Immobilier> Immobiliers = ImmobilierDao.findAll();
		if (Immobiliers.size() == 0) {
			Immobilier.setImmobilier(true);
		}

		for (Immobilier Immobilier2 : Immobiliers) {
			if (Immobilier.getImmobiliername().equals(Immobilier2.getImmobiliername())) {
				Immobilier2.setImmobiliername(Immobilier2.getImmobiliername());
				return ImmobilierDao.save(Immobilier2);
			}
		}
		return ImmobilierDao.save(Immobilier);
	}

	

	@Override
	public List<Immobilier> findImmobiliers() {
		return ImmobilierDao.findAll();
	}

	@Override
	public Immobilier findImmobilier(long id) {
		return ImmobilierDao.findById(id).orElse(null);
	}

	@Override
	public Immobilier updateImmobilier(Immobilier Immobilier, long id) {
		Immobilier Immobilier2 = ImmobilierDao.findById(id).orElse(null);
		Immobilier2.setPassword(Immobilier.getPassword());
		Immobilier2.setImmobiliername(Immobilier.getImmobiliername());
		Immobilier2.setEmail(Immobilier.getEmail());
		Immobilier2.setName(Immobilier.getName());
		return ImmobilierDao.save(Immobilier2);
	}

	
}
