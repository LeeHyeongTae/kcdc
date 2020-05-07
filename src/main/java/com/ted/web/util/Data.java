package com.ted.web.util;

import java.io.File;

public enum Data {
	ADMINS, USERS;
	///Users/ihyeongtae/git/repository2/review/src/main/resources/static/resources/file
	@Override
	public String toString() {
		String path = "/Users"+File.separator+"ihyeongtae"+File.separator+"git"+File.separator+"repository2"+File.separator
				+"review"+File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"static"+File.separator
				+"resources"+File.separator+"file"+File.separator;
		switch(this) {
		case ADMINS: path = path.concat("admin_list.csv"); break;
		case USERS: path = path.concat("user_list.csv"); break;
		default:  break;
		}
	
		return path;
	}
}
