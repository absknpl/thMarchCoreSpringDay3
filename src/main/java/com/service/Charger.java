package com.service;

public class Charger {
	private String model;
	private String year;
	private int price;
	
	public Charger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Charger(String model, String year, int price) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Charger [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	
	

}
