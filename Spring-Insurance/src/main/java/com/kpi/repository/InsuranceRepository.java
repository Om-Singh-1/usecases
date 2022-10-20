package com.kpi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpi.entity.Insurance;

public interface InsuranceRepository extends JpaRepository<Insurance, Integer>{

	Insurance findByName(String name);
	
}
