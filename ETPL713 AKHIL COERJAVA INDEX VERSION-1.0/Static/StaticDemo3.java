package com.evergent.corejava.Static;

public class StaticDemo3 {
	static String cname="India";
	String name="Raju";
	static public void myData() {
		//show();
		//cannot make a static reference to the non-static method show() from the type StaticDemo3
		System.out.println("My Data");
	}
	public void show() {
		System.out.println("Non Static Method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		myData();

	}

}

/* In This Program we Cannot Acess The Non Static method inside the static Methods
 * 
 */