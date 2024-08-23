package com.evergent.corejava.ExceptionHandling;

public class ExceptionDemo5 {
			String name="null";
			int k=0;
		public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("End");
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		finally //Finally is a block if exception is occure or not finally block will be executed
		{
			System.out.println("Finally block always executes");
		}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ExceptionDemo5 ed2=new ExceptionDemo5();
			ed2.myData();
	}
}


