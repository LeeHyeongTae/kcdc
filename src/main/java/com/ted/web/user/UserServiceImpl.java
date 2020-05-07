package com.ted.web.user;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired UserDao userDao;
	
	@Override
	public boolean add(User user) {
		boolean returnValue = false;
		if(user != null) {
			userDao.insert(user);
			returnValue = true;
		}
		return returnValue;
	}

	@Override
	public List<User> findAll() {
		return userDao.selectAll();
	}

	@Override
	public User findOne(String userid) {
		return userDao.selectOne(userid);
	}

	@Override
	public boolean modify(User user) {
		userDao.update(user);
		return false;
	}

	@Override
	public boolean remove(User user) {
		userDao.delete(user);
		return false;
	}

	
}