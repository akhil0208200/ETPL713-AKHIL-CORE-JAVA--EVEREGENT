package com.evergent.corejava.ExceptionHandling;

public class ExceptionDemo2 {
			String name=null;
		public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ExceptionDemo2 ed2=new ExceptionDemo2();
			ed2.myData();


	}
}
//All Exceptions are Executed while abnormal conditions only
//normal flow it wont execute any exception
//Once any exception occure in java code then the remainig code wont be executed
