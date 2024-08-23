package com.evergent.corejava.ObjectClassMethods;

public class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	
	public String toString() //here we are overriding the toString()Method 
	{
		return name+age;
	}
	
/* General Method
	public void show() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	*/
	/*
	// Method 2
	public String myName() {
		return name;
	}
	public int myAge(){
	return age;
	}
	
*/

}
