package com.ted.web.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/losts")
public class ItemController {
	@Autowired
	ItemService lostService;
	
	@GetMapping("")
	public List<Item> list(){
		return lostService.findAll();
	}
	
	@GetMapping("/{lostId}")
	public Item detail(@PathVariable String lostId) {
		return lostService.findOne(lostId);
	}

}
