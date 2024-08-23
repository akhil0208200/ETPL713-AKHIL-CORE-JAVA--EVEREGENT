package com.evergent.corejava.ExceptionHandling;

public class ExceptionDemo1 {
	String name=null;
	public void myData() {
	try {
		System.out.println("One");
		System.out.println(name.length());
		System.out.println("End");
	}
	catch(NullpointerException e) {
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo ed2=new ExceptionDemo1
		

	}
}
