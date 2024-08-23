package com.evergent.corejava.OOPS;
class A{
	public void run() {
		System.out.println("Class A");
	}
}
public class MethodOverriding extends A {
	public void run() {
		super.run();// super is a keyword used to call super class Methods
		System.out.println("Class B");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding mo=new MethodOverriding();
		mo.run();

	}

}
