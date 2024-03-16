package com.assignments;

import java.util.Scanner;

public class Employee {
	private String name;
	private int empID;
	private double salary;
	
	void acceptDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----Employee details----");
		System.out.print("Enter Name : ");
		this.name= sc.nextLine();
		System.out.print("Enter Employee ID. : ");
		this.empID= sc.nextInt();
		System.out.print("Enter Salary: ");
		this.salary= sc.nextDouble();
	}
	
	void acceptDetails(String name, int empID, double salary) {
		this.name=name;
		this.empID=empID;
		this.salary=salary;
	}
	
	void acceptDetails(String name, int empID) {
		this.name=name;
		this.empID=empID;
	}
	
	void acceptDetails(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}

	void acceptDetails(int empID, double salary) {
		this.empID=empID;
		this.salary=salary;
	}
	
	void displayDetails() {
		System.out.println("----Entered Employee details----");
		System.out.println("Name : "+this.name);
		System.out.println("Employee ID. : "+this.empID);
		System.out.println("Salary : "+this.salary);
	}

}
