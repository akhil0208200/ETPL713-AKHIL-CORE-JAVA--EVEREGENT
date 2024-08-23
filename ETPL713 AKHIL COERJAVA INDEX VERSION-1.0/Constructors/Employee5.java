package com.evergent.corejava.Constructors;

public class Employee5 {
	int age;
	String name;
	double sal;
	Employee5(){
		System.out.println("Default Constructor");
	}
	Employee5(int age){
		this.age=age;
	}
	Employee5(int age,String name,double sal){
		this(age);
		this.name=name;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Employee Age :"+age);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Salary :"+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee5();
		Employee5 emp5=new Employee5(22,"Raj",50000);
		emp5.display();

	}

}
//using this keyword we can call one Constructor to other Constructor
