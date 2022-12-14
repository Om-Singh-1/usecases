package com.kpi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private int amount;
	
	@Column(name = "product_name")
	private String productname;
	

}
