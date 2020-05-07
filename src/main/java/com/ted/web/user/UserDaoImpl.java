package com.ted.web.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.review.web.util.Data;

@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public void insert(User user) {
		try {
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(
									new FileWriter(
									new File(Data.USERS.toString())));
			writer.write(user.toString());
			writer.newLine();
			writer.flush();
		} catch (Exception e) {
			System.out.println("save error");
		}
	}

	@Override
	public List<User> selectAll() {
		List<User> returnList = new ArrayList<>();
		List<String> list = new ArrayList<>();
		try {
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(
									new FileReader(
									new File(Data.USERS.toString())));
			String message = "";
			while((message = reader.readLine()) != null) {
				list.add(message);
			}
		} catch(Exception e) {
			System.out.println("read error");
		}
			User u = null;
			for(int i=0; i<list.size(); i++) {
				String[] arr = list.get(i).split(",");
				u = new User();
				u.setUserid(arr[0]);
				u.setPassword(arr[1]);
				u.setName(arr[2]);
				u.setSsn(arr[3]);
				u.setAddress(arr[4]);
				u.setProfile(arr[5]);
				u.setEmail(arr[6]);
				u.setPhoneNumber(arr[7]);
				u.setRegisterDate(arr[8]);
				returnList.add(u);
			}
		return returnList;
	}

	@Override
	public User selectOne(String userid) {
		List<User> userList = selectAll();
		User returnUser = null;
		for(User u : userList) {
			if(userid.equals(u.getUserid())) {
				returnUser = u;
				break;
			}
		}
		return returnUser;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

}
