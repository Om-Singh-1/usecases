package com.kpi.controller;

import java.util.List;

import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kpi.entity.Insurance;
import com.kpi.service.InsuranceService;

@RestController
public class InsuranceController {
	
	
	@Autowired
	InsuranceService service;
	
	
	@PostMapping("/addInsurance")
	public Insurance addInsurance(@RequestBody Insurance insurance) {
		
		return service.saveInsurance(insurance);
		
	}
	
	@PostMapping("/addInsurances")
	public List<Insurance> addInsurances(@RequestBody List<Insurance> insurances) {
		
		return service.saveInsurances(insurances);
		
	}
	
	@GetMapping("/insurance")
	public List<Insurance> getInsurances() {
		
		return service.getInsurances();
		
	}
	
	@GetMapping("/insuranceById/{id}")
	public Insurance getInsuranceById(@PathVariable int id) {
		
		return service.getInsuranceById(id);
		
	}
	
	@GetMapping("/insurance/{name}")
	public Insurance getInsuranceByName(@PathVariable String name) {
		
		return service.getInsuranceByName(name);
		
	}
	
	@PutMapping("/update")
	public Insurance updateInsurance(@RequestBody Insurance insurance) {
		
		return service.updateInsurance(insurance);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteInsurance(@PathVariable int id) {
		
		return service.deleteInsurance(id);
		
	}
	

}
