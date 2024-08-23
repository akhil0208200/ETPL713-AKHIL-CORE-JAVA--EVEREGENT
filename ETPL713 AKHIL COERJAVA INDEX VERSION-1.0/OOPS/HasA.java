package com.evergent.corejava.OOPS;

public class HasA {
	public void fill() {
		System.out.println("Has-A program");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HasA a=new HasA();
		a.fill();
		Person p=new Person();
		p.display();

	}

}
