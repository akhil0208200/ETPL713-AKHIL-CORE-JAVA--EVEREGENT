package com.evergent.corejava.Strings;

public class MyPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImmutable p=new PersonImmutable("Raju",25);//here we are passing the fianl variable values via constructor
		System.out.println("Name:"+p.myName());
		System.out.println("Age:"+p.myAge());

	}

}
