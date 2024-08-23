package com.evergent.corejava.Static;

public class StaticDemo5 {
	static {
		System.out.println("This is Static Block");
	}
	static String name="Raju";
	static public void myData() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name);
		myData();

	}

}
//here static block executes before the main method
