package com.mshop.restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue
	private Long id;
	private String medicineName;
	private Long medicineCost;
	private Long medicineQuantity;
	
	
	
	
	public Product() {
		super();
	}
	public Product(Long id, String medicineName, Long medicineCost, Long medicineQuantity) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.medicineCost = medicineCost;
		this.medicineQuantity = medicineQuantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public Long getMedicineCost() {
		return medicineCost;
	}
	public void setMedicineCost(Long medicineCost) {
		this.medicineCost = medicineCost;
	}
	public Long getMedicineQuantity() {
		return medicineQuantity;
	}
	public void setMedicineQuantity(Long medicineQuantity) {
		this.medicineQuantity = medicineQuantity;
	}

	
	
	

}