package com.evergent.corejava.Final;

final class My{
	final public void show() {
		System.out.println("All Prooducts");
	}
}

public class FinalDemo3  {
	public void show1() {
		System.out.println("Hello Products");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo3 fd=new FinalDemo3();
		fd.show1();
		My mc=new My();
		mc.show();

	}
}
/*
Multiple markers at this line
- Cannot override the final method from MyClass
- overrides com.evergent.corejava.Final.MyClass.show  
*/