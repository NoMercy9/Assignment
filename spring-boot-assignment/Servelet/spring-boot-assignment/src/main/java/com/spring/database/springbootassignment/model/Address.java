package com.spring.database.springbootassignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "pincode")
	private String pincode;
	
	@Column(name = "city")
	private String city;
	
	public Address() {
		
	}
	
	public Address(String street,String city,String pincode) {
		this.street= street;
		this.city = city;
		this.pincode = pincode;
	}
	
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", pincode=" + pincode + ", city=" + city + "]";
	}

	
}
