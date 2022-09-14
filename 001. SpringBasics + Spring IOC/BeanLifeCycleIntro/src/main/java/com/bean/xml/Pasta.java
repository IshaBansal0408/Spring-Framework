package com.bean.xml;

public class Pasta {
	private double price;

	public Pasta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting the price of Pasta!");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pasta [price=" + price + "]";
	}
	
//	Life Cycle Methods
	public void init() {
		System.out.println("Preparation of pasta is initiated");
	}
	public void destroy() {
		System.out.println("The yummy Pasta has been eaten!");
	}

}
