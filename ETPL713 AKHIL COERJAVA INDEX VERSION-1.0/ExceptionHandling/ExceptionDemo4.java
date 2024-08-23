package com.evergent.corejava.ExceptionHandling;

public class ExceptionDemo4 {
			String name="null";
			int k=0;
		public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("End");
		}
	/*	catch(Exception e) {    here we need to follow hierarchial of exception
			System.out.println(e);
		}*/
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ExceptionDemo4 ed2=new ExceptionDemo4();
			ed2.myData();
	}
}
//try followed by either catch block or finally block


