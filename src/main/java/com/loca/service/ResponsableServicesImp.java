package com.loca.service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.loca.dao.ResponsableDao;

import com.loca.modal.Responsable;


@Transactional
@Component
public class ResponsableServicesImp implements ResponsableService {

	

	@Autowired
	private ResponsableDao ResponsableDao;

	

	

	@Override
	public Responsable loginResponsable(Responsable Responsable) {
		List<Responsable> Responsables = ResponsableDao.findAll();
		if (Responsables.size() == 0) {
			Responsable.setResponsable(true);
		}

		for (Responsable Responsable2 : Responsables) {
			if (Responsable.getResponsablename().equals(Responsable2.getResponsablename())) {
				Responsable2.setResponsablename(Responsable2.getResponsablename());
				return ResponsableDao.save(Responsable2);
			}
		}
		return ResponsableDao.save(Responsable);
	}

	

	@Override
	public List<Responsable> findResponsables() {
		return ResponsableDao.findAll();
	}

	@Override
	public Responsable findResponsable(long id) {
		return ResponsableDao.findById(id).orElse(null);
	}

	@Override
	public Responsable updateResponsable(Responsable Responsable, long id) {
		Responsable Responsable2 = ResponsableDao.findById(id).orElse(null);
		Responsable2.setPassword(Responsable.getPassword());
		Responsable2.setResponsablename(Responsable.getResponsablename());
		Responsable2.setEmail(Responsable.getEmail());
		Responsable2.setName(Responsable.getName());
		return ResponsableDao.save(Responsable2);
	}

	
}
