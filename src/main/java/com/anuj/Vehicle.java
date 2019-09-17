package com.anuj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle1")
public class Vehicle {

	@Id
	private String regno;
	private String brand;
	private String model;
	private int price;
	
	@ManyToOne
	private Employee emp;
	
	
	
	public Vehicle() {
		super();
	}



	public Vehicle(String regno) {
		super();
		this.regno = regno;
	}

	


	public Vehicle(String regno, String brand, String model, int price) {
		super();
		this.regno = regno;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}



	public Vehicle(String regno, String brand, String model, int price, Employee emp) {
		super();
		this.regno = regno;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.emp = emp;
	}



	public String getRegno() {
		return regno;
	}



	public void setRegno(String regno) {
		this.regno = regno;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Employee getEmp() {
		return emp;
	}



	public void setEmp(Employee emp) {
		this.emp = emp;
	}



	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", brand=" + brand + ", model=" + model + ", price=" + price + ", emp=" + emp
				+ "]";
	}



	
	
}
