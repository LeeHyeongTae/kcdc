package com.ted.web.admin;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
public class Admin {
	private String employNumber, name, password, 
	position, profile, email, phoneNumber, registerDate;
	
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s", 
				employNumber,password,name,position,profile,email,phoneNumber,registerDate);
	}
}