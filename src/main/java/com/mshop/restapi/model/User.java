package com.mshop.restapi.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
    private String gender;
	private String medicine;
	private int price;
	@Column(name="address")
	private String address;
	private long phonenumber;
	private String username;
	private String email;
	private String password;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Payment payment;
	
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public User() {
		super();
	}
	public User(int id, String name, String gender, String medicine, int price, String address, long phonenumber,
			String username, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.medicine = medicine;
		this.price = price;
		this.address = address;
		this.phonenumber = phonenumber;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}