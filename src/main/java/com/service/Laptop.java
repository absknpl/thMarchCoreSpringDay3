package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Laptop {
	private String model;
	private String year;
	private String color;
	private int price;	
	
	@Autowired             //byName
	@Qualifier("charger2")  //it is used with @Autowired. We can not use it without @Autowired
	Charger charger;   //DI
	
	
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String model, String year, String color, int price, Charger charger) {
		super();
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.charger = charger;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", year=" + year + ", color=" + color + ", price=" + price + ", charger="
				+ charger + "]";
	}
	
	
	

}
