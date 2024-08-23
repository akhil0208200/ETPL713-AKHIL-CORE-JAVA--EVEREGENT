package com.evergent.corejava.Static;

public class StaticDemo4 {
	static String cname="India";
	String name="Raju";
	static public void myData() {
		//show();
		//cannot make a static reference to the non-static method show() from the type StaticDemo3
		System.out.println("My Data");
	}
	public void show() {
		myData();
		System.out.println("This is Static variable:"+cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		myData();
		//StaticDemo4 sd=new StaticDemo4();
		//sd.show();
	}
}

/* In This Program we Can Acess The  Static methods 
 * and Static variables  inside the Non-static Methods
 */
 /* 
 */