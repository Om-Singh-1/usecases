package com.kpi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpi.Items;
import com.kpi.ItemsRepository;

@Service
public class ItemsService {
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	public List<Items> list() {
		
		return itemsRepository.findAll();
		
	}
	
	public Items getProducts(String product_name) {
		return itemsRepository.findByProductname(product_name);
	}
	
	public Items getId(int id) {
		return itemsRepository.findById(id);
	}
	

}
