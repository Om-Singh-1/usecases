package com.kpi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "insurance")
@Entity
public class Insurance {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String planStartDate;
	private String planEndDate;
	private String planName;
	private int insuredAmount;

}
