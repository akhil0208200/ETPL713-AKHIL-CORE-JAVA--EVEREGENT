package com.evergent.corejava.ExceptionHandling;

public class ExceptionDemo8throws {
	String name=null;
	public void myData() throws NullPointerException
	{
	
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("End");
		
	}
	public void myInfo() throws NullPointerException{
		myData();
		System.out.println("My Info Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ExceptionDemo8throws ed=new ExceptionDemo8throws();
		ed.myInfo();
		}
		catch(Exception e) {
			System.out.println("I Can Handle:"+e);
		}
	}

}
