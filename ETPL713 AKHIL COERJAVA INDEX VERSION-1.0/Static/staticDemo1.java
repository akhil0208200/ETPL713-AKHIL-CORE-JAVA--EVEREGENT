package com.evergent.corejava.Static;

public class staticDemo1 {
 static String cname="India";
 
   static public void myData() {
	  System.out.println("myData");
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(staticDemo1.cname);
		staticDemo1.myData();

	}

}

/*   we can acess Static methods and variables without creating objets of the class      */
