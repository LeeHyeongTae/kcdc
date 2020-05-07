package com.ted.web.item;

import java.util.List;

public interface ItemDao {

	List<Item> selectAll();

	Item selectOne(String lostId);

}
