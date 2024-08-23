package com.evergent.corejava.Practice;
class A{
	public void show() {
		System.out.println("This is Super class");
	}
}
class B extends A{
	public void display() {
		System.out.println("This is also Super class");
	}
}

public class MultipleInheritance extends B {
	public void myData() {
		System.out.println("I am Sub Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance ml=new MultipleInheritance();
		ml.myData();
		ml.display();
		ml.show();

	}

}
