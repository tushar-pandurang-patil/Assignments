package com.assignments;

import java.util.Scanner;

public class Student {
	private String name;
	private int rollNo;
	private int classNo;
	private int marks;
	
	void acceptDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----Student details----");
		System.out.print("Enter Name : ");
		this.name= sc.nextLine();
		System.out.print("Enter Roll No. : ");
		this.rollNo= sc.nextInt();
		System.out.print("Enter Class : ");
		this.classNo= sc.nextInt();
		System.out.print("Enter Marks : ");
		this.marks= sc.nextInt();
	}
	
	void displayDetails() {
		System.out.println("----Entered Student details----");
		System.out.println("Name : "+this.name);
		System.out.println("Roll no. : "+this.rollNo);
		System.out.println("Class : "+this.classNo);
		System.out.println("Marks : "+this.marks);
	}
}
