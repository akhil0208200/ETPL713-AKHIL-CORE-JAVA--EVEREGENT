package com.evergent.corejava.Constructors;

public class Practise  {
	int age;
	String name;
	
	Practise() //Default Constructor
	{
		System.out.println("Hello world");
	}
	Practise(int age){
		this.age=age; //this is a keyword always used to point the instance variables
		System.out.println("Age:"+age);
	}
	
	Practise(int age,String name) //Parameterized Costructor
	{
		this(age); // this is a  keyword we can call one constructor to other constructor
		//super is keyword we can call super class constructor to sub class constructor
		this.name=name;
		System.out.println("Name :"+name);
		System.out.println("Age:"+age);
	}
	void Practise()//it is not a constructor instead it is method we need to Object Reference to call this method
	{
		System.out.println("Not A Constructor Becaue of Void");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Practise();
		new Practise(22,"Raju");
		Practise p=new Practise();
		p.Practise();

	}

}
