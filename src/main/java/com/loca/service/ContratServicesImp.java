package com.loca.service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.loca.dao.ContratDao;

import com.loca.modal.Contrat;


@Transactional
@Component
public class ContratServicesImp implements ContratService {

	

	@Autowired
	private ContratDao ContratDao;

	

	

	@Override
	public Contrat loginContrat(Contrat Contrat) {
		List<Contrat> Contrats = ContratDao.findAll();
		if (Contrats.size() == 0) {
			Contrat.setContrat(true);
		}

		for (Contrat Contrat2 : Contrats) {
			if (Contrat.getContratname().equals(Contrat2.getContratname())) {
				Contrat2.setContratname(Contrat2.getContratname());
				return ContratDao.save(Contrat2);
			}
		}
		return ContratDao.save(Contrat);
	}

	

	@Override
	public List<Contrat> findContrats() {
		return ContratDao.findAll();
	}

	@Override
	public Contrat findContrat(long id) {
		return ContratDao.findById(id).orElse(null);
	}

	@Override
	public Contrat updateContrat(Contrat Contrat, long id) {
		Contrat Contrat2 = ContratDao.findById(id).orElse(null);
		Contrat2.setPassword(Contrat.getPassword());
		Contrat2.setContratname(Contrat.getContratname());
		Contrat2.setEmail(Contrat.getEmail());
		Contrat2.setName(Contrat.getName());
		return ContratDao.save(Contrat2);
	}

	
}
