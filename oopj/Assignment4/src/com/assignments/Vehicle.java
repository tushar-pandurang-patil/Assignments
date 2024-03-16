package com.assignments;


public class Vehicle {
	private String company;
	private String model;
	private int makeYear;
	private int cost;
	
	void acceptDetails(String company, String model, int makeYear, int cost) {
		this.company=company;
		this.model=model;
		this.makeYear=makeYear;
		this.cost=cost;
		System.out.println("----Car Details----");
		System.out.println("Company Name: "+this.company);
		System.out.println("Model: "+this.model);
		System.out.println("Year of Manufacturing: "+this.makeYear);
		System.out.println("Cost: "+this.cost);
	}
	
	void acceptDetails(String company, String model) {
		this.company=company;
		this.model=model;
		System.out.println("----Car Details----");
		System.out.println("Company Name: "+this.company);
		System.out.println("Model: "+this.model);
	}
	
	void acceptDetails(String company, String model, int makeYear) {
		this.company=company;
		this.model=model;
		this.makeYear=makeYear;
		System.out.println("----Car Details----");
		System.out.println("Company Name: "+this.company);
		System.out.println("Model: "+this.model);
		System.out.println("Year of Manufacturing: "+this.makeYear);
	}
	
	void acceptDetails(String company, int cost, String model) {
		this.company=company;
		this.model=model;
		this.cost=cost;
		System.out.println("----Car Details----");
		System.out.println("Company Name: "+this.company);
		System.out.println("Cost: "+this.cost);
		System.out.println("Model: "+this.model);
	}

}
