package com.evergent.corejava.Practice;

public class Person {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PersonImmutable p=new PersonImmutable("Raju",30);
			System.out.println("Name:"+p.myName());
			System.out.println("Age:"+p.myAge());

		}

	}


