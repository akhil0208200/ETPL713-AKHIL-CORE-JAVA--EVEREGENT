package com.evergent.corejava.Practice;
class Employee{
	String name;
	Employee(String name){
		this.name=name;
		System.out.println("Name:"+name);
	}
}

public class Super extends Employee{
	String name;
	int age;
	String add;
	Super(String name,int age,String add){
		super(name);
		this.age=age;
	    this.add=add;
	}
	public void display() {
		System.out.println("Age:"+age);
		System.out.println("Address:"+add);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s=new Super("Raju",22,"Hyderabd");
		s.display();

	}

}
