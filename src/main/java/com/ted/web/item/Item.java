package com.ted.web.item;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
public class Item {
	private String lostId, lostName, lostDate, lostClass, lostLocation;
	
	public String toString() {
		return String.format("%s,%s,%s,%s,%s",
				lostId,lostName,lostDate,lostClass,lostLocation);
	}
}
