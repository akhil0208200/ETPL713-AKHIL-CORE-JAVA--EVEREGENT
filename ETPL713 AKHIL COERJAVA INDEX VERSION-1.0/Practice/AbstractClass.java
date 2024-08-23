package com.evergent.corejava.Practice;

abstract class Sol{
	public Sol() {
		System.out.println("This is Abstract class Constructor");
	}
	abstract public void run();
	public void local() {
		System.out.println("This is Local Method");
	}
}

public class AbstractClass extends Sol{
	public void run() {
		System.out.println("Run Method");
	}
	public void show() {
		System.out.println("this is a local Method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass ab=new AbstractClass();
			ab.run();
			ab.show();
			ab.local();

	}

}
