package com.evergent.corejava.OOPS;

public class MethodOverloading {
	public void logindetails() {
		System.out.println("Normal Method");
	}
	public void logindetails(String name,String pass) {
		System.out.println("Name is :"+name);
		System.out.println("Password is:"+pass);
	}
	public void logindetails(int mobile,String pass) {
		System.out.println("mobile is :"+mobile);
		System.out.println("Password is:"+pass);
	}
	public void logindetails(String name,String pass,String capcha) {
		System.out.println("Name is :"+name);
		System.out.println("Password is:"+pass);
		System.out.println("Capcha is :"+capcha);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ml=new MethodOverloading();
		ml.logindetails();
		ml.logindetails("Akhil","Akhil123");
		ml.logindetails(12345566, "Akhil335");
		ml.logindetails("Akhil", "Akhil456", "ASDRFFG");

	}

}
