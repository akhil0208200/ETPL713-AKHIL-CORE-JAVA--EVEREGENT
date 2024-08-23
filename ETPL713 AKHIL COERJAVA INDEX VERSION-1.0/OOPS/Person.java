package com.evergent.corejava.OOPS;

public class Person {

	
		// TODO Auto-generated method stub
		String name="Akhil";
		int age=22;
		String address="Hyderabad";
		public void display() {
			System.out.print(name+" "+age+" "+address);
		}
       public static void main(String[] args) {
    	   Person p=new Person();
    	   p.display();
	}

}
