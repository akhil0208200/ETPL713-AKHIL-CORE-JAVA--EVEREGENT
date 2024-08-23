package com.evergent.corejava.ExceptionHandling;

public class ExceptionDemo7 {
	String name=null;
	public void myData() throws NullPointerException {
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("End");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionDemo7 ed=new ExceptionDemo7();
			ed.myData();
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}

	}

}
