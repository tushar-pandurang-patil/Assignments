package com.assignments;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.acceptDetails();
		student.displayDetails();
		
		Student student1 = new Student();
		student1.acceptDetails();
		student1.displayDetails();
		
		
		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle2 = new Vehicle();
		Vehicle vehicle3 = new Vehicle();
		Vehicle vehicle4 = new Vehicle();
		vehicle1.acceptDetails("Tata","Nexon");
		vehicle2.acceptDetails("Tata",100000,"Tiago");
		vehicle3.acceptDetails("Suzuki","Dzire",2023);
		vehicle4.acceptDetails("Toyota","Fortuner",2021,2450000);
		
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();
		employee1.acceptDetails("Sumit",100120.34);
		employee1.displayDetails();
		employee2.acceptDetails("Tushar",123,10000.12);
		employee2.displayDetails();
		employee3.acceptDetails("Uddesh",124);
		employee3.displayDetails();
		employee4.acceptDetails(125,121345.24);
		employee4.displayDetails();
		employee5.acceptDetails();
		employee5.displayDetails();
	}

}
