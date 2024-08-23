package com.evergent.corejava.ObjectClassMethods;

public class PersonData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Raju",30);
		System.out.println(p); //method-3 we are Overriding the toString()method
		//System.out.println(p.hashCode());
		
		/*
		 * method-2
		System.out.println(p.myName());
		System.out.println(p.myAge());
		
		*/
		// method-1  p.show();

	}

}
