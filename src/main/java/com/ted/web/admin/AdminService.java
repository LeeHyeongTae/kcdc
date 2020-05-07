package com.ted.web.admin;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface AdminService {
	
	public boolean register(Admin admin);
	
	public List<Admin> findAll();
	
	public Admin findOne(String employNumber);
	
	public boolean modify(Admin admin);
	
	public boolean remove(Admin admin);

	public boolean login(Admin admin);
}
