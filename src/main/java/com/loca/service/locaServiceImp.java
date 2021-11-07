package com.loca.service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.loca.dao.UserDao;

import com.loca.modal.User;


@Transactional
@Component
public class locaServiceImp implements locaService {

	

	@Autowired
	private UserDao UserDao;

	

	

	@Override
	public User loginUser(User User) {
		List<User> Users = UserDao.findAll();
		if (Users.size() == 0) {
			User.setAdmin(true);
		}

		for (User User2 : Users) {
			if (User.getUsername().equals(User2.getUsername())) {
				User2.setUsername(User2.getUsername());
				return UserDao.save(User2);
			}
		}
		return UserDao.save(User);
	}

	

	@Override
	public List<User> findUsers() {
		return UserDao.findAll();
	}

	@Override
	public User findUser(long id) {
		return UserDao.findById(id).orElse(null);
	}

	@Override
	public User updateUser(User User, long id) {
		User User2 = UserDao.findById(id).orElse(null);
		User2.setPassword(User.getPassword());
		User2.setUsername(User.getUsername());
		User2.setEmail(User.getEmail());
		User2.setName(User.getName());
		return UserDao.save(User2);
	}

	
}
