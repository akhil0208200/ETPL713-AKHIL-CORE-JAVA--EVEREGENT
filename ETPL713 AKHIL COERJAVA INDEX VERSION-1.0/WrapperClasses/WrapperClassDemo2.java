package com.evergent.corejava.WrapperClasses;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=100;
		Integer i2=new Integer(i1);
		//Integer i2=i1;
		int i3=i2.intValue();
		
		byte b=10;
		Byte b1=new Byte(b);
		byte b2=b1.byteValue();
		
		double d=799.89;
		Double d1=new Double(d);
		double d2=d1.doubleValue();
		
		System.out.println("int value is :"+i1);
		System.out.println("Integer value is :"+i2);
		System.out.println("Converting Intger val to int Val :"+i3);
		System.out.println();
		System.out.println("byte value is :"+b);
		System.out.println("Byte  value is :"+b1);
		System.out.println("Converting Byte val to byte Val :"+b2);
		System.out.println();
		System.out.println("double value is :"+d);
		System.out.println("Double  value is :"+d1);
		System.out.println("Converting Double val to double Val :"+d2);

	}

}
