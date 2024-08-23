package com.evergent.corejava.Static;

public class Person {
	  static String name="Raju";
	int age=22;
	String address="Hyderabad";
	public void display() {
		name="welcome";
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Address :"+address);
	}

	public static void main(String[] args) {
		Person p1=new Person();
		p1.display();
		Person p2=new Person();
		p2.display();
	System.out.println(Person.name);

	}

}
