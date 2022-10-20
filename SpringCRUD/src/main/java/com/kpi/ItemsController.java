package com.kpi;

import java.util.List;
import java.util.Map;

import javax.persistence.Id;

import org.junit.validator.PublicClassValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kpi.Services.ItemsService;

@RestController
public class ItemsController {
	
	@Autowired
	ItemsService itemsService;
	// ItemsRepository itemsRepository;
	
	/* @GetMapping("/topfour")
	public List<Items> getTopFour() {
		return itemsRepository.findByIdLessThan(4);
	} */
	
	
	@GetMapping("/productName/{product_name}")
	public Items getProductByName(@PathVariable String product_name) {
		return itemsService.getProducts(product_name);
	}
	
	@GetMapping("/byid/{id}")
	public Items getById(@PathVariable int id) {
		return itemsService.getId(id);
	}
	

}
