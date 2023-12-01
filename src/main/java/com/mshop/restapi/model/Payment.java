package com.mshop.restapi.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="_payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int paymentId;
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	//join column 3 tables
	//@JoinColumn(name = "order_id",referencedColumnName="id")
	//join 2 tables(another method) using two id
	@JoinTable(name="payment_product",joinColumns=@JoinColumn(name="payment_id"),inverseJoinColumns=@JoinColumn(name="product_id"))
	private List<Product> products;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	

	
	
	
}