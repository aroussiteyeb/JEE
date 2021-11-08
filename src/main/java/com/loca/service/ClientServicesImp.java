package com.loca.service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.loca.dao.ClientDao;

import com.loca.modal.Client;


@Transactional
@Component
public class ClientServicesImp implements ClientService {

	

	@Autowired
	private ClientDao ClientDao;

	

	

	@Override
	public Client loginClient(Client Client) {
		List<Client> Clients = ClientDao.findAll();
		if (Clients.size() == 0) {
			Client.setClient(true);
		}

		for (Client Client2 : Clients) {
			if (Client.getClientname().equals(Client2.getClientname())) {
				Client2.setClientname(Client2.getClientname());
				return ClientDao.save(Client2);
			}
		}
		return ClientDao.save(Client);
	}

	

	@Override
	public List<Client> findClients() {
		return ClientDao.findAll();
	}

	@Override
	public Client findClient(long id) {
		return ClientDao.findById(id).orElse(null);
	}

	@Override
	public Client updateClient(Client Client, long id) {
		Client Client2 = ClientDao.findById(id).orElse(null);
		Client2.setPassword(Client.getPassword());
		Client2.setClientname(Client.getClientname());
		Client2.setEmail(Client.getEmail());
		Client2.setName(Client.getName());
		return ClientDao.save(Client2);
	}

	
}
