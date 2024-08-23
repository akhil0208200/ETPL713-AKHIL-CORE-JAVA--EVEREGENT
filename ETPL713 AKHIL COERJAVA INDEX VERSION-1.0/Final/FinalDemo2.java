package com.evergent.corejava.Final;

final class MyClass{
	final public void show() {
		System.out.println("All Prooducts");
	}
}

public class FinalDemo2  {
	public void show1() {
		System.out.println("Hello Products");
	}

	public static void main(String[] args) {
		FinalDemo2 fd=new FinalDemo2();
		fd.show1();
		MyClass mc=new MyClass();
		mc.show();

	}

}
//near object creation we 
/*
Multiple markers at this line
- Cannot override the final method from MyClass
- overrides com.evergent.corejava.Final.MyClass.show  
*/