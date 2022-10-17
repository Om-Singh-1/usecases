package com.kpi;

import java.util.List;
import java.util.Map;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
	
	@Autowired
	ItemsRepository itemsRepository;
	
	
	@GetMapping("/topfour")
	public List<Items> getTopFour() {
		return itemsRepository.findByIdLessThan(4);
	}
	
	@GetMapping("/bottomfour")
	public List<Items> getBottomFour() {
		
		int count = (int) itemsRepository.count();
		return itemsRepository.findByIdLessThan(count);
		
	}
	

}
