package com.evergent.corejava.Practice;

public class Statickeyword {
	static String name="Java";
	int age=20;
	static String address="hyderabad";
	public void disaplay() {
		name="wellcome";
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("address:"+address);
	}
	public static void main(String[] args) {
		Statickeyword sk=new Statickeyword();
		sk.disaplay();
		System.out.println(sk.name);
		
		Statickeyword sk1=new Statickeyword();
		System.out.println(sk1.name);
	}

}
