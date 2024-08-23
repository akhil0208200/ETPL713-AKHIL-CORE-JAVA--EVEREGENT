package com.evergent.corejava.WrapperClasses;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//jdk 1.44
		// primitive datatype
		int a=10;
		//auto boxing
		//Coverting primitive datatype to object this process called auto boxing
		Integer i1=new Integer(a); //Integer is class ,i1 is a object of class Integer
		System.out.println(i1);
		//here we are converting object to primitive data type called auto unboxing
		int a1=i1.intValue();
		
		System.out.println(a1);


	}

}
