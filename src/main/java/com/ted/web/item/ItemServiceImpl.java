package com.ted.web.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	ItemDao lostDao;
	
	@Override
	public List<Item> findAll() {
		return lostDao.selectAll();
	}

	@Override
	public Item findOne(String lostId) {
		return lostDao.selectOne(lostId);
	}

}
