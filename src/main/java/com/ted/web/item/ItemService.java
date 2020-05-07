package com.ted.web.item;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface ItemService {

	List<Item> findAll();

	Item findOne(String lostId);

}
