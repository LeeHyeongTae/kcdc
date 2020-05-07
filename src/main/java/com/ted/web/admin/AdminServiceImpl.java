package com.ted.web.admin;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService{
	@Autowired AdminDao adminDao;
	
	@Override
	public boolean register(Admin admin) {
		boolean returnValue = false;
		admin.setEmployNumber(createEmployNumber());
		admin.setPassword("1");
		admin.setRegisterDate(createCurrentDate());
		adminDao.insert(admin);
		return returnValue;
	}

	private String createCurrentDate() {
		return new SimpleDateFormat("yyyy-mm-dd").format(new Date());
	}

	private String createEmployNumber() {
		String startNum ="";
		for(int i=0; i<4; i++) {
			startNum += String.valueOf((int)(Math.random()*10));
		}
		return startNum;
	}

	@Override
	public List<Admin> findAll() {
		return adminDao.selectAll();
	}

	@Override
	public Admin findOne(String employNumber) {
		return adminDao.selectOne(employNumber);
	}

	@Override
	public boolean modify(Admin admin) {
		adminDao.update(admin);
		return false;
	}

	@Override
	public boolean remove(Admin admin) {
		adminDao.delete(admin);
		return false;
	}

	@Override
	public boolean login(Admin admin) {
		boolean returnValue = false;
		if(admin.getPassword().equals(adminDao.selectOne(admin.getEmployNumber()).getPassword())) {
			returnValue = true;
		}
		return returnValue;
	}

}
