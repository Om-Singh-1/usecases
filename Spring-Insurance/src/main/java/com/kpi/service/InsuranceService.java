package com.kpi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpi.entity.Insurance;
import com.kpi.repository.InsuranceRepository;

@Service
public class InsuranceService {

	@Autowired
	private InsuranceRepository repository;
	
	public Insurance saveInsurance(Insurance insurance) {
		
		return repository.save(insurance);
		
	}
	
	public List<Insurance> saveInsurances(List<Insurance> insurances) {
		
		return repository.saveAll(insurances);
		
	}
	
	public List<Insurance> getInsurances() {
		
		return repository.findAll();
		
	}
	
	public Insurance getInsuranceById(int id) {
		
		return repository.findById(id).orElse(null);
		
	}
	
	public Insurance getInsuranceByName(String name) {
		
		return repository.findByName(name);
		
	}
	
	public String deleteInsurance(int id) {
		
		repository.deleteById(id);
		return "Insured Record deleted! " + id;
		
	}
	
	public Insurance updateInsurance(Insurance insurance) {
		
		Insurance existingInsurance = repository.findById(insurance.getId()).orElse(null);
		existingInsurance.setId(insurance.getId());
		existingInsurance.setName(insurance.getName());
		existingInsurance.setPlanStartDate(insurance.getPlanStartDate());
		existingInsurance.setPlanEndDate(insurance.getPlanEndDate());
		existingInsurance.setInsuredAmount(insurance.getInsuredAmount());
		
		return repository.save(existingInsurance);
		
	}
	
}
