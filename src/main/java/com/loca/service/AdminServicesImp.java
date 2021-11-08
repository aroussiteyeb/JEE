package com.loca.service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.loca.dao.AdminDao;

import com.loca.modal.Admin;


@Transactional
@Component
public class AdminServicesImp implements AdminService {

	

	@Autowired
	private AdminDao AdminDao;

	

	

	@Override
	public Admin loginAdmin(Admin Admin) {
		List<Admin> Admins = AdminDao.findAll();
		if (Admins.size() == 0) {
			Admin.setAdmin(true);
		}

		for (Admin Admin2 : Admins) {
			if (Admin.getAdminname().equals(Admin2.getAdminname())) {
				Admin2.setAdminname(Admin2.getAdminname());
				return AdminDao.save(Admin2);
			}
		}
		return AdminDao.save(Admin);
	}

	

	@Override
	public List<Admin> findAdmins() {
		return AdminDao.findAll();
	}

	@Override
	public Admin findAdmin(long id) {
		return AdminDao.findById(id).orElse(null);
	}

	@Override
	public Admin updateAdmin(Admin Admin, long id) {
		Admin Admin2 = AdminDao.findById(id).orElse(null);
		Admin2.setPassword(Admin.getPassword());
		Admin2.setAdminname(Admin.getAdminname());
		Admin2.setEmail(Admin.getEmail());
		Admin2.setName(Admin.getName());
		return AdminDao.save(Admin2);
	}

	
}
