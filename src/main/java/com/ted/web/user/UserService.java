package com.ted.web.user;

import java.util.List;

public interface UserService {

	public boolean add(User user);

	public List<User> findAll();

	public User findOne(String userid);

	public boolean modify(User user);

	public boolean remove(User user);

}