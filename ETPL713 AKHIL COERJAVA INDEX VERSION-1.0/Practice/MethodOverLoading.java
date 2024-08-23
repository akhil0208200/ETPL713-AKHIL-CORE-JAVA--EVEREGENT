package com.evergent.corejava.Practice;

public class MethodOverLoading {
	public void method() {
		System.out.println("Normal Method");
	}
    
	public void method(String name,int age) {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	public void method(String name,int age,String pass) {
		System.out.println("Name :"+name);
		System.out.println("Age:"+age);
		System.out.println("Password:"+pass);
	}
	public void method(int Phno,String Capcha) {
		System.out.println("Phone no:"+Phno);
		System.out.println("Capcha:"+Capcha);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading mo=new MethodOverLoading();
		mo.method();
		mo.method("Raju",22);
		mo.method("Raju",22,"Raj@123");
		mo.method(12345,"TbcyKf");

	}

}
