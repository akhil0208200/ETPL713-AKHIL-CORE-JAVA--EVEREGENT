package com.evergent.corejava.ExceptionHandling;

public class ExceptionDemo3 {
			String name="null";
			int k=2;
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
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ExceptionDemo3 ed2=new ExceptionDemo3();
			ed2.myData();
	}
}
//if our class having 2 exceptions ,developer should be handle 1st exception then
//after 2nd exception should be handled

